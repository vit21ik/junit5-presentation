package examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnit4Test {

  @Test
  public void myFirstTest() {
    assertEquals(2, 1 + 1);
  }

}
