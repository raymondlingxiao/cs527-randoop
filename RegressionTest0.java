import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test001");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    try {
      java.util.NavigableSet<java.lang.String> strSet5 = strSet0.subSet("hi!", false, "", false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test002");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.Object[] objArray5 = strSet2.toArray();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertNotNull(objArray5);
  }

  @Test
  public void test003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test003");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.lang.String[] strArray9 = new java.lang.String[] {"", "[hi!]", ""};
    java.lang.Comparable<java.lang.String>[] strComparableArray10 =
        strSet0.toArray((java.lang.Comparable<java.lang.String>[]) strArray9);
    try {
      java.lang.String str11 = strSet0.first();
      org.junit.Assert.fail(
          "Expected exception of type java.util.NoSuchElementException; message: null");
    } catch (java.util.NoSuchElementException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertNotNull(strComparableArray10);
  }

  @Test
  public void test004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test004");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str6 = strSet4.higher("");
    java.util.stream.Stream<java.lang.String> strStream7 = strSet4.stream();
    boolean boolean9 = strSet4.add("[hi!]");
    boolean boolean11 = strSet4.add("[]");
    java.util.NavigableSet<java.lang.String> strSet12 = strSet4.descendingSet();
    try {
      boolean boolean13 = strSet0.remove((java.lang.Object) strSet12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNotNull(strStream7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(strSet12);
  }

  @Test
  public void test005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test005");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.lang.Object[] objArray11 = strSet5.toArray();
    java.lang.Object[] objArray12 = strSet4.toArray(objArray11);
    try {
      boolean boolean13 = strSet0.remove((java.lang.Object) objArray12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(objArray11);
    org.junit.Assert.assertNotNull(objArray12);
  }

  @Test
  public void test006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test006");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean6 = strSet0.isEmpty();
    boolean boolean8 = strSet0.equals((java.lang.Object) (byte) 0);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test007");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.util.SortedSet<java.lang.String> strSet6 = strSet0.headSet("hi!");
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet7.pollFirst();
    boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    try {
      java.util.SortedSet<java.lang.String> strSet12 = strSet0.subSet("hi!", "[]");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test008");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean7 = strSet0.add("[]");
    java.util.NavigableSet<java.lang.String> strSet8 = strSet0.descendingSet();
    java.util.TreeSet<java.lang.String> strSet9 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet0);
    java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str12 = strSet10.higher("");
    java.util.stream.Stream<java.lang.String> strStream13 = strSet10.stream();
    boolean boolean15 = strSet10.add("[hi!]");
    boolean boolean17 = strSet10.add("[]");
    java.util.NavigableSet<java.lang.String> strSet18 = strSet10.descendingSet();
    try {
      boolean boolean19 = strSet9.contains((java.lang.Object) strSet10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strStream13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strSet18);
  }

  @Test
  public void test009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test009");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    java.util.SortedSet<java.lang.String> strSet23 = strSet17.headSet("hi!");
    boolean boolean24 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet17);
    java.lang.String str26 = strSet17.floor("");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str26);
  }

  @Test
  public void test010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test010");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    java.util.Collection<java.lang.String> strCollection6 = null;
    try {
      boolean boolean7 = strSet0.addAll(strCollection6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
  }

  @Test
  public void test011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test011");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.Object[] objArray14 = strSet2.toArray();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str18 = strSet16.higher("");
    java.util.stream.Stream<java.lang.String> strStream19 = strSet16.stream();
    java.lang.String str20 = strSet16.pollFirst();
    java.lang.String str21 = strSet16.pollLast();
    java.lang.Object[] objArray22 = strSet16.toArray();
    java.lang.Object[] objArray23 = strSet15.toArray(objArray22);
    boolean boolean24 = strSet2.equals((java.lang.Object) objArray23);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(objArray14);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(strStream19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(objArray22);
    org.junit.Assert.assertNotNull(objArray23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
  }

  @Test
  public void test012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test012");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", true);
    boolean boolean9 = strSet2.add("hi!");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test013");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    java.lang.Object[] objArray7 = strSet2.toArray();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(objArray7);
  }

  @Test
  public void test014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test014");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
    java.lang.String str6 = strSet5.pollLast();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str6);
  }

  @Test
  public void test015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test015");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str1 = strSet0.pollLast();
    org.junit.Assert.assertNull(str1);
  }

  @Test
  public void test016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test016");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String str7 = strSet2.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
  }

  @Test
  public void test017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test017");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.lang.Object obj24 = strSet0.clone();
    java.util.stream.Stream<java.lang.String> strStream25 = strSet0.stream();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(obj24);
    org.junit.Assert.assertNotNull(strStream25);
  }

  @Test
  public void test018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test018");
    java.lang.String[] strArray2 = new java.lang.String[] {"[]", "[hi!]"};
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.stream.Stream<java.lang.String> strStream5 = strList3.stream();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(strStream5);
  }

  @Test
  public void test019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test019");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.descendingSet();
    java.lang.String str7 = strSet0.toString();
    java.lang.Class<?> wildcardClass8 = strSet0.getClass();
    java.lang.String str9 = strSet0.pollFirst();
    java.lang.Object obj10 = strSet0.clone();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    org.junit.Assert.assertNotNull(wildcardClass8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(obj10);
  }

  @Test
  public void test020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test020");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    boolean boolean25 = strSet0.add("");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
  }

  @Test
  public void test021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test021");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.higher("[]");
    java.lang.String str8 = strSet2.toString();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[hi!]" + "'", str8.equals("[hi!]"));
  }

  @Test
  public void test022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test022");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    java.lang.Object obj35 = strSet27.clone();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(obj35);
  }

  @Test
  public void test023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test023");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    java.lang.String[] strArray36 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.util.Iterator<java.lang.String> strItor39 = strSet37.descendingIterator();
    java.lang.String str40 = strSet37.toString();
    java.lang.String str42 = strSet37.higher("[]");
    boolean boolean43 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet37);
    try {
      java.lang.String str44 = strSet2.first();
      org.junit.Assert.fail(
          "Expected exception of type java.util.NoSuchElementException; message: null");
    } catch (java.util.NoSuchElementException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strItor39);
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[hi!]" + "'", str40.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
  }

  @Test
  public void test024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test024");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.util.SortedSet<java.lang.String> strSet6 = strSet0.headSet("hi!");
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet7.pollFirst();
    boolean boolean9 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.lang.String[] strArray12 = new java.lang.String[] {"[hi!]", "[hi!]"};
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.lang.String str15 = strSet13.pollLast();
    java.lang.String[] strArray17 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.util.Iterator<java.lang.String> strItor20 = strSet18.descendingIterator();
    boolean boolean21 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet18);
    try {
      boolean boolean22 = strSet0.contains((java.lang.Object) strSet18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[hi!]" + "'", str15.equals("[hi!]"));
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strItor20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test025");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
    java.lang.String str11 = strSet7.pollFirst();
    strSet7.clear();
    java.util.SortedSet<java.lang.String> strSet14 = strSet7.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    java.lang.String str19 = strSet15.pollFirst();
    strSet15.clear();
    java.util.SortedSet<java.lang.String> strSet22 = strSet15.headSet("[hi!]");
    boolean boolean23 = strSet7.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str26 = strSet24.higher("");
    java.util.stream.Stream<java.lang.String> strStream27 = strSet24.stream();
    java.lang.String str28 = strSet24.pollFirst();
    java.util.SortedSet<java.lang.String> strSet30 = strSet24.headSet("hi!");
    boolean boolean31 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet24);
    boolean boolean32 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet24);
    java.lang.String str33 = strSet24.pollLast();
    try {
      java.lang.String str34 = strSet24.last();
      org.junit.Assert.fail(
          "Expected exception of type java.util.NoSuchElementException; message: null");
    } catch (java.util.NoSuchElementException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(strStream10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strSet22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(strStream27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNull(str33);
  }

  @Test
  public void test026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test026");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean7 = strSet0.add("[]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.lang.String str11 = strSet8.pollLast();
    java.util.NavigableSet<java.lang.String> strSet14 = strSet8.headSet("[hi!]", false);
    boolean boolean15 = strSet8.isEmpty();
    java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str18 = strSet16.higher("");
    java.util.stream.Stream<java.lang.String> strStream19 = strSet16.stream();
    java.lang.String str20 = strSet16.pollFirst();
    java.lang.String str21 = strSet16.pollLast();
    boolean boolean22 = strSet8.containsAll((java.util.Collection<java.lang.String>) strSet16);
    try {
      boolean boolean23 = strSet0.remove((java.lang.Object) strSet16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(strStream19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
  }

  @Test
  public void test027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test027");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.toString();
    java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str6 = strSet4.higher("");
    java.util.stream.Stream<java.lang.String> strStream7 = strSet4.stream();
    java.lang.String str8 = strSet4.pollFirst();
    java.lang.String str9 = strSet4.pollLast();
    java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str12 = strSet10.higher("");
    java.lang.String str13 = strSet10.pollLast();
    boolean boolean14 = strSet4.retainAll((java.util.Collection<java.lang.String>) strSet10);
    boolean boolean15 = strSet0.equals((java.lang.Object) strSet4);
    boolean boolean17 = strSet0.add("");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNotNull(strStream7);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test028");
    java.lang.String[] strArray2 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    boolean boolean8 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass10 = strSet9.getClass();
    java.lang.Class[] classArray12 = new java.lang.Class[1];
    @SuppressWarnings("unchecked")
    java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
    wildcardClassArray13[0] = wildcardClass10;
    try {
      java.lang.Class<?>[] wildcardClassArray16 = strSet3.toArray(wildcardClassArray13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
    } catch (java.lang.ArrayStoreException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(wildcardClass10);
    org.junit.Assert.assertNotNull(classArray12);
    org.junit.Assert.assertNotNull(wildcardClassArray13);
  }

  @Test
  public void test029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test029");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet19 = strSet0.tailSet("");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strSet19);
  }

  @Test
  public void test030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test030");
    java.lang.String[] strArray1 = new java.lang.String[] {""};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.NavigableSet<java.lang.String> strSet6 = strSet2.headSet("hi!", false);
    java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet2.comparator();
    java.util.Collection<java.lang.String> strCollection8 = null;
    try {
      boolean boolean9 = strSet2.containsAll(strCollection8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(wildcardComparator7);
  }

  @Test
  public void test031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test031");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean8 = strSet2.add("[hi!]");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test032");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    boolean boolean15 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean16 = strSet0.equals((java.lang.Object) strSet5);
    java.util.Iterator<java.lang.String> strItor17 = strSet5.descendingIterator();
    java.util.NavigableSet<java.lang.String> strSet20 = strSet5.tailSet("", true);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strItor17);
    org.junit.Assert.assertNotNull(strSet20);
  }

  @Test
  public void test033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test033");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    boolean boolean15 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean16 = strSet0.equals((java.lang.Object) strSet5);
    java.lang.String str17 = strSet0.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str17);
  }

  @Test
  public void test034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test034");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean6 = strSet0.isEmpty();
    try {
      boolean boolean8 = strSet0.remove((java.lang.Object) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Character");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test035");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.higher("[]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.lang.String str11 = strSet8.pollLast();
    java.util.stream.Stream<java.lang.String> strStream12 = strSet8.parallelStream();
    java.util.TreeSet<java.lang.String> strSet13 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    java.util.stream.Stream<java.lang.String> strStream17 = strSet14.stream();
    java.lang.String str18 = strSet14.pollFirst();
    java.lang.String str19 = strSet14.pollLast();
    java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str22 = strSet20.higher("");
    java.lang.String str23 = strSet20.pollLast();
    boolean boolean24 = strSet14.retainAll((java.util.Collection<java.lang.String>) strSet20);
    java.lang.String[] strArray26 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet27 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean28 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
    java.lang.String[] strArray31 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    boolean boolean33 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
    java.lang.String str35 = strSet32.lower("hi!");
    boolean boolean36 = strSet27.removeAll((java.util.Collection<java.lang.String>) strSet32);
    java.lang.String[] strArray38 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet39 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean40 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
    java.lang.String[] strArray43 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet44 = new java.util.TreeSet<java.lang.String>();
    boolean boolean45 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
    java.lang.String str47 = strSet44.lower("hi!");
    boolean boolean48 = strSet39.removeAll((java.util.Collection<java.lang.String>) strSet44);
    java.lang.String[] strArray50 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet51 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean52 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
    java.lang.String[] strArray55 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>();
    boolean boolean57 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
    java.lang.String str59 = strSet56.lower("hi!");
    boolean boolean60 = strSet51.removeAll((java.util.Collection<java.lang.String>) strSet56);
    java.util.LinkedHashSet[] linkedHashSetArray62 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray63 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray62;
    strSetArray63[0] = strSet27;
    strSetArray63[1] = strSet39;
    strSetArray63[2] = strSet51;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray70 = strSet20.toArray(strSetArray63);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray71 = strSet8.toArray(strSetArray70);
    try {
      boolean boolean72 = strSet2.remove((java.lang.Object) strSetArray70);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: [Ljava.util.LinkedHashSet; cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNotNull(strStream17);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(strArray26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(strArray38);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(strArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(strArray50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(strArray55);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray62);
    org.junit.Assert.assertNotNull(strSetArray63);
    org.junit.Assert.assertNotNull(strSetArray70);
    org.junit.Assert.assertNotNull(strSetArray71);
  }

  @Test
  public void test036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test036");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    boolean boolean6 = strSet0.add("[hi!]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test037");
    java.lang.String[] strArray2 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    boolean boolean8 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet5);
    int int9 = strSet5.size();
    java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str12 = strSet10.higher("");
    java.util.stream.Stream<java.lang.String> strStream13 = strSet10.stream();
    java.lang.String str14 = strSet10.pollFirst();
    int int15 = strSet10.size();
    java.util.stream.Stream<java.lang.String> strStream16 = strSet10.stream();
    java.lang.String str17 = strSet10.toString();
    boolean boolean18 = strSet5.equals((java.lang.Object) str17);
    java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str21 = strSet19.higher("");
    java.lang.String str22 = strSet19.pollLast();
    java.util.NavigableSet<java.lang.String> strSet25 = strSet19.headSet("[hi!]", false);
    boolean boolean26 = strSet19.isEmpty();
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    java.lang.String str32 = strSet27.pollLast();
    boolean boolean33 = strSet19.containsAll((java.util.Collection<java.lang.String>) strSet27);
    java.util.TreeSet<java.lang.String> strSet34 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str36 = strSet34.higher("");
    java.util.stream.Stream<java.lang.String> strStream37 = strSet34.stream();
    boolean boolean39 = strSet34.add("[hi!]");
    boolean boolean41 = strSet34.add("[]");
    boolean boolean42 = strSet19.containsAll((java.util.Collection<java.lang.String>) strSet34);
    boolean boolean43 = strSet5.removeAll((java.util.Collection<java.lang.String>) strSet19);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strStream13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNotNull(strSet25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertNull(str32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNull(str36);
    org.junit.Assert.assertNotNull(strStream37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
  }

  @Test
  public void test038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test038");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    boolean boolean8 = strSet2.add("hi!");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test039");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.util.SortedSet<java.lang.String> strSet6 = strSet0.headSet("hi!");
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    java.lang.String str10 = strSet7.pollLast();
    java.util.stream.Stream<java.lang.String> strStream11 = strSet7.parallelStream();
    java.util.SortedSet[] sortedSetArray13 = new java.util.SortedSet[0];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[] strSetArray14 =
        (java.util.SortedSet<java.lang.String>[]) sortedSetArray13;
    java.util.SortedSet<java.lang.String>[] strSetArray15 = strSet7.toArray(strSetArray14);
    java.util.SortedSet<java.lang.String>[] strSetArray16 = strSet0.toArray(strSetArray14);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNotNull(sortedSetArray13);
    org.junit.Assert.assertNotNull(strSetArray14);
    org.junit.Assert.assertNotNull(strSetArray15);
    org.junit.Assert.assertNotNull(strSetArray16);
  }

  @Test
  public void test040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test040");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    boolean boolean36 = strSet27.add("hi!");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
  }

  @Test
  public void test041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test041");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.lang.Object[] objArray6 = strSet0.toArray();
    java.lang.String str7 = strSet0.pollLast();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertNull(str7);
  }

  @Test
  public void test042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test042");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.lang.String str9 = strSet6.pollLast();
    boolean boolean10 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet6);
    java.lang.String[] strArray12 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet13 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.lang.String str21 = strSet18.lower("hi!");
    boolean boolean22 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet18);
    java.lang.String[] strArray24 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet25 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean26 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
    java.lang.String[] strArray29 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
    boolean boolean31 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
    java.lang.String str33 = strSet30.lower("hi!");
    boolean boolean34 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet30);
    java.lang.String[] strArray36 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet37 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.lang.String[] strArray41 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet42 = new java.util.TreeSet<java.lang.String>();
    boolean boolean43 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
    java.lang.String str45 = strSet42.lower("hi!");
    boolean boolean46 = strSet37.removeAll((java.util.Collection<java.lang.String>) strSet42);
    java.util.LinkedHashSet[] linkedHashSetArray48 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray49 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray48;
    strSetArray49[0] = strSet13;
    strSetArray49[1] = strSet25;
    strSetArray49[2] = strSet37;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray56 = strSet6.toArray(strSetArray49);
    boolean boolean58 = strSet6.add("");
    java.lang.String str59 = strSet6.pollFirst();
    java.lang.String str60 = strSet6.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(strArray29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strArray41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray48);
    org.junit.Assert.assertNotNull(strSetArray49);
    org.junit.Assert.assertNotNull(strSetArray56);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    org.junit.Assert.assertNull(str60);
  }

  @Test
  public void test043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test043");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    int int10 = strSet5.size();
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean13 = strSet0.add("");
    java.lang.String[] strArray15 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.util.Iterator<java.lang.String> strItor18 = strSet16.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
    boolean boolean20 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet19);
    boolean boolean22 = strSet16.equals((java.lang.Object) '4');
    java.lang.Class<?> wildcardClass23 = strSet16.getClass();
    boolean boolean24 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet16);
    java.lang.String str25 = strSet16.toString();
    java.lang.String str26 = strSet16.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strItor18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(wildcardClass23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[hi!]" + "'", str25.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
  }

  @Test
  public void test044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test044");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    boolean boolean6 = strSet0.equals((java.lang.Object) (short) 10);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass8 = strSet7.getClass();
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean18 = strSet7.retainAll((java.util.Collection<java.lang.String>) strSet14);
    java.lang.String str19 = strSet14.toString();
    java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str22 = strSet20.higher("");
    java.util.stream.Stream<java.lang.String> strStream23 = strSet20.stream();
    java.lang.String str24 = strSet20.pollFirst();
    strSet20.clear();
    java.util.NavigableSet<java.lang.String> strSet26 = strSet20.descendingSet();
    boolean boolean27 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet20);
    java.util.TreeSet<java.lang.String> strSet28 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str30 = strSet28.higher("");
    java.lang.String str31 = strSet28.pollLast();
    java.util.NavigableSet<java.lang.String> strSet34 = strSet28.headSet("[hi!]", false);
    java.lang.Object[] objArray35 = strSet28.toArray();
    boolean boolean36 = strSet14.equals((java.lang.Object) strSet28);
    try {
      boolean boolean37 = strSet0.remove((java.lang.Object) strSet28);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(wildcardClass8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNotNull(strStream23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNotNull(strSet26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNull(str30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertNotNull(strSet34);
    org.junit.Assert.assertNotNull(objArray35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
  }

  @Test
  public void test045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test045");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str26 = strSet24.higher("");
    java.lang.String str27 = strSet24.pollLast();
    java.util.stream.Stream<java.lang.String> strStream28 = strSet24.parallelStream();
    java.util.TreeSet<java.lang.String> strSet29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str31 = strSet29.higher("");
    java.util.stream.Stream<java.lang.String> strStream32 = strSet29.stream();
    java.lang.String str33 = strSet29.pollFirst();
    java.lang.String str34 = strSet29.pollLast();
    java.util.TreeSet<java.lang.String> strSet35 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str37 = strSet35.higher("");
    java.lang.String str38 = strSet35.pollLast();
    boolean boolean39 = strSet29.retainAll((java.util.Collection<java.lang.String>) strSet35);
    boolean boolean40 = strSet24.equals((java.lang.Object) strSet29);
    boolean boolean41 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet24);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNotNull(strStream28);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertNotNull(strStream32);
    org.junit.Assert.assertNull(str33);
    org.junit.Assert.assertNull(str34);
    org.junit.Assert.assertNull(str37);
    org.junit.Assert.assertNull(str38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
  }

  @Test
  public void test046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test046");
    java.lang.String[] strArray1 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet2 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.lang.String[] strArray6 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    boolean boolean8 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
    java.lang.String str10 = strSet7.lower("hi!");
    boolean boolean11 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet7);
    java.lang.String str12 = strSet2.toString();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
  }

  @Test
  public void test047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test047");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet2.comparator();
    java.util.Iterator<java.lang.String> strItor8 = strSet2.descendingIterator();
    java.lang.String str9 = strSet2.pollFirst();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(wildcardComparator7);
    org.junit.Assert.assertNotNull(strItor8);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
  }

  @Test
  public void test048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test048");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    java.lang.String str11 = strSet6.pollLast();
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str14 = strSet12.higher("");
    java.lang.String str15 = strSet12.pollLast();
    boolean boolean16 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray18 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet19 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean20 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
    java.lang.String[] strArray23 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    boolean boolean25 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
    java.lang.String str27 = strSet24.lower("hi!");
    boolean boolean28 = strSet19.removeAll((java.util.Collection<java.lang.String>) strSet24);
    java.lang.String[] strArray30 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet31 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean32 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
    java.lang.String[] strArray35 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet36 = new java.util.TreeSet<java.lang.String>();
    boolean boolean37 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
    java.lang.String str39 = strSet36.lower("hi!");
    boolean boolean40 = strSet31.removeAll((java.util.Collection<java.lang.String>) strSet36);
    java.lang.String[] strArray42 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet43 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean44 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
    java.lang.String[] strArray47 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet48 = new java.util.TreeSet<java.lang.String>();
    boolean boolean49 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
    java.lang.String str51 = strSet48.lower("hi!");
    boolean boolean52 = strSet43.removeAll((java.util.Collection<java.lang.String>) strSet48);
    java.util.LinkedHashSet[] linkedHashSetArray54 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray55 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray54;
    strSetArray55[0] = strSet19;
    strSetArray55[1] = strSet31;
    strSetArray55[2] = strSet43;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray62 = strSet12.toArray(strSetArray55);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray63 = strSet0.toArray(strSetArray62);
    java.lang.String str64 = strSet0.toString();
    java.util.TreeSet<java.lang.String> strSet65 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str67 = strSet65.higher("");
    java.util.stream.Stream<java.lang.String> strStream68 = strSet65.stream();
    java.lang.String str69 = strSet65.pollFirst();
    strSet65.clear();
    java.util.NavigableSet<java.lang.String> strSet71 = strSet65.descendingSet();
    java.lang.String str72 = strSet65.toString();
    java.lang.Class<?> wildcardClass73 = strSet65.getClass();
    boolean boolean74 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet65);
    java.util.TreeSet<java.lang.String> strSet75 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet0);
    java.util.TreeSet<java.lang.String> strSet76 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str78 = strSet76.higher("");
    java.util.stream.Stream<java.lang.String> strStream79 = strSet76.stream();
    java.lang.String str80 = strSet76.pollFirst();
    java.util.SortedSet<java.lang.String> strSet82 = strSet76.headSet("hi!");
    boolean boolean83 = strSet75.retainAll((java.util.Collection<java.lang.String>) strSet76);
    boolean boolean85 = strSet76.add("hi!");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(strArray35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(strArray42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNotNull(strArray47);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray54);
    org.junit.Assert.assertNotNull(strSetArray55);
    org.junit.Assert.assertNotNull(strSetArray62);
    org.junit.Assert.assertNotNull(strSetArray63);
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[]" + "'", str64.equals("[]"));
    org.junit.Assert.assertNull(str67);
    org.junit.Assert.assertNotNull(strStream68);
    org.junit.Assert.assertNull(str69);
    org.junit.Assert.assertNotNull(strSet71);
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[]" + "'", str72.equals("[]"));
    org.junit.Assert.assertNotNull(wildcardClass73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    org.junit.Assert.assertNull(str78);
    org.junit.Assert.assertNotNull(strStream79);
    org.junit.Assert.assertNull(str80);
    org.junit.Assert.assertNotNull(strSet82);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
  }

  @Test
  public void test049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test049");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.NavigableSet<java.lang.String> strSet19 = strSet0.subSet("hi!", false, "hi!", true);
    java.lang.String str20 = strSet0.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertNull(str20);
  }

  @Test
  public void test050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test050");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.NavigableSet<java.lang.String> strSet17 = strSet0.descendingSet();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strSet17);
  }

  @Test
  public void test051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test051");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    boolean boolean15 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean16 = strSet0.equals((java.lang.Object) strSet5);
    java.lang.Object[] objArray17 = strSet0.toArray();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(objArray17);
  }

  @Test
  public void test052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test052");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", true);
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.lang.String str11 = strSet8.pollLast();
    java.util.stream.Stream<java.lang.String> strStream12 = strSet8.parallelStream();
    java.util.TreeSet<java.lang.String> strSet13 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    java.util.stream.Stream<java.lang.String> strStream17 = strSet14.stream();
    java.lang.String str18 = strSet14.pollFirst();
    java.lang.String str19 = strSet14.pollLast();
    java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str22 = strSet20.higher("");
    java.lang.String str23 = strSet20.pollLast();
    boolean boolean24 = strSet14.retainAll((java.util.Collection<java.lang.String>) strSet20);
    java.lang.String[] strArray26 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet27 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean28 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
    java.lang.String[] strArray31 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    boolean boolean33 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
    java.lang.String str35 = strSet32.lower("hi!");
    boolean boolean36 = strSet27.removeAll((java.util.Collection<java.lang.String>) strSet32);
    java.lang.String[] strArray38 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet39 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean40 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
    java.lang.String[] strArray43 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet44 = new java.util.TreeSet<java.lang.String>();
    boolean boolean45 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
    java.lang.String str47 = strSet44.lower("hi!");
    boolean boolean48 = strSet39.removeAll((java.util.Collection<java.lang.String>) strSet44);
    java.lang.String[] strArray50 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet51 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean52 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
    java.lang.String[] strArray55 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>();
    boolean boolean57 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
    java.lang.String str59 = strSet56.lower("hi!");
    boolean boolean60 = strSet51.removeAll((java.util.Collection<java.lang.String>) strSet56);
    java.util.LinkedHashSet[] linkedHashSetArray62 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray63 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray62;
    strSetArray63[0] = strSet27;
    strSetArray63[1] = strSet39;
    strSetArray63[2] = strSet51;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray70 = strSet20.toArray(strSetArray63);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray71 = strSet8.toArray(strSetArray70);
    java.lang.String str72 = strSet8.toString();
    java.util.TreeSet<java.lang.String> strSet73 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str75 = strSet73.higher("");
    java.util.stream.Stream<java.lang.String> strStream76 = strSet73.stream();
    java.lang.String str77 = strSet73.pollFirst();
    strSet73.clear();
    java.util.NavigableSet<java.lang.String> strSet79 = strSet73.descendingSet();
    java.lang.String str80 = strSet73.toString();
    java.lang.Class<?> wildcardClass81 = strSet73.getClass();
    boolean boolean82 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet73);
    java.util.TreeSet<java.lang.String> strSet83 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet84 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str86 = strSet84.higher("");
    java.util.stream.Stream<java.lang.String> strStream87 = strSet84.stream();
    java.lang.String str88 = strSet84.pollFirst();
    java.util.SortedSet<java.lang.String> strSet90 = strSet84.headSet("hi!");
    boolean boolean91 = strSet83.retainAll((java.util.Collection<java.lang.String>) strSet84);
    boolean boolean92 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet83);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNotNull(strStream17);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(strArray26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(strArray38);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(strArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(strArray50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(strArray55);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray62);
    org.junit.Assert.assertNotNull(strSetArray63);
    org.junit.Assert.assertNotNull(strSetArray70);
    org.junit.Assert.assertNotNull(strSetArray71);
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[]" + "'", str72.equals("[]"));
    org.junit.Assert.assertNull(str75);
    org.junit.Assert.assertNotNull(strStream76);
    org.junit.Assert.assertNull(str77);
    org.junit.Assert.assertNotNull(strSet79);
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "[]" + "'", str80.equals("[]"));
    org.junit.Assert.assertNotNull(wildcardClass81);
    org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    org.junit.Assert.assertNull(str86);
    org.junit.Assert.assertNotNull(strStream87);
    org.junit.Assert.assertNull(str88);
    org.junit.Assert.assertNotNull(strSet90);
    org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
  }

  @Test
  public void test053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test053");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
    java.lang.String str11 = strSet7.pollFirst();
    strSet7.clear();
    java.util.SortedSet<java.lang.String> strSet14 = strSet7.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    java.lang.String str19 = strSet15.pollFirst();
    strSet15.clear();
    java.util.SortedSet<java.lang.String> strSet22 = strSet15.headSet("[hi!]");
    boolean boolean23 = strSet7.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str26 = strSet24.higher("");
    java.util.stream.Stream<java.lang.String> strStream27 = strSet24.stream();
    java.lang.String str28 = strSet24.pollFirst();
    java.util.SortedSet<java.lang.String> strSet30 = strSet24.headSet("hi!");
    boolean boolean31 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet24);
    java.util.TreeSet<java.lang.String> strSet32 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet24);
    boolean boolean33 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet32);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(strStream10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strSet14);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strSet22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(strStream27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNotNull(strSet30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
  }

  @Test
  public void test054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test054");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.lang.String str25 = strSet15.higher("[]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[hi!]" + "'", str25.equals("[hi!]"));
  }

  @Test
  public void test055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test055");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean7 = strSet0.add("[]");
    java.lang.Object[] objArray8 = strSet0.toArray();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(objArray8);
  }

  @Test
  public void test056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test056");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.util.SortedSet<java.lang.String> strSet6 = strSet0.headSet("hi!");
    java.lang.String str8 = strSet0.lower("");
    java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str11 = strSet9.higher("");
    java.lang.String str12 = strSet9.pollLast();
    java.util.stream.Stream<java.lang.String> strStream13 = strSet9.parallelStream();
    java.lang.String str15 = strSet9.ceiling("[]");
    java.lang.String str16 = strSet9.pollFirst();
    boolean boolean17 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet9);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strStream13);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test057");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.SortedSet[] sortedSetArray6 = new java.util.SortedSet[0];
    @SuppressWarnings("unchecked")
    java.util.SortedSet<java.lang.String>[] strSetArray7 =
        (java.util.SortedSet<java.lang.String>[]) sortedSetArray6;
    java.util.SortedSet<java.lang.String>[] strSetArray8 = strSet0.toArray(strSetArray7);
    java.lang.String[] strArray10 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    boolean boolean12 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
    java.util.Iterator<java.lang.String> strItor13 = strSet11.descendingIterator();
    java.lang.String str14 = strSet11.toString();
    java.lang.String str16 = strSet11.floor("[hi!]");
    int int17 = strSet11.size();
    boolean boolean18 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet11);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNotNull(sortedSetArray6);
    org.junit.Assert.assertNotNull(strSetArray7);
    org.junit.Assert.assertNotNull(strSetArray8);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strItor13);
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[hi!]" + "'", str14.equals("[hi!]"));
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test058");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    java.util.Spliterator<java.lang.String> strSpliterator6 = strSet0.spliterator();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(strSpliterator6);
  }

  @Test
  public void test059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test059");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str6 = strSet2.pollFirst();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
  }

  @Test
  public void test060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test060");
    java.lang.String[] strArray1 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet2 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.lang.String[] strArray6 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    boolean boolean8 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
    java.lang.String str10 = strSet7.lower("hi!");
    boolean boolean11 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet7);
    java.lang.String str12 = strSet7.pollFirst();
    java.lang.String str13 = strSet7.pollLast();
    java.lang.String str14 = strSet7.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
  }

  @Test
  public void test061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test061");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    java.lang.String[] strArray36 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.util.Iterator<java.lang.String> strItor39 = strSet37.descendingIterator();
    java.lang.String str40 = strSet37.toString();
    java.lang.String str42 = strSet37.higher("[]");
    boolean boolean43 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet37);
    java.util.Iterator<java.lang.String> strItor44 = strSet37.iterator();
    java.lang.Class<?> wildcardClass45 = strItor44.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strItor39);
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[hi!]" + "'", str40.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(strItor44);
    org.junit.Assert.assertNotNull(wildcardClass45);
  }

  @Test
  public void test062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test062");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String str14 = strSet2.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str14);
  }

  @Test
  public void test063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test063");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    boolean boolean10 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str15 = strSet13.higher("");
    java.util.stream.Stream<java.lang.String> strStream16 = strSet13.stream();
    java.lang.String str17 = strSet13.pollFirst();
    java.lang.String str18 = strSet13.pollLast();
    java.lang.Object[] objArray19 = strSet13.toArray();
    java.lang.Object[] objArray20 = strSet12.toArray(objArray19);
    boolean boolean21 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str24 = strSet22.higher("");
    java.util.stream.Stream<java.lang.String> strStream25 = strSet22.stream();
    java.lang.String str26 = strSet22.pollFirst();
    strSet22.clear();
    java.util.NavigableSet<java.lang.String> strSet28 = strSet22.descendingSet();
    boolean boolean29 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet22);
    java.lang.String str30 = strSet12.pollLast();
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(objArray19);
    org.junit.Assert.assertNotNull(objArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNotNull(strStream25);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNull(str30);
  }

  @Test
  public void test064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test064");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String str7 = strSet5.pollFirst();
    java.lang.String str8 = strSet5.toString();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
  }

  @Test
  public void test065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test065");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.toString();
    boolean boolean5 = strSet0.remove((java.lang.Object) "hi!");
    java.lang.String str6 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
    boolean boolean12 = strSet7.add("[hi!]");
    boolean boolean14 = strSet7.add("[]");
    java.util.NavigableSet<java.lang.String> strSet15 = strSet7.descendingSet();
    boolean boolean16 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet7);
    java.util.TreeSet<java.lang.String> strSet17 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet7);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(strStream10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test066");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet2.comparator();
    java.util.Iterator<java.lang.String> strItor8 = strSet2.descendingIterator();
    java.util.stream.Stream<java.lang.String> strStream9 = strSet2.parallelStream();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(wildcardComparator7);
    org.junit.Assert.assertNotNull(strItor8);
    org.junit.Assert.assertNotNull(strStream9);
  }

  @Test
  public void test067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test067");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.lang.String str8 = strSet0.pollFirst();
    java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str11 = strSet9.higher("");
    java.util.stream.Stream<java.lang.String> strStream12 = strSet9.stream();
    java.lang.String str13 = strSet9.pollFirst();
    java.lang.Object[] objArray14 = strSet9.toArray();
    boolean boolean15 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet9);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNotNull(objArray14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test068");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.lang.String str9 = strSet6.pollLast();
    boolean boolean10 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet6);
    java.lang.String[] strArray12 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet13 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.lang.String str21 = strSet18.lower("hi!");
    boolean boolean22 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet18);
    java.lang.String[] strArray24 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet25 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean26 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
    java.lang.String[] strArray29 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
    boolean boolean31 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
    java.lang.String str33 = strSet30.lower("hi!");
    boolean boolean34 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet30);
    java.lang.String[] strArray36 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet37 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.lang.String[] strArray41 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet42 = new java.util.TreeSet<java.lang.String>();
    boolean boolean43 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
    java.lang.String str45 = strSet42.lower("hi!");
    boolean boolean46 = strSet37.removeAll((java.util.Collection<java.lang.String>) strSet42);
    java.util.LinkedHashSet[] linkedHashSetArray48 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray49 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray48;
    strSetArray49[0] = strSet13;
    strSetArray49[1] = strSet25;
    strSetArray49[2] = strSet37;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray56 = strSet6.toArray(strSetArray49);
    boolean boolean58 = strSet6.add("");
    java.lang.String[] strArray60 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet61 = new java.util.TreeSet<java.lang.String>();
    boolean boolean62 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
    java.util.Iterator<java.lang.String> strItor63 = strSet61.descendingIterator();
    java.lang.String str64 = strSet61.toString();
    java.lang.String str66 = strSet61.floor("[hi!]");
    boolean boolean67 = strSet6.equals((java.lang.Object) "[hi!]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(strArray29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strArray41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray48);
    org.junit.Assert.assertNotNull(strSetArray49);
    org.junit.Assert.assertNotNull(strSetArray56);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    org.junit.Assert.assertNotNull(strArray60);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertNotNull(strItor63);
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[hi!]" + "'", str64.equals("[hi!]"));
    org.junit.Assert.assertNull(str66);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
  }

  @Test
  public void test069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test069");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    int int5 = strSet0.size();
    java.util.stream.Stream<java.lang.String> strStream6 = strSet0.stream();
    java.lang.String str7 = strSet0.toString();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str11 = strSet9.higher("");
    java.util.stream.Stream<java.lang.String> strStream12 = strSet9.stream();
    java.lang.String str13 = strSet9.pollFirst();
    java.lang.String str14 = strSet9.pollLast();
    java.lang.Object[] objArray15 = strSet9.toArray();
    java.lang.Object[] objArray16 = strSet8.toArray(objArray15);
    boolean boolean17 = strSet0.equals((java.lang.Object) strSet8);
    java.lang.String str18 = strSet8.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(strStream6);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(objArray15);
    org.junit.Assert.assertNotNull(objArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNull(str18);
  }

  @Test
  public void test070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test070");
    java.lang.String[] strArray2 = new java.lang.String[] {"[hi!]", "[hi!]"};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.lang.String str5 = strSet3.pollLast();
    java.lang.String[] strArray7 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    boolean boolean9 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
    java.util.Iterator<java.lang.String> strItor10 = strSet8.descendingIterator();
    boolean boolean11 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet8);
    java.lang.String str12 = strSet8.pollFirst();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(strItor10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
  }

  @Test
  public void test071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test071");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    boolean boolean14 = strSet2.isEmpty();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.lang.String str18 = strSet15.toString();
    java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str21 = strSet19.higher("");
    java.util.stream.Stream<java.lang.String> strStream22 = strSet19.stream();
    java.lang.String str23 = strSet19.pollFirst();
    java.lang.String str24 = strSet19.pollLast();
    java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str27 = strSet25.higher("");
    java.lang.String str28 = strSet25.pollLast();
    boolean boolean29 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet25);
    boolean boolean30 = strSet15.equals((java.lang.Object) strSet19);
    boolean boolean31 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str34 = strSet32.higher("");
    java.lang.String str35 = strSet32.pollLast();
    java.util.stream.Stream<java.lang.String> strStream36 = strSet32.parallelStream();
    java.util.TreeSet<java.lang.String> strSet37 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet32);
    java.util.TreeSet<java.lang.String> strSet38 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str40 = strSet38.higher("");
    java.util.stream.Stream<java.lang.String> strStream41 = strSet38.stream();
    java.lang.String str42 = strSet38.pollFirst();
    java.lang.String str43 = strSet38.pollLast();
    java.util.TreeSet<java.lang.String> strSet44 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str46 = strSet44.higher("");
    java.lang.String str47 = strSet44.pollLast();
    boolean boolean48 = strSet38.retainAll((java.util.Collection<java.lang.String>) strSet44);
    java.lang.String[] strArray50 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet51 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean52 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
    java.lang.String[] strArray55 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>();
    boolean boolean57 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
    java.lang.String str59 = strSet56.lower("hi!");
    boolean boolean60 = strSet51.removeAll((java.util.Collection<java.lang.String>) strSet56);
    java.lang.String[] strArray62 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet63 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean64 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
    java.lang.String[] strArray67 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet68 = new java.util.TreeSet<java.lang.String>();
    boolean boolean69 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
    java.lang.String str71 = strSet68.lower("hi!");
    boolean boolean72 = strSet63.removeAll((java.util.Collection<java.lang.String>) strSet68);
    java.lang.String[] strArray74 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet75 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean76 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
    java.lang.String[] strArray79 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet80 = new java.util.TreeSet<java.lang.String>();
    boolean boolean81 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
    java.lang.String str83 = strSet80.lower("hi!");
    boolean boolean84 = strSet75.removeAll((java.util.Collection<java.lang.String>) strSet80);
    java.util.LinkedHashSet[] linkedHashSetArray86 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray87 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray86;
    strSetArray87[0] = strSet51;
    strSetArray87[1] = strSet63;
    strSetArray87[2] = strSet75;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray94 = strSet44.toArray(strSetArray87);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray95 = strSet32.toArray(strSetArray94);
    java.lang.Class<?> wildcardClass96 = strSet32.getClass();
    java.util.Iterator<java.lang.String> strItor97 = strSet32.iterator();
    try {
      boolean boolean98 = strSet2.remove((java.lang.Object) strItor97);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeMap$KeyIterator cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strStream22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNull(str34);
    org.junit.Assert.assertNull(str35);
    org.junit.Assert.assertNotNull(strStream36);
    org.junit.Assert.assertNull(str40);
    org.junit.Assert.assertNotNull(strStream41);
    org.junit.Assert.assertNull(str42);
    org.junit.Assert.assertNull(str43);
    org.junit.Assert.assertNull(str46);
    org.junit.Assert.assertNull(str47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(strArray50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(strArray55);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertNotNull(strArray62);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    org.junit.Assert.assertNotNull(strArray67);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertNotNull(strArray74);
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    org.junit.Assert.assertNotNull(strArray79);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
    org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray86);
    org.junit.Assert.assertNotNull(strSetArray87);
    org.junit.Assert.assertNotNull(strSetArray94);
    org.junit.Assert.assertNotNull(strSetArray95);
    org.junit.Assert.assertNotNull(wildcardClass96);
    org.junit.Assert.assertNotNull(strItor97);
  }

  @Test
  public void test072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test072");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.lang.String str6 = strSet0.ceiling("[]");
    java.lang.String str7 = strSet0.pollFirst();
    java.lang.Object obj8 = strSet0.clone();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(obj8);
  }

  @Test
  public void test073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test073");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.Collection<java.lang.String> strCollection24 = null;
    try {
      boolean boolean25 = strSet15.containsAll(strCollection24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
  }

  @Test
  public void test074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test074");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    java.lang.Object[] objArray7 = strSet0.toArray();
    boolean boolean9 = strSet0.add("");
    java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str12 = strSet10.higher("");
    java.lang.String str13 = strSet10.pollLast();
    java.util.stream.Stream<java.lang.String> strStream14 = strSet10.parallelStream();
    java.util.TreeSet<java.lang.String> strSet15 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet10);
    java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str18 = strSet16.higher("");
    java.util.stream.Stream<java.lang.String> strStream19 = strSet16.stream();
    java.lang.String str20 = strSet16.pollFirst();
    java.lang.String str21 = strSet16.pollLast();
    java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str24 = strSet22.higher("");
    java.lang.String str25 = strSet22.pollLast();
    boolean boolean26 = strSet16.retainAll((java.util.Collection<java.lang.String>) strSet22);
    java.lang.String[] strArray28 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet29 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean30 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
    java.lang.String[] strArray33 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet34 = new java.util.TreeSet<java.lang.String>();
    boolean boolean35 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
    java.lang.String str37 = strSet34.lower("hi!");
    boolean boolean38 = strSet29.removeAll((java.util.Collection<java.lang.String>) strSet34);
    java.lang.String[] strArray40 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet41 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean42 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
    java.lang.String[] strArray45 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet46 = new java.util.TreeSet<java.lang.String>();
    boolean boolean47 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
    java.lang.String str49 = strSet46.lower("hi!");
    boolean boolean50 = strSet41.removeAll((java.util.Collection<java.lang.String>) strSet46);
    java.lang.String[] strArray52 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet53 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean54 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
    java.lang.String[] strArray57 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet58 = new java.util.TreeSet<java.lang.String>();
    boolean boolean59 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
    java.lang.String str61 = strSet58.lower("hi!");
    boolean boolean62 = strSet53.removeAll((java.util.Collection<java.lang.String>) strSet58);
    java.util.LinkedHashSet[] linkedHashSetArray64 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray65 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray64;
    strSetArray65[0] = strSet29;
    strSetArray65[1] = strSet41;
    strSetArray65[2] = strSet53;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray72 = strSet22.toArray(strSetArray65);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray73 = strSet10.toArray(strSetArray72);
    java.lang.String str74 = strSet10.toString();
    boolean boolean75 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet10);
    java.util.Spliterator<java.lang.String> strSpliterator76 = strSet10.spliterator();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNotNull(strStream14);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(strStream19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(strArray33);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strArray40);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(strArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertNotNull(strArray52);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    org.junit.Assert.assertNotNull(strArray57);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray64);
    org.junit.Assert.assertNotNull(strSetArray65);
    org.junit.Assert.assertNotNull(strSetArray72);
    org.junit.Assert.assertNotNull(strSetArray73);
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[]" + "'", str74.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    org.junit.Assert.assertNotNull(strSpliterator76);
  }

  @Test
  public void test075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test075");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.util.Iterator<java.lang.String> strItor1 = strSet0.iterator();
    boolean boolean3 = strSet0.add("[]");
    org.junit.Assert.assertNotNull(strItor1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
  }

  @Test
  public void test076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test076");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean7 = strSet0.add("[]");
    java.util.NavigableSet<java.lang.String> strSet8 = strSet0.descendingSet();
    java.util.TreeSet<java.lang.String> strSet9 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet0);
    java.lang.String[] strArray12 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    boolean boolean18 = strSet13.addAll((java.util.Collection<java.lang.String>) strSet15);
    java.lang.String str19 = strSet15.pollLast();
    java.util.TreeSet<java.lang.String> strSet20 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet15);
    boolean boolean21 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet20);
    boolean boolean23 = strSet20.add("hi!");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
  }

  @Test
  public void test077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test077");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.toString();
    boolean boolean5 = strSet0.remove((java.lang.Object) "hi!");
    java.lang.String str6 = strSet0.pollLast();
    java.lang.String str8 = strSet0.higher("hi!");
    java.util.SortedSet<java.lang.String> strSet11 = strSet0.subSet("[hi!]", "hi!");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strSet11);
  }

  @Test
  public void test078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test078");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    boolean boolean15 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean16 = strSet0.equals((java.lang.Object) strSet5);
    java.lang.String str17 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet18 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet0);
    java.lang.String str19 = strSet18.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNull(str19);
  }

  @Test
  public void test079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test079");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.lang.String str9 = strSet6.pollLast();
    boolean boolean10 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet6);
    java.lang.String str11 = strSet6.pollLast();
    java.lang.Object[] objArray12 = strSet6.toArray();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(objArray12);
  }

  @Test
  public void test080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test080");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet2.stream();
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean19 = strSet12.equals((java.lang.Object) "");
    boolean boolean20 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.stream.Stream<java.lang.String> strStream21 = strSet12.stream();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strStream21);
  }

  @Test
  public void test081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test081");
    java.lang.String[] strArray1 = new java.lang.String[] {""};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.NavigableSet<java.lang.String> strSet6 = strSet2.headSet("hi!", false);
    java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet2.comparator();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.lang.String str11 = strSet8.pollLast();
    java.util.stream.Stream<java.lang.String> strStream12 = strSet8.parallelStream();
    java.lang.String str14 = strSet8.ceiling("[]");
    boolean boolean15 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet8);
    java.lang.String[] strArray17 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.util.Iterator<java.lang.String> strItor20 = strSet18.descendingIterator();
    java.lang.String str21 = strSet18.toString();
    java.lang.String str23 = strSet18.floor("[hi!]");
    int int24 = strSet18.size();
    boolean boolean25 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet18);
    java.lang.String str26 = strSet18.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(wildcardComparator7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strItor20);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[hi!]" + "'", str21.equals("[hi!]"));
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
  }

  @Test
  public void test082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test082");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    java.util.SortedSet<java.lang.String> strSet23 = strSet17.headSet("hi!");
    boolean boolean24 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet17);
    java.util.TreeSet<java.lang.String> strSet25 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet17);
    java.lang.String str26 = strSet17.pollFirst();
    java.lang.String str28 = strSet17.floor("[]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNull(str28);
  }

  @Test
  public void test083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test083");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    int int8 = strSet2.size();
    java.lang.String str10 = strSet2.higher("[hi!]");
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    java.util.NavigableSet<java.lang.String> strSet17 = strSet11.headSet("[hi!]", false);
    java.util.stream.Stream<java.lang.String> strStream18 = strSet11.parallelStream();
    boolean boolean19 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet11);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(strSet17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test084");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.lang.Object obj24 = strSet0.clone();
    java.util.NavigableSet<java.lang.String> strSet27 = strSet0.headSet("[hi!]", false);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(obj24);
    org.junit.Assert.assertNotNull(strSet27);
  }

  @Test
  public void test085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test085");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet2.stream();
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean19 = strSet12.equals((java.lang.Object) "");
    boolean boolean20 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str23 = strSet21.higher("");
    boolean boolean24 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet21);
    java.lang.String[] strArray26 = new java.lang.String[] {""};
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    boolean boolean28 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
    java.util.NavigableSet<java.lang.String> strSet31 = strSet27.headSet("hi!", false);
    java.util.Comparator<? super java.lang.String> wildcardComparator32 = strSet27.comparator();
    java.util.TreeSet<java.lang.String> strSet33 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str35 = strSet33.higher("");
    java.lang.String str36 = strSet33.pollLast();
    java.util.stream.Stream<java.lang.String> strStream37 = strSet33.parallelStream();
    java.lang.String str39 = strSet33.ceiling("[]");
    boolean boolean40 = strSet27.addAll((java.util.Collection<java.lang.String>) strSet33);
    java.util.stream.Stream<java.lang.String> strStream41 = strSet27.parallelStream();
    boolean boolean42 = strSet21.addAll((java.util.Collection<java.lang.String>) strSet27);
    boolean boolean44 = strSet21.add("[hi!]");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(strArray26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strSet31);
    org.junit.Assert.assertNull(wildcardComparator32);
    org.junit.Assert.assertNull(str35);
    org.junit.Assert.assertNull(str36);
    org.junit.Assert.assertNotNull(strStream37);
    org.junit.Assert.assertNull(str39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(strStream41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
  }

  @Test
  public void test086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test086");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    java.lang.String[] strArray36 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.util.Iterator<java.lang.String> strItor39 = strSet37.descendingIterator();
    java.lang.String str40 = strSet37.toString();
    java.lang.String str42 = strSet37.higher("[]");
    boolean boolean43 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet37);
    java.lang.String[] strArray45 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet46 = new java.util.TreeSet<java.lang.String>();
    boolean boolean47 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
    java.util.Iterator<java.lang.String> strItor48 = strSet46.descendingIterator();
    java.lang.String str49 = strSet46.toString();
    java.lang.String str51 = strSet46.floor("[hi!]");
    int int52 = strSet46.size();
    java.util.SortedSet<java.lang.String> strSet54 = strSet46.tailSet("");
    boolean boolean55 = strSet37.retainAll((java.util.Collection<java.lang.String>) strSet54);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strItor39);
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[hi!]" + "'", str40.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(strArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(strItor48);
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[hi!]" + "'", str49.equals("[hi!]"));
    org.junit.Assert.assertNull(str51);
    org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    org.junit.Assert.assertNotNull(strSet54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
  }

  @Test
  public void test087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test087");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean8 = strSet2.equals((java.lang.Object) '4');
    java.lang.String str9 = strSet2.pollFirst();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
  }

  @Test
  public void test088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test088");
    java.lang.String[] strArray2 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    boolean boolean8 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    java.lang.String str18 = strSet14.pollLast();
    java.util.TreeSet<java.lang.String> strSet19 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean20 = strSet5.removeAll((java.util.Collection<java.lang.String>) strSet19);
    try {
      java.lang.String str21 = strSet19.last();
      org.junit.Assert.fail(
          "Expected exception of type java.util.NoSuchElementException; message: null");
    } catch (java.util.NoSuchElementException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
  }

  @Test
  public void test089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test089");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    boolean boolean15 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean16 = strSet0.equals((java.lang.Object) strSet5);
    java.lang.String str17 = strSet0.pollLast();
    java.util.Collection<java.lang.String> strCollection18 = null;
    try {
      boolean boolean19 = strSet0.containsAll(strCollection18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str17);
  }

  @Test
  public void test090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test090");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    java.lang.String[] strArray36 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.util.Iterator<java.lang.String> strItor39 = strSet37.descendingIterator();
    java.lang.String str40 = strSet37.toString();
    java.lang.String str42 = strSet37.higher("[]");
    boolean boolean43 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet37);
    java.lang.String[] strArray45 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet46 = new java.util.TreeSet<java.lang.String>();
    boolean boolean47 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
    java.util.Iterator<java.lang.String> strItor48 = strSet46.descendingIterator();
    java.lang.String str49 = strSet46.toString();
    java.util.TreeSet<java.lang.String> strSet50 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str52 = strSet50.higher("");
    java.util.stream.Stream<java.lang.String> strStream53 = strSet50.stream();
    java.lang.String str54 = strSet50.pollFirst();
    strSet50.clear();
    java.util.NavigableSet<java.lang.String> strSet56 = strSet50.descendingSet();
    boolean boolean57 = strSet46.retainAll((java.util.Collection<java.lang.String>) strSet56);
    java.lang.String[] strArray59 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet60 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean61 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
    java.lang.String[] strArray64 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet65 = new java.util.TreeSet<java.lang.String>();
    boolean boolean66 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
    java.lang.String str68 = strSet65.lower("hi!");
    boolean boolean69 = strSet60.removeAll((java.util.Collection<java.lang.String>) strSet65);
    boolean boolean70 = strSet46.removeAll((java.util.Collection<java.lang.String>) strSet60);
    java.util.TreeSet<java.lang.String> strSet71 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str73 = strSet71.higher("");
    java.util.stream.Stream<java.lang.String> strStream74 = strSet71.stream();
    java.lang.String str75 = strSet71.pollFirst();
    int int76 = strSet71.size();
    java.util.stream.Stream<java.lang.String> strStream77 = strSet71.stream();
    boolean boolean78 = strSet46.equals((java.lang.Object) strSet71);
    boolean boolean79 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet71);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strItor39);
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[hi!]" + "'", str40.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(strArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(strItor48);
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[hi!]" + "'", str49.equals("[hi!]"));
    org.junit.Assert.assertNull(str52);
    org.junit.Assert.assertNotNull(strStream53);
    org.junit.Assert.assertNull(str54);
    org.junit.Assert.assertNotNull(strSet56);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertNotNull(strArray59);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    org.junit.Assert.assertNotNull(strArray64);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertNull(str73);
    org.junit.Assert.assertNotNull(strStream74);
    org.junit.Assert.assertNull(str75);
    org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    org.junit.Assert.assertNotNull(strStream77);
    org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
  }

  @Test
  public void test091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test091");
    java.lang.String[] strArray2 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    boolean boolean8 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String str9 = strSet5.pollLast();
    java.lang.String str10 = strSet5.pollLast();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
  }

  @Test
  public void test092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test092");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray15 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet16 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean17 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
    java.lang.String[] strArray20 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    boolean boolean22 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
    java.lang.String str24 = strSet21.lower("hi!");
    boolean boolean25 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean26 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet16);
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str29 = strSet27.higher("");
    java.util.stream.Stream<java.lang.String> strStream30 = strSet27.stream();
    java.lang.String str31 = strSet27.pollFirst();
    int int32 = strSet27.size();
    java.util.stream.Stream<java.lang.String> strStream33 = strSet27.stream();
    boolean boolean34 = strSet2.equals((java.lang.Object) strSet27);
    java.util.stream.Stream<java.lang.String> strStream35 = strSet27.parallelStream();
    java.util.TreeSet<java.lang.String> strSet36 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str38 = strSet36.higher("");
    java.util.stream.Stream<java.lang.String> strStream39 = strSet36.stream();
    java.lang.String str40 = strSet36.pollFirst();
    int int41 = strSet36.size();
    java.util.stream.Stream<java.lang.String> strStream42 = strSet36.stream();
    java.lang.String str43 = strSet36.toString();
    try {
      boolean boolean44 = strSet27.contains((java.lang.Object) strSet36);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strStream30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strStream35);
    org.junit.Assert.assertNull(str38);
    org.junit.Assert.assertNotNull(strStream39);
    org.junit.Assert.assertNull(str40);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    org.junit.Assert.assertNotNull(strStream42);
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
  }

  @Test
  public void test093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test093");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    boolean boolean10 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.lang.String str12 = strSet7.pollFirst();
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(str12);
  }

  @Test
  public void test094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test094");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean8 = strSet2.equals((java.lang.Object) '4');
    java.lang.String[] strArray10 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    boolean boolean12 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
    java.util.Iterator<java.lang.String> strItor13 = strSet11.descendingIterator();
    java.lang.String str14 = strSet11.toString();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    java.lang.String str19 = strSet15.pollFirst();
    strSet15.clear();
    java.util.NavigableSet<java.lang.String> strSet21 = strSet15.descendingSet();
    boolean boolean22 = strSet11.retainAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean23 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet11);
    java.util.Collection<java.lang.String> strCollection24 = null;
    try {
      boolean boolean25 = strSet11.addAll(strCollection24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strItor13);
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[hi!]" + "'", str14.equals("[hi!]"));
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strSet21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
  }

  @Test
  public void test095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test095");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    boolean boolean10 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str15 = strSet13.higher("");
    java.util.stream.Stream<java.lang.String> strStream16 = strSet13.stream();
    java.lang.String str17 = strSet13.pollFirst();
    java.lang.String str18 = strSet13.pollLast();
    java.lang.Object[] objArray19 = strSet13.toArray();
    java.lang.Object[] objArray20 = strSet12.toArray(objArray19);
    boolean boolean21 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String str23 = strSet7.ceiling("[]");
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(objArray19);
    org.junit.Assert.assertNotNull(objArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNull(str23);
  }

  @Test
  public void test096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test096");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str3 = strSet1.higher("");
    java.util.stream.Stream<java.lang.String> strStream4 = strSet1.stream();
    java.lang.String str5 = strSet1.pollFirst();
    strSet1.clear();
    java.util.NavigableSet<java.lang.String> strSet7 = strSet1.descendingSet();
    java.lang.String str8 = strSet1.toString();
    java.lang.Class<?> wildcardClass9 = strSet1.getClass();
    boolean boolean10 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet1);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    org.junit.Assert.assertNotNull(wildcardClass9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test097");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str26 = strSet24.higher("");
    java.util.stream.Stream<java.lang.String> strStream27 = strSet24.stream();
    java.lang.String str28 = strSet24.pollFirst();
    java.lang.Object[] objArray29 = strSet24.toArray();
    boolean boolean30 = strSet15.containsAll((java.util.Collection<java.lang.String>) strSet24);
    java.util.TreeSet<java.lang.String> strSet31 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass32 = strSet31.getClass();
    java.lang.String[] strArray35 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet36 = new java.util.TreeSet<java.lang.String>();
    boolean boolean37 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
    java.util.TreeSet<java.lang.String> strSet38 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str40 = strSet38.higher("");
    boolean boolean41 = strSet36.addAll((java.util.Collection<java.lang.String>) strSet38);
    boolean boolean42 = strSet31.retainAll((java.util.Collection<java.lang.String>) strSet38);
    java.lang.String str43 = strSet38.toString();
    java.util.TreeSet<java.lang.String> strSet44 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str46 = strSet44.higher("");
    java.util.stream.Stream<java.lang.String> strStream47 = strSet44.stream();
    java.lang.String str48 = strSet44.pollFirst();
    strSet44.clear();
    java.util.NavigableSet<java.lang.String> strSet50 = strSet44.descendingSet();
    boolean boolean51 = strSet38.removeAll((java.util.Collection<java.lang.String>) strSet44);
    boolean boolean52 = strSet24.containsAll((java.util.Collection<java.lang.String>) strSet38);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(strStream27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNotNull(objArray29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(wildcardClass32);
    org.junit.Assert.assertNotNull(strArray35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNull(str40);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[]" + "'", str43.equals("[]"));
    org.junit.Assert.assertNull(str46);
    org.junit.Assert.assertNotNull(strStream47);
    org.junit.Assert.assertNull(str48);
    org.junit.Assert.assertNotNull(strSet50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
  }

  @Test
  public void test098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test098");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    boolean boolean5 = strSet0.add("[hi!]");
    boolean boolean7 = strSet0.add("[]");
    java.util.NavigableSet<java.lang.String> strSet8 = strSet0.descendingSet();
    java.lang.Class<?> wildcardClass9 = strSet0.getClass();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strSet8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test099");
    java.lang.String[] strArray2 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    boolean boolean8 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String str9 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet10 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String str11 = strSet10.pollFirst();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str11);
  }

  @Test
  public void test100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test100");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    java.lang.String str11 = strSet6.pollLast();
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str14 = strSet12.higher("");
    java.lang.String str15 = strSet12.pollLast();
    boolean boolean16 = strSet6.retainAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String[] strArray18 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet19 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean20 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
    java.lang.String[] strArray23 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    boolean boolean25 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
    java.lang.String str27 = strSet24.lower("hi!");
    boolean boolean28 = strSet19.removeAll((java.util.Collection<java.lang.String>) strSet24);
    java.lang.String[] strArray30 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet31 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean32 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
    java.lang.String[] strArray35 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet36 = new java.util.TreeSet<java.lang.String>();
    boolean boolean37 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
    java.lang.String str39 = strSet36.lower("hi!");
    boolean boolean40 = strSet31.removeAll((java.util.Collection<java.lang.String>) strSet36);
    java.lang.String[] strArray42 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet43 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean44 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
    java.lang.String[] strArray47 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet48 = new java.util.TreeSet<java.lang.String>();
    boolean boolean49 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
    java.lang.String str51 = strSet48.lower("hi!");
    boolean boolean52 = strSet43.removeAll((java.util.Collection<java.lang.String>) strSet48);
    java.util.LinkedHashSet[] linkedHashSetArray54 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray55 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray54;
    strSetArray55[0] = strSet19;
    strSetArray55[1] = strSet31;
    strSetArray55[2] = strSet43;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray62 = strSet12.toArray(strSetArray55);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray63 = strSet0.toArray(strSetArray62);
    java.lang.String str64 = strSet0.toString();
    java.util.TreeSet<java.lang.String> strSet65 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str67 = strSet65.higher("");
    java.util.stream.Stream<java.lang.String> strStream68 = strSet65.stream();
    java.lang.String str69 = strSet65.pollFirst();
    strSet65.clear();
    java.util.NavigableSet<java.lang.String> strSet71 = strSet65.descendingSet();
    java.lang.String str72 = strSet65.toString();
    java.lang.Class<?> wildcardClass73 = strSet65.getClass();
    boolean boolean74 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet65);
    java.util.TreeSet<java.lang.String> strSet75 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet0);
    java.util.TreeSet<java.lang.String> strSet76 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str78 = strSet76.higher("");
    java.util.stream.Stream<java.lang.String> strStream79 = strSet76.stream();
    java.lang.String str80 = strSet76.pollFirst();
    java.util.SortedSet<java.lang.String> strSet82 = strSet76.headSet("hi!");
    boolean boolean83 = strSet75.retainAll((java.util.Collection<java.lang.String>) strSet76);
    java.util.stream.Stream<java.lang.String> strStream84 = strSet75.parallelStream();
    java.lang.String str85 = strSet75.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strArray23);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(strArray35);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(strArray42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNotNull(strArray47);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray54);
    org.junit.Assert.assertNotNull(strSetArray55);
    org.junit.Assert.assertNotNull(strSetArray62);
    org.junit.Assert.assertNotNull(strSetArray63);
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[]" + "'", str64.equals("[]"));
    org.junit.Assert.assertNull(str67);
    org.junit.Assert.assertNotNull(strStream68);
    org.junit.Assert.assertNull(str69);
    org.junit.Assert.assertNotNull(strSet71);
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[]" + "'", str72.equals("[]"));
    org.junit.Assert.assertNotNull(wildcardClass73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    org.junit.Assert.assertNull(str78);
    org.junit.Assert.assertNotNull(strStream79);
    org.junit.Assert.assertNull(str80);
    org.junit.Assert.assertNotNull(strSet82);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    org.junit.Assert.assertNotNull(strStream84);
    org.junit.Assert.assertNull(str85);
  }

  @Test
  public void test101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test101");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.lang.String[] strArray9 = new java.lang.String[] {"", "[hi!]", ""};
    java.lang.Comparable<java.lang.String>[] strComparableArray10 =
        strSet0.toArray((java.lang.Comparable<java.lang.String>[]) strArray9);
    java.lang.Class<?> wildcardClass11 = strComparableArray10.getClass();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertNotNull(strComparableArray10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test102");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    boolean boolean10 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.lang.String str12 = strSet7.toString();
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str15 = strSet13.higher("");
    java.util.stream.Stream<java.lang.String> strStream16 = strSet13.stream();
    java.lang.String str17 = strSet13.pollFirst();
    strSet13.clear();
    java.util.NavigableSet<java.lang.String> strSet19 = strSet13.descendingSet();
    boolean boolean20 = strSet7.removeAll((java.util.Collection<java.lang.String>) strSet13);
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str23 = strSet21.higher("");
    java.lang.String str24 = strSet21.pollLast();
    java.util.NavigableSet<java.lang.String> strSet27 = strSet21.headSet("[hi!]", false);
    java.lang.Object[] objArray28 = strSet21.toArray();
    boolean boolean29 = strSet7.equals((java.lang.Object) strSet21);
    java.lang.String[] strArray31 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    boolean boolean33 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
    java.util.Iterator<java.lang.String> strItor34 = strSet32.descendingIterator();
    java.lang.String str35 = strSet32.toString();
    java.util.TreeSet<java.lang.String> strSet36 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str38 = strSet36.higher("");
    java.util.stream.Stream<java.lang.String> strStream39 = strSet36.stream();
    java.lang.String str40 = strSet36.pollFirst();
    strSet36.clear();
    java.util.NavigableSet<java.lang.String> strSet42 = strSet36.descendingSet();
    boolean boolean43 = strSet32.retainAll((java.util.Collection<java.lang.String>) strSet42);
    java.lang.String[] strArray45 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet46 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean47 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
    java.lang.String[] strArray50 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet51 = new java.util.TreeSet<java.lang.String>();
    boolean boolean52 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
    java.lang.String str54 = strSet51.lower("hi!");
    boolean boolean55 = strSet46.removeAll((java.util.Collection<java.lang.String>) strSet51);
    boolean boolean56 = strSet32.removeAll((java.util.Collection<java.lang.String>) strSet46);
    java.util.TreeSet<java.lang.String> strSet57 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str59 = strSet57.higher("");
    java.util.stream.Stream<java.lang.String> strStream60 = strSet57.stream();
    java.lang.String str61 = strSet57.pollFirst();
    int int62 = strSet57.size();
    java.util.stream.Stream<java.lang.String> strStream63 = strSet57.stream();
    boolean boolean64 = strSet32.equals((java.lang.Object) strSet57);
    java.util.stream.Stream<java.lang.String> strStream65 = strSet57.parallelStream();
    try {
      boolean boolean66 = strSet7.remove((java.lang.Object) strSet57);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strSet19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNotNull(strSet27);
    org.junit.Assert.assertNotNull(objArray28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(strArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(strItor34);
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[hi!]" + "'", str35.equals("[hi!]"));
    org.junit.Assert.assertNull(str38);
    org.junit.Assert.assertNotNull(strStream39);
    org.junit.Assert.assertNull(str40);
    org.junit.Assert.assertNotNull(strSet42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertNotNull(strArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(strArray50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertNull(str59);
    org.junit.Assert.assertNotNull(strStream60);
    org.junit.Assert.assertNull(str61);
    org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    org.junit.Assert.assertNotNull(strStream63);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    org.junit.Assert.assertNotNull(strStream65);
  }

  @Test
  public void test103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test103");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet2.stream();
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean19 = strSet12.equals((java.lang.Object) "");
    boolean boolean20 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str23 = strSet21.higher("");
    boolean boolean24 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet21);
    java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str27 = strSet25.higher("");
    java.lang.String str28 = strSet25.pollLast();
    boolean boolean29 = strSet21.containsAll((java.util.Collection<java.lang.String>) strSet25);
    java.lang.String str30 = strSet25.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNull(str30);
  }

  @Test
  public void test104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test104");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    boolean boolean10 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str15 = strSet13.higher("");
    java.util.stream.Stream<java.lang.String> strStream16 = strSet13.stream();
    java.lang.String str17 = strSet13.pollFirst();
    java.lang.String str18 = strSet13.pollLast();
    java.lang.Object[] objArray19 = strSet13.toArray();
    java.lang.Object[] objArray20 = strSet12.toArray(objArray19);
    boolean boolean21 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str24 = strSet22.higher("");
    java.util.stream.Stream<java.lang.String> strStream25 = strSet22.stream();
    java.lang.String str26 = strSet22.pollFirst();
    strSet22.clear();
    java.util.NavigableSet<java.lang.String> strSet28 = strSet22.descendingSet();
    boolean boolean29 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet22);
    java.util.stream.Stream<java.lang.String> strStream30 = strSet22.parallelStream();
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNotNull(strStream16);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(objArray19);
    org.junit.Assert.assertNotNull(objArray20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNotNull(strStream25);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(strSet28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strStream30);
  }

  @Test
  public void test105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test105");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.NavigableSet<java.lang.String> strSet17 = strSet8.headSet("hi!", true);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strSet17);
  }

  @Test
  public void test106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test106");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
    java.lang.String str6 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
    java.lang.String str11 = strSet7.pollFirst();
    strSet7.clear();
    boolean boolean13 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet7);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(strStream10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test107");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.util.stream.Stream<java.lang.String> strStream9 = strSet6.stream();
    java.lang.String str10 = strSet6.pollFirst();
    strSet6.clear();
    java.util.NavigableSet<java.lang.String> strSet12 = strSet6.descendingSet();
    boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
    boolean boolean14 = strSet2.isEmpty();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.lang.String str18 = strSet15.toString();
    java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str21 = strSet19.higher("");
    java.util.stream.Stream<java.lang.String> strStream22 = strSet19.stream();
    java.lang.String str23 = strSet19.pollFirst();
    java.lang.String str24 = strSet19.pollLast();
    java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str27 = strSet25.higher("");
    java.lang.String str28 = strSet25.pollLast();
    boolean boolean29 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet25);
    boolean boolean30 = strSet15.equals((java.lang.Object) strSet19);
    boolean boolean31 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet15);
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str34 = strSet32.higher("");
    java.util.stream.Stream<java.lang.String> strStream35 = strSet32.stream();
    java.lang.String str36 = strSet32.pollFirst();
    int int37 = strSet32.size();
    java.util.stream.Stream<java.lang.String> strStream38 = strSet32.stream();
    java.lang.String str39 = strSet32.toString();
    java.util.TreeSet<java.lang.String> strSet40 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet41 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str43 = strSet41.higher("");
    java.util.stream.Stream<java.lang.String> strStream44 = strSet41.stream();
    java.lang.String str45 = strSet41.pollFirst();
    java.lang.String str46 = strSet41.pollLast();
    java.lang.Object[] objArray47 = strSet41.toArray();
    java.lang.Object[] objArray48 = strSet40.toArray(objArray47);
    boolean boolean49 = strSet32.equals((java.lang.Object) strSet40);
    boolean boolean50 = strSet15.retainAll((java.util.Collection<java.lang.String>) strSet40);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strSet12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strStream22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNull(str34);
    org.junit.Assert.assertNotNull(strStream35);
    org.junit.Assert.assertNull(str36);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    org.junit.Assert.assertNotNull(strStream38);
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
    org.junit.Assert.assertNull(str43);
    org.junit.Assert.assertNotNull(strStream44);
    org.junit.Assert.assertNull(str45);
    org.junit.Assert.assertNull(str46);
    org.junit.Assert.assertNotNull(objArray47);
    org.junit.Assert.assertNotNull(objArray48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
  }

  @Test
  public void test108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test108");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean8 = strSet2.equals((java.lang.Object) '4');
    java.lang.String[] strArray10 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    boolean boolean12 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
    java.util.Iterator<java.lang.String> strItor13 = strSet11.descendingIterator();
    java.lang.String str14 = strSet11.toString();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    java.lang.String str19 = strSet15.pollFirst();
    strSet15.clear();
    java.util.NavigableSet<java.lang.String> strSet21 = strSet15.descendingSet();
    boolean boolean22 = strSet11.retainAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean23 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet11);
    java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass25 = strSet24.getClass();
    java.lang.String[] strArray28 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet29 = new java.util.TreeSet<java.lang.String>();
    boolean boolean30 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
    java.util.TreeSet<java.lang.String> strSet31 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str33 = strSet31.higher("");
    boolean boolean34 = strSet29.addAll((java.util.Collection<java.lang.String>) strSet31);
    boolean boolean35 = strSet24.retainAll((java.util.Collection<java.lang.String>) strSet31);
    java.lang.String str36 = strSet31.toString();
    boolean boolean37 = strSet11.remove((java.lang.Object) str36);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strItor13);
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[hi!]" + "'", str14.equals("[hi!]"));
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strSet21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNotNull(wildcardClass25);
    org.junit.Assert.assertNotNull(strArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNull(str33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[]" + "'", str36.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
  }

  @Test
  public void test109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test109");
    java.lang.String[] strArray2 = new java.lang.String[] {"[hi!]", "[hi!]"};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.lang.String str5 = strSet3.pollLast();
    java.lang.Class<?> wildcardClass6 = strSet3.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test110");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet2.stream();
    java.util.stream.Stream<java.lang.String> strStream9 = strSet2.stream();
    java.util.stream.Stream<java.lang.String> strStream10 = strSet2.stream();
    java.util.Collection<java.lang.String> strCollection11 = null;
    try {
      boolean boolean12 = strSet2.containsAll(strCollection11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNotNull(strStream9);
    org.junit.Assert.assertNotNull(strStream10);
  }

  @Test
  public void test111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test111");
    java.lang.String[] strArray2 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
    boolean boolean4 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
    java.lang.String str6 = strSet3.lower("hi!");
    java.lang.String[] strArray9 = new java.lang.String[] {"[hi!]", "[hi!]"};
    java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
    boolean boolean11 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
    java.lang.String str12 = strSet10.pollLast();
    java.lang.String[] strArray14 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    boolean boolean16 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
    java.util.Iterator<java.lang.String> strItor17 = strSet15.descendingIterator();
    boolean boolean18 = strSet10.removeAll((java.util.Collection<java.lang.String>) strSet15);
    boolean boolean19 = strSet3.containsAll((java.util.Collection<java.lang.String>) strSet10);
    java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str22 = strSet20.higher("");
    java.lang.String str23 = strSet20.pollLast();
    java.util.stream.Stream<java.lang.String> strStream24 = strSet20.parallelStream();
    java.util.TreeSet<java.lang.String> strSet25 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet20);
    java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str28 = strSet26.higher("");
    java.util.stream.Stream<java.lang.String> strStream29 = strSet26.stream();
    java.lang.String str30 = strSet26.pollFirst();
    java.lang.String str31 = strSet26.pollLast();
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str34 = strSet32.higher("");
    java.lang.String str35 = strSet32.pollLast();
    boolean boolean36 = strSet26.retainAll((java.util.Collection<java.lang.String>) strSet32);
    java.lang.String[] strArray38 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet39 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean40 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
    java.lang.String[] strArray43 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet44 = new java.util.TreeSet<java.lang.String>();
    boolean boolean45 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
    java.lang.String str47 = strSet44.lower("hi!");
    boolean boolean48 = strSet39.removeAll((java.util.Collection<java.lang.String>) strSet44);
    java.lang.String[] strArray50 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet51 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean52 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
    java.lang.String[] strArray55 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>();
    boolean boolean57 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
    java.lang.String str59 = strSet56.lower("hi!");
    boolean boolean60 = strSet51.removeAll((java.util.Collection<java.lang.String>) strSet56);
    java.lang.String[] strArray62 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet63 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean64 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
    java.lang.String[] strArray67 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet68 = new java.util.TreeSet<java.lang.String>();
    boolean boolean69 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
    java.lang.String str71 = strSet68.lower("hi!");
    boolean boolean72 = strSet63.removeAll((java.util.Collection<java.lang.String>) strSet68);
    java.util.LinkedHashSet[] linkedHashSetArray74 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray75 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray74;
    strSetArray75[0] = strSet39;
    strSetArray75[1] = strSet51;
    strSetArray75[2] = strSet63;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray82 = strSet32.toArray(strSetArray75);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray83 = strSet20.toArray(strSetArray82);
    java.lang.Class<?> wildcardClass84 = strSet20.getClass();
    try {
      boolean boolean85 = strSet10.contains((java.lang.Object) strSet20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[hi!]" + "'", str12.equals("[hi!]"));
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strItor17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertNotNull(strStream24);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNotNull(strStream29);
    org.junit.Assert.assertNull(str30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertNull(str34);
    org.junit.Assert.assertNull(str35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(strArray38);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(strArray43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(strArray50);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(strArray55);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    org.junit.Assert.assertNotNull(strArray62);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    org.junit.Assert.assertNotNull(strArray67);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray74);
    org.junit.Assert.assertNotNull(strSetArray75);
    org.junit.Assert.assertNotNull(strSetArray82);
    org.junit.Assert.assertNotNull(strSetArray83);
    org.junit.Assert.assertNotNull(wildcardClass84);
  }

  @Test
  public void test112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test112");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.lang.Object[] objArray6 = strSet0.toArray();
    java.lang.String str7 = strSet0.toString();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(objArray6);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
  }

  @Test
  public void test113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test113");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    java.util.SortedSet<java.lang.String> strSet23 = strSet17.headSet("hi!");
    boolean boolean24 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet17);
    java.lang.String str25 = strSet17.pollFirst();
    java.lang.String str26 = strSet17.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertNull(str26);
  }

  @Test
  public void test114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test114");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.util.SortedSet<java.lang.String> strSet6 = strSet0.subSet("[hi!]", "[hi!]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNotNull(strSet6);
  }

  @Test
  public void test115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test115");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    java.lang.String str10 = strSet5.pollLast();
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.lang.String str14 = strSet11.pollLast();
    boolean boolean15 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean16 = strSet0.equals((java.lang.Object) strSet5);
    java.lang.String str17 = strSet5.pollLast();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str17);
  }

  @Test
  public void test116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test116");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    int int10 = strSet5.size();
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean13 = strSet0.add("");
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    java.lang.String str17 = strSet14.pollLast();
    java.util.stream.Stream<java.lang.String> strStream18 = strSet14.parallelStream();
    java.util.TreeSet<java.lang.String> strSet19 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet14);
    java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str22 = strSet20.higher("");
    java.util.stream.Stream<java.lang.String> strStream23 = strSet20.stream();
    java.lang.String str24 = strSet20.pollFirst();
    java.lang.String str25 = strSet20.pollLast();
    java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str28 = strSet26.higher("");
    java.lang.String str29 = strSet26.pollLast();
    boolean boolean30 = strSet20.retainAll((java.util.Collection<java.lang.String>) strSet26);
    java.lang.String[] strArray32 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet33 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean34 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
    java.lang.String[] strArray37 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet38 = new java.util.TreeSet<java.lang.String>();
    boolean boolean39 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
    java.lang.String str41 = strSet38.lower("hi!");
    boolean boolean42 = strSet33.removeAll((java.util.Collection<java.lang.String>) strSet38);
    java.lang.String[] strArray44 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet45 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean46 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
    java.lang.String[] strArray49 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet50 = new java.util.TreeSet<java.lang.String>();
    boolean boolean51 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
    java.lang.String str53 = strSet50.lower("hi!");
    boolean boolean54 = strSet45.removeAll((java.util.Collection<java.lang.String>) strSet50);
    java.lang.String[] strArray56 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet57 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean58 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
    java.lang.String[] strArray61 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet62 = new java.util.TreeSet<java.lang.String>();
    boolean boolean63 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
    java.lang.String str65 = strSet62.lower("hi!");
    boolean boolean66 = strSet57.removeAll((java.util.Collection<java.lang.String>) strSet62);
    java.util.LinkedHashSet[] linkedHashSetArray68 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray69 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray68;
    strSetArray69[0] = strSet33;
    strSetArray69[1] = strSet45;
    strSetArray69[2] = strSet57;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray76 = strSet26.toArray(strSetArray69);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray77 = strSet14.toArray(strSetArray76);
    try {
      java.lang.Cloneable[] cloneableArray78 =
          strSet0.toArray((java.lang.Cloneable[]) strSetArray77);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
    } catch (java.lang.ArrayStoreException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNotNull(strStream23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertNotNull(strArray32);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray37);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(strArray44);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(strArray49);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    org.junit.Assert.assertNotNull(strArray56);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    org.junit.Assert.assertNotNull(strArray61);
    org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray68);
    org.junit.Assert.assertNotNull(strSetArray69);
    org.junit.Assert.assertNotNull(strSetArray76);
    org.junit.Assert.assertNotNull(strSetArray77);
  }

  @Test
  public void test117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test117");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    java.util.SortedSet<java.lang.String> strSet23 = strSet17.headSet("hi!");
    boolean boolean24 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet17);
    java.lang.String str25 = strSet17.pollFirst();
    java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str28 = strSet26.higher("");
    java.lang.String str29 = strSet26.pollLast();
    java.util.NavigableSet<java.lang.String> strSet32 = strSet26.headSet("[hi!]", false);
    java.util.stream.Stream<java.lang.String> strStream33 = strSet26.parallelStream();
    java.util.stream.Stream[] streamArray35 = new java.util.stream.Stream[1];
    @SuppressWarnings("unchecked")
    java.util.stream.Stream<java.lang.String>[] strStreamArray36 =
        (java.util.stream.Stream<java.lang.String>[]) streamArray35;
    strStreamArray36[0] = strStream33;
    java.util.stream.Stream<java.lang.String>[] strStreamArray39 =
        strSet17.toArray(strStreamArray36);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNull(str29);
    org.junit.Assert.assertNotNull(strSet32);
    org.junit.Assert.assertNotNull(strStream33);
    org.junit.Assert.assertNotNull(streamArray35);
    org.junit.Assert.assertNotNull(strStreamArray36);
    org.junit.Assert.assertNotNull(strStreamArray39);
  }

  @Test
  public void test118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test118");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    int int8 = strSet2.size();
    java.lang.String str10 = strSet2.higher("[hi!]");
    java.lang.String[] strArray12 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.util.Iterator<java.lang.String> strItor15 = strSet13.descendingIterator();
    java.lang.String str16 = strSet13.toString();
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    strSet17.clear();
    java.util.NavigableSet<java.lang.String> strSet23 = strSet17.descendingSet();
    boolean boolean24 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet23);
    boolean boolean25 = strSet2.equals((java.lang.Object) strSet13);
    java.lang.Object obj26 = strSet2.clone();
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass28 = strSet27.getClass();
    java.lang.String[] strArray31 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    boolean boolean33 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
    java.util.TreeSet<java.lang.String> strSet34 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str36 = strSet34.higher("");
    boolean boolean37 = strSet32.addAll((java.util.Collection<java.lang.String>) strSet34);
    boolean boolean38 = strSet27.retainAll((java.util.Collection<java.lang.String>) strSet34);
    java.util.TreeSet<java.lang.String> strSet39 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet40 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str42 = strSet40.higher("");
    java.util.stream.Stream<java.lang.String> strStream43 = strSet40.stream();
    java.lang.String str44 = strSet40.pollFirst();
    java.lang.String str45 = strSet40.pollLast();
    java.lang.Object[] objArray46 = strSet40.toArray();
    java.lang.Object[] objArray47 = strSet39.toArray(objArray46);
    boolean boolean48 = strSet34.addAll((java.util.Collection<java.lang.String>) strSet39);
    boolean boolean49 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet39);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strItor15);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[hi!]" + "'", str16.equals("[hi!]"));
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(obj26);
    org.junit.Assert.assertNotNull(wildcardClass28);
    org.junit.Assert.assertNotNull(strArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNull(str36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNull(str42);
    org.junit.Assert.assertNotNull(strStream43);
    org.junit.Assert.assertNull(str44);
    org.junit.Assert.assertNull(str45);
    org.junit.Assert.assertNotNull(objArray46);
    org.junit.Assert.assertNotNull(objArray47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
  }

  @Test
  public void test119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test119");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.lang.String str9 = strSet6.pollLast();
    boolean boolean10 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet6);
    java.lang.String[] strArray12 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet13 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.lang.String str21 = strSet18.lower("hi!");
    boolean boolean22 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet18);
    java.lang.String[] strArray24 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet25 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean26 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
    java.lang.String[] strArray29 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
    boolean boolean31 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
    java.lang.String str33 = strSet30.lower("hi!");
    boolean boolean34 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet30);
    java.lang.String[] strArray36 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet37 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.lang.String[] strArray41 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet42 = new java.util.TreeSet<java.lang.String>();
    boolean boolean43 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
    java.lang.String str45 = strSet42.lower("hi!");
    boolean boolean46 = strSet37.removeAll((java.util.Collection<java.lang.String>) strSet42);
    java.util.LinkedHashSet[] linkedHashSetArray48 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray49 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray48;
    strSetArray49[0] = strSet13;
    strSetArray49[1] = strSet25;
    strSetArray49[2] = strSet37;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray56 = strSet6.toArray(strSetArray49);
    java.lang.String str57 = strSet6.pollFirst();
    java.util.TreeSet<java.lang.String> strSet58 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str60 = strSet58.higher("");
    java.util.stream.Stream<java.lang.String> strStream61 = strSet58.stream();
    java.lang.String str62 = strSet58.pollFirst();
    strSet58.clear();
    java.util.SortedSet<java.lang.String> strSet65 = strSet58.headSet("[hi!]");
    boolean boolean66 = strSet6.addAll((java.util.Collection<java.lang.String>) strSet58);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(strArray29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strArray41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray48);
    org.junit.Assert.assertNotNull(strSetArray49);
    org.junit.Assert.assertNotNull(strSetArray56);
    org.junit.Assert.assertNull(str57);
    org.junit.Assert.assertNull(str60);
    org.junit.Assert.assertNotNull(strStream61);
    org.junit.Assert.assertNull(str62);
    org.junit.Assert.assertNotNull(strSet65);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
  }

  @Test
  public void test120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test120");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    java.util.SortedSet<java.lang.String> strSet23 = strSet17.headSet("hi!");
    boolean boolean24 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet17);
    java.util.TreeSet<java.lang.String> strSet25 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet17);
    java.lang.String str26 = strSet17.pollFirst();
    java.lang.Class<?> wildcardClass27 = strSet17.getClass();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str26);
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test121");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    java.util.stream.Stream<java.lang.String> strStream7 = strSet0.parallelStream();
    java.util.stream.Stream<java.lang.String> strStream8 = strSet0.stream();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(strStream7);
    org.junit.Assert.assertNotNull(strStream8);
  }

  @Test
  public void test122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test122");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str7 = strSet5.higher("");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet5.stream();
    java.lang.String str9 = strSet5.pollFirst();
    int int10 = strSet5.size();
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean13 = strSet5.add("");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test123");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.lang.String str4 = strList2.toString();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[hi!]" + "'", str4.equals("[hi!]"));
  }

  @Test
  public void test124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test124");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.lang.String str6 = strSet0.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str6);
  }

  @Test
  public void test125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test125");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str3 = strSet1.higher("");
    java.util.stream.Stream<java.lang.String> strStream4 = strSet1.stream();
    java.lang.String str5 = strSet1.pollFirst();
    java.lang.String str6 = strSet1.pollLast();
    java.lang.Object[] objArray7 = strSet1.toArray();
    java.lang.Object[] objArray8 = strSet0.toArray(objArray7);
    java.lang.String[] strArray10 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    boolean boolean12 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
    java.util.Iterator<java.lang.String> strItor13 = strSet11.descendingIterator();
    java.lang.String str14 = strSet11.toString();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    java.lang.String str19 = strSet15.pollFirst();
    strSet15.clear();
    java.util.NavigableSet<java.lang.String> strSet21 = strSet15.descendingSet();
    boolean boolean22 = strSet11.retainAll((java.util.Collection<java.lang.String>) strSet21);
    java.lang.String[] strArray24 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet25 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean26 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
    java.lang.String[] strArray29 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
    boolean boolean31 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
    java.lang.String str33 = strSet30.lower("hi!");
    boolean boolean34 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet30);
    boolean boolean35 = strSet11.removeAll((java.util.Collection<java.lang.String>) strSet25);
    try {
      boolean boolean36 = strSet0.remove((java.lang.Object) strSet11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.TreeSet cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertNotNull(objArray8);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strItor13);
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[hi!]" + "'", str14.equals("[hi!]"));
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strSet21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(strArray29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
  }

  @Test
  public void test126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test126");
    java.lang.String[] strArray1 = new java.lang.String[] {""};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.NavigableSet<java.lang.String> strSet6 = strSet2.headSet("hi!", false);
    java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet2.comparator();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.lang.String str11 = strSet8.pollLast();
    java.util.stream.Stream<java.lang.String> strStream12 = strSet8.parallelStream();
    java.lang.String str14 = strSet8.ceiling("[]");
    boolean boolean15 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet8);
    java.lang.String[] strArray17 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.util.Iterator<java.lang.String> strItor20 = strSet18.descendingIterator();
    java.lang.String str21 = strSet18.toString();
    java.lang.String str23 = strSet18.floor("[hi!]");
    int int24 = strSet18.size();
    boolean boolean25 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet18);
    java.lang.String str27 = strSet2.floor("");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNull(wildcardComparator7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strItor20);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[hi!]" + "'", str21.equals("[hi!]"));
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertNull(str27);
  }

  @Test
  public void test127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test127");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.Object[] objArray2 = strSet0.toArray();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.Iterator<java.lang.String> strItor7 = strSet5.descendingIterator();
    boolean boolean9 = strSet5.add("hi!");
    java.lang.String str10 = strSet5.toString();
    boolean boolean11 = strSet0.remove((java.lang.Object) str10);
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(objArray2);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(strItor7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[hi!]" + "'", str10.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test128");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    int int8 = strSet2.size();
    java.lang.String str10 = strSet2.higher("[hi!]");
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str13 = strSet11.higher("");
    java.util.stream.Stream<java.lang.String> strStream14 = strSet11.stream();
    java.lang.String str15 = strSet11.pollFirst();
    java.lang.String str16 = strSet11.pollLast();
    boolean boolean17 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet11);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNotNull(strStream14);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test129");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str8 = strSet6.higher("");
    java.lang.String str9 = strSet6.pollLast();
    boolean boolean10 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet6);
    java.lang.String[] strArray12 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet13 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.lang.String[] strArray17 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
    boolean boolean19 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
    java.lang.String str21 = strSet18.lower("hi!");
    boolean boolean22 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet18);
    java.lang.String[] strArray24 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet25 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean26 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
    java.lang.String[] strArray29 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
    boolean boolean31 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
    java.lang.String str33 = strSet30.lower("hi!");
    boolean boolean34 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet30);
    java.lang.String[] strArray36 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet37 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean38 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
    java.lang.String[] strArray41 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet42 = new java.util.TreeSet<java.lang.String>();
    boolean boolean43 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
    java.lang.String str45 = strSet42.lower("hi!");
    boolean boolean46 = strSet37.removeAll((java.util.Collection<java.lang.String>) strSet42);
    java.util.LinkedHashSet[] linkedHashSetArray48 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray49 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray48;
    strSetArray49[0] = strSet13;
    strSetArray49[1] = strSet25;
    strSetArray49[2] = strSet37;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray56 = strSet6.toArray(strSetArray49);
    boolean boolean58 = strSet6.add("");
    java.lang.Object[] objArray59 = strSet6.toArray();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNull(str8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(strArray29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(strArray36);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strArray41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray48);
    org.junit.Assert.assertNotNull(strSetArray49);
    org.junit.Assert.assertNotNull(strSetArray56);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    org.junit.Assert.assertNotNull(objArray59);
  }

  @Test
  public void test130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test130");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.lang.String str4 = strSet0.pollLast();
    java.lang.String str5 = strSet0.pollLast();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
  }

  @Test
  public void test131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test131");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    boolean boolean8 = strSet2.equals((java.lang.Object) '4');
    java.lang.String[] strArray10 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
    boolean boolean12 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
    java.util.Iterator<java.lang.String> strItor13 = strSet11.descendingIterator();
    java.lang.String str14 = strSet11.toString();
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    java.lang.String str19 = strSet15.pollFirst();
    strSet15.clear();
    java.util.NavigableSet<java.lang.String> strSet21 = strSet15.descendingSet();
    boolean boolean22 = strSet11.retainAll((java.util.Collection<java.lang.String>) strSet21);
    boolean boolean23 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet11);
    boolean boolean25 = strSet11.equals((java.lang.Object) false);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(strItor13);
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[hi!]" + "'", str14.equals("[hi!]"));
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strSet21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
  }

  @Test
  public void test132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test132");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    java.lang.String str5 = strSet0.pollLast();
    boolean boolean7 = strSet0.add("[]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet0.parallelStream();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strStream8);
  }

  @Test
  public void test133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test133");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.toString();
    boolean boolean5 = strSet0.remove((java.lang.Object) "hi!");
    java.lang.String str6 = strSet0.pollLast();
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    java.util.stream.Stream<java.lang.String> strStream10 = strSet7.stream();
    boolean boolean12 = strSet7.add("[hi!]");
    boolean boolean14 = strSet7.add("[]");
    java.util.NavigableSet<java.lang.String> strSet15 = strSet7.descendingSet();
    boolean boolean16 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet7);
    java.lang.String[] strArray18 = new java.lang.String[] {""};
    java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
    boolean boolean20 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
    java.util.NavigableSet<java.lang.String> strSet23 = strSet19.headSet("hi!", false);
    java.util.Comparator<? super java.lang.String> wildcardComparator24 = strSet19.comparator();
    java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str27 = strSet25.higher("");
    java.lang.String str28 = strSet25.pollLast();
    java.util.stream.Stream<java.lang.String> strStream29 = strSet25.parallelStream();
    java.lang.String str31 = strSet25.ceiling("[]");
    boolean boolean32 = strSet19.addAll((java.util.Collection<java.lang.String>) strSet25);
    java.lang.String[] strArray34 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet35 = new java.util.TreeSet<java.lang.String>();
    boolean boolean36 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
    java.util.Iterator<java.lang.String> strItor37 = strSet35.descendingIterator();
    java.lang.String str38 = strSet35.toString();
    java.lang.String str40 = strSet35.floor("[hi!]");
    int int41 = strSet35.size();
    boolean boolean42 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet35);
    java.util.stream.Stream<java.lang.String> strStream43 = strSet35.parallelStream();
    try {
      boolean boolean44 = strSet0.remove((java.lang.Object) strStream43);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: java.util.stream.ReferencePipeline$Head cannot be cast to java.lang.Comparable");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(strStream10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(strArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertNull(wildcardComparator24);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertNull(str28);
    org.junit.Assert.assertNotNull(strStream29);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(strArray34);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertNotNull(strItor37);
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[hi!]" + "'", str38.equals("[hi!]"));
    org.junit.Assert.assertNull(str40);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(strStream43);
  }

  @Test
  public void test134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test134");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.Class<?> wildcardClass1 = strSet0.getClass();
    java.lang.String[] strArray4 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str9 = strSet7.higher("");
    boolean boolean10 = strSet5.addAll((java.util.Collection<java.lang.String>) strSet7);
    boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet7);
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str14 = strSet12.higher("");
    java.lang.String str15 = strSet12.pollLast();
    java.util.NavigableSet<java.lang.String> strSet18 = strSet12.headSet("[hi!]", false);
    boolean boolean19 = strSet12.isEmpty();
    java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str22 = strSet20.higher("");
    java.util.stream.Stream<java.lang.String> strStream23 = strSet20.stream();
    java.lang.String str24 = strSet20.pollFirst();
    java.lang.String str25 = strSet20.pollLast();
    boolean boolean26 = strSet12.containsAll((java.util.Collection<java.lang.String>) strSet20);
    java.lang.Object[] objArray27 = strSet12.toArray();
    boolean boolean28 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet12);
    java.lang.String str29 = strSet12.toString();
    org.junit.Assert.assertNotNull(wildcardClass1);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNull(str15);
    org.junit.Assert.assertNotNull(strSet18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNotNull(strStream23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(objArray27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[]" + "'", str29.equals("[]"));
  }

  @Test
  public void test135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test135");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.stream.Stream<java.lang.String> strStream4 = strSet0.parallelStream();
    java.util.TreeSet<java.lang.String> strSet5 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
    java.util.TreeSet<java.lang.String> strSet6 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet5);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strStream4);
  }

  @Test
  public void test136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test136");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet5);
    java.lang.String str7 = strSet5.pollFirst();
    try {
      java.lang.String str8 = strSet5.last();
      org.junit.Assert.fail(
          "Expected exception of type java.util.NoSuchElementException; message: null");
    } catch (java.util.NoSuchElementException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(str7);
  }

  @Test
  public void test137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test137");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet2.comparator();
    boolean boolean9 = strSet2.add("hi!");
    java.lang.String str11 = strSet2.higher("");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(wildcardComparator7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
  }

  @Test
  public void test138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test138");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    boolean boolean6 = strSet2.add("hi!");
    java.lang.String str7 = strSet2.toString();
    boolean boolean9 = strSet2.equals((java.lang.Object) (-1L));
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[hi!]" + "'", str7.equals("[hi!]"));
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test139");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    java.lang.Object[] objArray7 = strSet0.toArray();
    boolean boolean9 = strSet0.add("");
    java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str12 = strSet10.higher("");
    java.lang.String str13 = strSet10.pollLast();
    java.util.stream.Stream<java.lang.String> strStream14 = strSet10.parallelStream();
    java.util.TreeSet<java.lang.String> strSet15 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet10);
    java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str18 = strSet16.higher("");
    java.util.stream.Stream<java.lang.String> strStream19 = strSet16.stream();
    java.lang.String str20 = strSet16.pollFirst();
    java.lang.String str21 = strSet16.pollLast();
    java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str24 = strSet22.higher("");
    java.lang.String str25 = strSet22.pollLast();
    boolean boolean26 = strSet16.retainAll((java.util.Collection<java.lang.String>) strSet22);
    java.lang.String[] strArray28 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet29 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean30 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
    java.lang.String[] strArray33 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet34 = new java.util.TreeSet<java.lang.String>();
    boolean boolean35 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
    java.lang.String str37 = strSet34.lower("hi!");
    boolean boolean38 = strSet29.removeAll((java.util.Collection<java.lang.String>) strSet34);
    java.lang.String[] strArray40 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet41 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean42 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
    java.lang.String[] strArray45 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet46 = new java.util.TreeSet<java.lang.String>();
    boolean boolean47 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
    java.lang.String str49 = strSet46.lower("hi!");
    boolean boolean50 = strSet41.removeAll((java.util.Collection<java.lang.String>) strSet46);
    java.lang.String[] strArray52 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet53 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean54 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
    java.lang.String[] strArray57 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet58 = new java.util.TreeSet<java.lang.String>();
    boolean boolean59 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
    java.lang.String str61 = strSet58.lower("hi!");
    boolean boolean62 = strSet53.removeAll((java.util.Collection<java.lang.String>) strSet58);
    java.util.LinkedHashSet[] linkedHashSetArray64 = new java.util.LinkedHashSet[3];
    @SuppressWarnings("unchecked")
    java.util.LinkedHashSet<java.lang.String>[] strSetArray65 =
        (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray64;
    strSetArray65[0] = strSet29;
    strSetArray65[1] = strSet41;
    strSetArray65[2] = strSet53;
    java.util.LinkedHashSet<java.lang.String>[] strSetArray72 = strSet22.toArray(strSetArray65);
    java.util.LinkedHashSet<java.lang.String>[] strSetArray73 = strSet10.toArray(strSetArray72);
    java.lang.String str74 = strSet10.toString();
    boolean boolean75 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet10);
    java.util.stream.Stream<java.lang.String> strStream76 = strSet10.parallelStream();
    java.util.TreeSet<java.lang.String> strSet77 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str79 = strSet77.higher("");
    java.lang.String str80 = strSet77.toString();
    boolean boolean82 = strSet77.remove((java.lang.Object) "hi!");
    java.lang.String str83 = strSet77.pollLast();
    java.util.TreeSet<java.lang.String> strSet84 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str86 = strSet84.higher("");
    java.util.stream.Stream<java.lang.String> strStream87 = strSet84.stream();
    boolean boolean89 = strSet84.add("[hi!]");
    boolean boolean91 = strSet84.add("[]");
    java.util.NavigableSet<java.lang.String> strSet92 = strSet84.descendingSet();
    boolean boolean93 = strSet77.addAll((java.util.Collection<java.lang.String>) strSet84);
    boolean boolean94 = strSet10.contains((java.lang.Object) boolean93);
    java.lang.String str95 = strSet10.pollFirst();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertNotNull(objArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNotNull(strStream14);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNotNull(strStream19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(strArray28);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(strArray33);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertNotNull(strArray40);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(strArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertNotNull(strArray52);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    org.junit.Assert.assertNotNull(strArray57);
    org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertNotNull(linkedHashSetArray64);
    org.junit.Assert.assertNotNull(strSetArray65);
    org.junit.Assert.assertNotNull(strSetArray72);
    org.junit.Assert.assertNotNull(strSetArray73);
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "[]" + "'", str74.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    org.junit.Assert.assertNotNull(strStream76);
    org.junit.Assert.assertNull(str79);
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "[]" + "'", str80.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    org.junit.Assert.assertNull(str83);
    org.junit.Assert.assertNull(str86);
    org.junit.Assert.assertNotNull(strStream87);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    org.junit.Assert.assertNotNull(strSet92);
    org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    org.junit.Assert.assertNull(str95);
  }

  @Test
  public void test140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test140");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    boolean boolean18 = strSet8.add("[hi!]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test141");
    java.lang.String[] strArray4 = new java.lang.String[] {"[]", "[]", "hi!", "[]"};
    java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
    boolean boolean6 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
    java.util.TreeSet<java.lang.String> strSet7 =
        new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet5);
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test142");
    java.lang.String[] strArray3 = new java.lang.String[] {"[hi!]", "[]", "[hi!]"};
    java.util.LinkedHashSet<java.lang.String> strSet4 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean5 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
    java.lang.String[] strArray8 = new java.lang.String[] {"[hi!]", "[hi!]"};
    java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
    boolean boolean10 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
    java.lang.String str11 = strSet9.pollLast();
    java.lang.String[] strArray13 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    boolean boolean15 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
    java.util.Iterator<java.lang.String> strItor16 = strSet14.descendingIterator();
    boolean boolean17 = strSet9.removeAll((java.util.Collection<java.lang.String>) strSet14);
    java.util.stream.Stream<java.lang.String> strStream18 = strSet9.parallelStream();
    boolean boolean19 = strSet4.equals((java.lang.Object) strSet9);
    java.lang.String[] strArray22 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet23 = new java.util.TreeSet<java.lang.String>();
    boolean boolean24 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
    java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str27 = strSet25.higher("");
    boolean boolean28 = strSet23.addAll((java.util.Collection<java.lang.String>) strSet25);
    java.lang.String[] strArray31 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    boolean boolean33 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
    java.util.TreeSet<java.lang.String> strSet34 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str36 = strSet34.higher("");
    boolean boolean37 = strSet32.addAll((java.util.Collection<java.lang.String>) strSet34);
    java.lang.String str38 = strSet34.pollLast();
    java.util.TreeSet<java.lang.String> strSet39 =
        new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet34);
    boolean boolean40 = strSet25.removeAll((java.util.Collection<java.lang.String>) strSet39);
    java.util.TreeSet<java.lang.String> strSet41 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str43 = strSet41.higher("");
    java.util.stream.Stream<java.lang.String> strStream44 = strSet41.stream();
    java.lang.String str45 = strSet41.pollFirst();
    strSet41.clear();
    java.util.NavigableSet<java.lang.String> strSet47 = strSet41.descendingSet();
    boolean boolean48 = strSet39.addAll((java.util.Collection<java.lang.String>) strSet41);
    boolean boolean49 = strSet4.retainAll((java.util.Collection<java.lang.String>) strSet41);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[hi!]" + "'", str11.equals("[hi!]"));
    org.junit.Assert.assertNotNull(strArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(strItor16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(strArray22);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNull(str27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(strArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNull(str36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNull(str38);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNull(str43);
    org.junit.Assert.assertNotNull(strStream44);
    org.junit.Assert.assertNull(str45);
    org.junit.Assert.assertNotNull(strSet47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
  }

  @Test
  public void test143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test143");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    int int5 = strSet0.size();
    java.util.stream.Stream<java.lang.String> strStream6 = strSet0.stream();
    java.lang.String str7 = strSet0.toString();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str11 = strSet9.higher("");
    java.util.stream.Stream<java.lang.String> strStream12 = strSet9.stream();
    java.lang.String str13 = strSet9.pollFirst();
    java.lang.String str14 = strSet9.pollLast();
    java.lang.Object[] objArray15 = strSet9.toArray();
    java.lang.Object[] objArray16 = strSet8.toArray(objArray15);
    boolean boolean17 = strSet0.equals((java.lang.Object) strSet8);
    boolean boolean19 = strSet8.add("hi!");
    java.lang.String[] strArray21 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
    boolean boolean23 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
    java.util.Iterator<java.lang.String> strItor24 = strSet22.descendingIterator();
    boolean boolean26 = strSet22.add("hi!");
    java.lang.String str27 = strSet22.toString();
    java.lang.Object[] objArray28 = strSet22.toArray();
    java.util.TreeSet<java.lang.String> strSet29 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str31 = strSet29.higher("");
    java.util.stream.Stream<java.lang.String> strStream32 = strSet29.stream();
    java.lang.String str33 = strSet29.pollFirst();
    java.lang.String str34 = strSet29.pollLast();
    java.util.TreeSet<java.lang.String> strSet35 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str37 = strSet35.higher("");
    java.lang.String str38 = strSet35.pollLast();
    boolean boolean39 = strSet29.retainAll((java.util.Collection<java.lang.String>) strSet35);
    boolean boolean40 = strSet22.addAll((java.util.Collection<java.lang.String>) strSet35);
    boolean boolean41 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet22);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(strStream6);
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertNotNull(strStream12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(objArray15);
    org.junit.Assert.assertNotNull(objArray16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(strArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNotNull(strItor24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[hi!]" + "'", str27.equals("[hi!]"));
    org.junit.Assert.assertNotNull(objArray28);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertNotNull(strStream32);
    org.junit.Assert.assertNull(str33);
    org.junit.Assert.assertNull(str34);
    org.junit.Assert.assertNull(str37);
    org.junit.Assert.assertNull(str38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
  }

  @Test
  public void test144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test144");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    strSet2.clear();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
  }

  @Test
  public void test145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test145");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.lang.String str18 = strSet8.floor("[hi!]");
    java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str21 = strSet19.higher("");
    java.util.stream.Stream<java.lang.String> strStream22 = strSet19.stream();
    java.lang.String str23 = strSet19.pollFirst();
    java.util.SortedSet<java.lang.String> strSet25 = strSet19.headSet("hi!");
    boolean boolean26 = strSet8.containsAll((java.util.Collection<java.lang.String>) strSet25);
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str18);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strStream22);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertNotNull(strSet25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
  }

  @Test
  public void test146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test146");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.util.stream.Stream<java.lang.String> strStream3 = strSet0.stream();
    java.lang.String str4 = strSet0.pollFirst();
    strSet0.clear();
    java.util.SortedSet<java.lang.String> strSet7 = strSet0.headSet("[hi!]");
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    strSet8.clear();
    java.util.SortedSet<java.lang.String> strSet15 = strSet8.headSet("[hi!]");
    boolean boolean16 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    java.util.SortedSet<java.lang.String> strSet23 = strSet17.headSet("hi!");
    boolean boolean24 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet17);
    java.lang.String str25 = strSet17.pollLast();
    java.lang.String str26 = strSet17.pollLast();
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNotNull(strStream3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(strSet15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertNull(str26);
  }

  @Test
  public void test147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test147");
    java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str2 = strSet0.higher("");
    java.lang.String str3 = strSet0.pollLast();
    java.util.NavigableSet<java.lang.String> strSet6 = strSet0.headSet("[hi!]", false);
    boolean boolean7 = strSet0.isEmpty();
    java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str10 = strSet8.higher("");
    java.util.stream.Stream<java.lang.String> strStream11 = strSet8.stream();
    java.lang.String str12 = strSet8.pollFirst();
    java.lang.String str13 = strSet8.pollLast();
    boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet8);
    java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str17 = strSet15.higher("");
    java.util.stream.Stream<java.lang.String> strStream18 = strSet15.stream();
    boolean boolean20 = strSet15.add("[hi!]");
    boolean boolean22 = strSet15.add("[]");
    boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet15);
    java.lang.Object obj24 = strSet0.clone();
    java.lang.String[] strArray26 = new java.lang.String[] {""};
    java.util.LinkedHashSet<java.lang.String> strSet27 =
        new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean28 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
    java.lang.String[] strArray31 = new java.lang.String[] {"", ""};
    java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>();
    boolean boolean33 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
    java.lang.String str35 = strSet32.lower("hi!");
    boolean boolean36 = strSet27.removeAll((java.util.Collection<java.lang.String>) strSet32);
    java.lang.String str37 = strSet32.toString();
    boolean boolean38 = strSet0.equals((java.lang.Object) str37);
    java.lang.String[] strArray40 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet41 = new java.util.TreeSet<java.lang.String>();
    boolean boolean42 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
    java.util.Iterator<java.lang.String> strItor43 = strSet41.descendingIterator();
    java.lang.String str44 = strSet41.toString();
    java.util.TreeSet<java.lang.String> strSet45 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str47 = strSet45.higher("");
    java.util.stream.Stream<java.lang.String> strStream48 = strSet45.stream();
    java.lang.String str49 = strSet45.pollFirst();
    strSet45.clear();
    java.util.NavigableSet<java.lang.String> strSet51 = strSet45.descendingSet();
    boolean boolean52 = strSet41.retainAll((java.util.Collection<java.lang.String>) strSet51);
    boolean boolean53 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet41);
    boolean boolean55 = strSet41.add("[hi!]");
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertNotNull(strSet6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strStream11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNull(str13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertNotNull(strStream18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertNotNull(obj24);
    org.junit.Assert.assertNotNull(strArray26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strArray31);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[]" + "'", str37.equals("[]"));
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertNotNull(strArray40);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(strItor43);
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!]" + "'", str44.equals("[hi!]"));
    org.junit.Assert.assertNull(str47);
    org.junit.Assert.assertNotNull(strStream48);
    org.junit.Assert.assertNull(str49);
    org.junit.Assert.assertNotNull(strSet51);
    org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
  }

  @Test
  public void test148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test148");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    int int8 = strSet2.size();
    java.lang.String str10 = strSet2.higher("[hi!]");
    java.lang.String[] strArray12 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
    boolean boolean14 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
    java.util.Iterator<java.lang.String> strItor15 = strSet13.descendingIterator();
    java.lang.String str16 = strSet13.toString();
    java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str19 = strSet17.higher("");
    java.util.stream.Stream<java.lang.String> strStream20 = strSet17.stream();
    java.lang.String str21 = strSet17.pollFirst();
    strSet17.clear();
    java.util.NavigableSet<java.lang.String> strSet23 = strSet17.descendingSet();
    boolean boolean24 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet23);
    boolean boolean25 = strSet2.equals((java.lang.Object) strSet13);
    java.lang.String str26 = strSet13.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    org.junit.Assert.assertNotNull(strArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(strItor15);
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[hi!]" + "'", str16.equals("[hi!]"));
    org.junit.Assert.assertNull(str19);
    org.junit.Assert.assertNotNull(strStream20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNull(str26);
  }

  @Test
  public void test149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test149");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet2.stream();
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean19 = strSet12.equals((java.lang.Object) "");
    boolean boolean20 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.stream.Stream<java.lang.String> strStream21 = strSet2.stream();
    boolean boolean23 = strSet2.add("");
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(strStream21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
  }

  @Test
  public void test150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "RegressionTest0.test150");
    java.lang.String[] strArray1 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
    boolean boolean3 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
    java.util.Iterator<java.lang.String> strItor4 = strSet2.descendingIterator();
    java.lang.String str5 = strSet2.toString();
    java.lang.String str7 = strSet2.floor("[hi!]");
    java.util.stream.Stream<java.lang.String> strStream8 = strSet2.stream();
    java.lang.String[] strArray11 = new java.lang.String[] {"hi!", ""};
    java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
    boolean boolean13 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
    java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str16 = strSet14.higher("");
    boolean boolean17 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
    boolean boolean19 = strSet12.equals((java.lang.Object) "");
    boolean boolean20 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet12);
    java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
    java.lang.String str23 = strSet21.higher("");
    boolean boolean24 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet21);
    java.lang.String[] strArray26 = new java.lang.String[] {"hi!"};
    java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
    boolean boolean28 =
        java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
    java.util.Iterator<java.lang.String> strItor29 = strSet27.descendingIterator();
    java.util.NavigableSet<java.lang.String> strSet32 = strSet27.headSet("", true);
    boolean boolean33 = strSet21.equals((java.lang.Object) true);
    java.lang.String str34 = strSet21.pollLast();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(strItor4);
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!]" + "'", str5.equals("[hi!]"));
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(strStream8);
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNull(str16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNull(str23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(strArray26);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    org.junit.Assert.assertNotNull(strItor29);
    org.junit.Assert.assertNotNull(strSet32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNull(str34);
  }
}
