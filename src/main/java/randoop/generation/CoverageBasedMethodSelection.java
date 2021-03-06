package randoop.generation;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import org.plumelib.util.CollectionsPlume;
import randoop.operation.CallableOperation;
import randoop.operation.EnumConstant;
import randoop.operation.FieldGet;
import randoop.operation.FieldSet;
import randoop.operation.MethodCall;
import randoop.operation.TypedOperation;
import randoop.sequence.Sequence;
import randoop.types.ClassOrInterfaceType;
import randoop.util.SimpleArrayList;

public class CoverageBasedMethodSelection implements TypedOperationSelector {

  class Pair {
    TypedOperation operation;
    Double score = 0.5;
    long consumedTime = 0;
    long lastSelectedTime = 0;

    Pair(TypedOperation operation, long curTime) {
      this.operation = operation;
      this.lastSelectedTime = curTime;
    }

    Pair(TypedOperation operation, long consumedTime, Double curScore, long lastSelectedTime) {
      this.operation = operation;
      this.consumedTime = consumedTime;
      this.score = curScore;
      this.lastSelectedTime = lastSelectedTime;
    }
  }

  private final PriorityQueue<Pair> queue =
      new PriorityQueue<>(
          new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
              if (o2.score - o1.score > 0) return 1;
              else return 0;
            }
          });

  private final CoverageTracker coverageTracker;

  /**
   * Map from methods under test to their weights. These weights are dynamic and depend on branch
   * coverage.
   */
  //  private final Map<TypedOperation, Double> methodWeights = new HashMap<>();

  /**
   * Map from methods under test to the number of times they have been recently selected by the
   * {@link randoop.generation.ForwardGenerator} to construct a new sequence. This map is cleared
   * every time branch coverage is recomputed.
   */
  private final Map<TypedOperation, Integer> methodSelectionCounts = new HashMap<>();

  /**
   * Map from methods under test to the total number of times they have ever been successfully
   * invoked by the {@link randoop.generation.AbstractGenerator}. The integer value for a given
   * method is non-decreasing during a run of Randoop.
   */
  private final Map<TypedOperation, Integer> methodInvocationCounts = new HashMap<>();

  /**
   * List of operations, identical to {@link randoop.generation.ForwardGenerator}'s operation list.
   * Used for making random, weighted selections for a method under test.
   */
  private final SimpleArrayList<TypedOperation> operationSimpleList;

  /**
   * Time interval, in milliseconds, at which to recompute weights. The name "t" and the specified
   * value are both from the GRT paper.
   */
  //  private static final long t = 500;

  /** {@code System.currentTimeMillis()} when branch coverage was last updated. */
  //  private long lastUpdateTime = 0;

  /**
   * Branch coverage is recomputed after this many successful invocations (= this many new tests
   * were generated).
   */
  //  private static final int branchCoverageInterval = 100;

  //  /** The total number of successful invocations of all the methods under test. */
  private int totalSuccessfulInvocations = 0;

  /**
   * Maximum number of times any method under test has been successfully invoked. This value is
   * initialized to 1 because it is used as the denominator of a division in computing a method's
   * weight. The name is from the GRT paper, which calls this quantity "maxSucc(M)".
   */
  private int maxSuccM = 1;

  /**
   * The total weight of all the methods that are under test. This is used by {@link Randomness} to
   * randomly select an element from a list of weighted elements.
   */
  //  private double totalWeightOfMethodsUnderTest = 0;

  /**
   * Initialize Bloodhound. Branch coverage information is initialized and all methods under test
   * are assigned a weight based on the weighting scheme defined by GRT's description of Bloodhound.
   *
   * @param operations list of operations under test
   * @param classesUnderTest set of classes under test
   */
  public CoverageBasedMethodSelection(
      List<TypedOperation> operations, Set<ClassOrInterfaceType> classesUnderTest) {
    this.operationSimpleList = new SimpleArrayList<>(operations);
    this.coverageTracker = new CoverageTracker(classesUnderTest);

    for (TypedOperation operation : operationSimpleList) {
      queue.offer(new Pair(operation, System.currentTimeMillis()));
    }
    // Compute an initial weight for all methods under test. We also initialize the uncovered ratio
    // value of all methods under test by updating branch coverage information. The weights for all
    // methods may not be uniform in cases where we have methods with "zero" branches and methods
    // with non-"zero" branches. This initialization depends on lastUpdateTime being initialized to
    // zero.
    //    updateBranchCoverageMaybe();
  }

  /**
   * Selects a method under test for the {@link randoop.generation.ForwardGenerator} to use to
   * construct a new sequence. A method under test is randomly selected with a weighted probability.
   *
   * @return the chosen {@code TypedOperation} for the new sequence
   */
  @Override
  public TypedOperation selectOperation() {
    if (queue.isEmpty()) return null;

    Pair selectedPair = queue.poll();
    TypedOperation selectedOperation = selectedPair.operation;

    // Periodically collect branch coverage and recompute weights for all methods under test.
    //    updateBranchCoverageMaybe();

    // Make a random, weighted choice for the next method.
    //    TypedOperation selectedOperation =
    //        Randomness.randomMemberWeighted(
    //            operationSimpleList, methodWeights, totalWeightOfMethodsUnderTest);

    // Update the selected method's selection count and recompute its weight.
    CollectionsPlume.incrementMap(methodSelectionCounts, selectedOperation);
    updateWeight(selectedPair);

    return selectedOperation;
  }

  /**
   * When an interval is reached, the branch coverage information for all methods under test is
   * updated and the weight for every method under test is recomputed.
   *
   * <p>There are two choices for when to update branch coverage information:
   *
   * <ul>
   *   <li>Time: branch coverage is updated when more than {@code t} milliseconds have elapsed since
   *       branch coverage was last updated. This is GRT's approach and is the default. It makes
   *       Randoop non-deterministic.
   *   <li>Count of successful invocations: branch coverage is updated after every {@code
   *       branchCoverageInteral} successful invocations (of any method under test).
   * </ul>
   */
  //  private void updateBranchCoverageMaybe() {
  //    boolean shouldUpdateBranchCoverage;
  //
  //    switch (GenInputsAbstract.bloodhound_update_mode) {
  //      case TIME:
  //        long currentTime = System.currentTimeMillis();
  //        shouldUpdateBranchCoverage = currentTime - lastUpdateTime >= t;
  //
  //        // Update the last update time if we decide that it's time to update branch coverage
  //        // information.
  //        if (shouldUpdateBranchCoverage) {
  //          lastUpdateTime = currentTime;
  //        }
  //        break;
  //      default:
  //        throw new RandoopBug(
  //            "Unhandled value for bloodhound_update_mode: "
  //                + GenInputsAbstract.bloodhound_update_mode);
  //    }
  //
  //    if (shouldUpdateBranchCoverage) {
  //      if (GenInputsAbstract.bloodhound_logging) {
  //        System.out.println("Updating branch coverage information.");
  //      }
  //
  //      methodSelectionCounts.clear();
  //      coverageTracker.updateBranchCoverageMap();
  //      updateWeightsForAllOperations();
  //      logMethodWeights();
  //    }
  //  }

  /** For debugging, print all method weights to standard output. */
  //  private void logMethodWeights() {
  //    if (GenInputsAbstract.bloodhound_logging) {
  //      System.out.println("Method name: method weight");
  //      for (TypedOperation typedOperation : new TreeSet<>(methodWeights.keySet())) {
  //        System.out.println(typedOperation.getName() + ": " + methodWeights.get(typedOperation));
  //      }
  //      System.out.println("--------------------------");
  //    }
  //  }

  /**
   * Computes and updates weights in {@code methodWeights} map for all methods under test.
   * Recomputes the {@code totalWeightOfMethodsUnderTest} to avoid problems with round-off error.
   */
  //  private void updateWeightsForAllOperations() {
  ////    double totalWeight = 0;
  //    for (TypedOperation operation : operationSimpleList) {
  //        updateWeight(operation);
  //    }
  ////    totalWeightOfMethodsUnderTest = totalWeight;
  //  }

  /**
   * Recompute weight for a method under test. A method under test is assigned a weight based on a
   * weighted combination of
   *
   * <ul>
   *   <li>the number of branches uncovered and
   *   <li>the ratio between the number of times this method has been recently selected and the
   *       maximum number of times any method under test has been successfully invoked.
   * </ul>
   *
   * The weighting scheme is based on Bloodhound in the Guided Random Testing (GRT) paper.
   *
   * <p>
   *
   * @param selectedPair selected pair in queue
   * @return the updated weight for the given operation
   */
  private double updateWeight(Pair selectedPair) {
    // Remove type arguments, because Jacoco does not include type arguments when naming a method.

    TypedOperation operation = selectedPair.operation;

    String methodName = operation.getName().replaceAll("<.*>\\.", ".");

    // System.out.println("Enter coverage tracker:");
    // Corresponds to uncovRatio(m) in the GRT paper.
    Double uncovRatio = coverageTracker.getBranchCoverageForMethod(methodName);

    if (uncovRatio == null) {
      // Default to 0.5 for methods with no coverage information. The GRT paper does not mention
      // how methods with no coverage information are handled. This value was chosen based on
      // the reasoning that methods with no coverage information should still be given a reasonable
      // chance at being selected. A more optimal value could be determined empirically.
      // This is the case for the following methods under test:
      // - Object.<init> and Object.getClass, which Randoop always includes as methods under test.
      // - Getter and setter operations for public member variables, which Randoop synthesizes.
      // - Abstract methods and interface methods.
      // - Methods defined in abstract classes.
      // - Inherited methods, which aren't overridden in the calling class.
      // - Enum constants.
      String operationName = operation.getName();
      CallableOperation callableOperation = operation.getOperation();

      boolean isAbstractMethod = false;
      boolean isSyntheticMethod = false;
      boolean isFromAbstractClass = false;
      if (callableOperation instanceof MethodCall) {
        Method method = ((MethodCall) callableOperation).getMethod();
        isAbstractMethod = Modifier.isAbstract(method.getModifiers());
        isSyntheticMethod = method.isSynthetic();
        isFromAbstractClass = Modifier.isAbstract(method.getDeclaringClass().getModifiers());
      }

      boolean isGetterMethod = callableOperation instanceof FieldGet;
      boolean isSetterMethod = callableOperation instanceof FieldSet;
      boolean isEnumConstant = callableOperation instanceof EnumConstant;

      boolean isExpectedToHaveNoCoverage =
          isAbstractMethod
              || isGetterMethod
              || isSetterMethod
              || isEnumConstant
              || isSyntheticMethod
              || isFromAbstractClass
              || operationName.equals("java.lang.Object.<init>")
              || operationName.equals("java.lang.Object.getClass");
      //      if (!isExpectedToHaveNoCoverage) {
      //        System.err.println(
      //            "The method " + methodName + " is expected to have coverage info but has
      // none.");
      //      }
      //      assert isExpectedToHaveNoCoverage;
      uncovRatio = 0.5;
    }

    // The number of successful invocations of this method. Corresponds to "succ(m)" in the GRT
    // paper.
    //    Integer succM = methodInvocationCounts.get(operation);
    //    if (succM == null) {
    //      succM = 0;
    //    }

    // Corresponds to w(m, 0) in the GRT paper.
    //    double wm0 = alpha * uncovRatio + (1.0 - alpha) * (1.0 - (succM.doubleValue() /
    // maxSuccM));

    // Corresponds to w(m, k) in the GRT paper.
    //    double wmk;
    // In the GRT paper, "k" is the number of times this method was selected since the last update
    // of branch coverage. It is reset to zero every time branch coverage is recomputed.
    //    Integer k = methodSelectionCounts.get(operation);
    //    if (k == null) {
    //      wmk = wm0;
    //    } else {
    //      // Corresponds to the case where k >= 1 in the GRT paper.
    //      double val1 = (-3.0 / Math.log(1.0 - p)) * (Math.pow(p, k) / k);
    //      double val2 = 1.0 / Math.log(operationSimpleList.size() + 3.0);
    //      wmk = Math.max(val1, val2) * wm0;
    //    }

    // Retrieve the weight from the methodWeights map if it exists. Otherwise, default to zero.

    //    Double prevScore = selectedPair.score;
    long currentTime = System.currentTimeMillis();
    long curConsumedTime = currentTime - selectedPair.lastSelectedTime + selectedPair.consumedTime;
    Double curScore = uncovRatio * (curConsumedTime / 1000);
    queue.offer(new Pair(operation, curConsumedTime, curScore, currentTime));

    // Update the contribution of this method to the total weight of all methods under test.
    //    totalWeightOfMethodsUnderTest -= existingWeight;
    //    totalWeightOfMethodsUnderTest += wmk;
    return curScore;
  }

  /**
   * Increments the number of times a method under test was successfully invoked.
   *
   * @param operation the method under test that was successfully invoked
   */
  public void incrementSuccessfulInvocationCount(TypedOperation operation) {
    totalSuccessfulInvocations += 1;
    if (!methodInvocationCounts.keySet().contains(operation)) {
      methodInvocationCounts.put(operation, 0);
    }
    int numSuccessfulInvocations = CollectionsPlume.incrementMap(methodInvocationCounts, operation);
    maxSuccM = Math.max(maxSuccM, numSuccessfulInvocations);
  }

  /**
   * Increment the number of successful invocations of the last method in the newly-created sequence
   * that was classified as a regression test.
   *
   * @param sequence newly-created sequence that was classified as a regression test
   */
  @Override
  public void newRegressionTestHook(Sequence sequence) {
    incrementSuccessfulInvocationCount(sequence.getOperation());
  }
}
