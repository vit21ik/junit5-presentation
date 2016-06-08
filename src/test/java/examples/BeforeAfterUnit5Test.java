package examples;

import org.junit.gen5.api.*;

import static org.junit.gen5.api.Assertions.assertEquals;

/**
 * Created by vitalii on 6/6/16.
 */
public class BeforeAfterUnit5Test {

  int b = -1;

  @BeforeEach
  void runBeforeEach() {
    b = 1;
  }

  @AfterEach
  void runAfterEach() {
    b = -1;
  }

  @BeforeAll
  static void runBeforeAll() {
    Data.a = 7;
  }

  @AfterAll
  static void runAfterAll() {
    Data.a = 1;
  }

  @Test
  void testA() {
    assertEquals(7, Data.a);
  }

  @Test
  void testB() {
    assertEquals(1, b);
  }

}

class Data {

  public static int a = 1;

}
