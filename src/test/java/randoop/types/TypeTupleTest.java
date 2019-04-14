package randoop.types;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/** Test type tuples. */
public class TypeTupleTest {

  @Test
  public void emptyTupleTest() {
    TypeTuple ct1 = new TypeTuple();
    TypeTuple ct2 = new TypeTuple(new ArrayList<Type>());
    assertEquals("empty tuples should be same: ", ct1, ct2);

    TypeTuple gt1 = new TypeTuple();
    TypeTuple gt2 = new TypeTuple(new ArrayList<Type>());
    assertEquals("empty tuples should be the same: ", gt1, gt2);

    assertEquals("concrete empty tuples should be the same:", ct1, gt1);
  }

  @Test
  public void singletonTest() {
    List<Type> pl1 = Collections.singletonList(JavaTypes.INT_TYPE);
    TypeTuple ct1 = new TypeTuple(pl1);
    TypeTuple ct2 = new TypeTuple(pl1);
    assertEquals("singletons should be same", ct1, ct2);
  }
}
