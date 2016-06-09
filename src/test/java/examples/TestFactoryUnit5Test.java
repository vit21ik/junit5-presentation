package examples;

import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.DynamicTest;
import org.junit.gen5.api.TestFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.DynamicTest.dynamicTest;

public class TestFactoryUnit5Test {

  final static Map<Integer, Integer> testResults = new HashMap<>();

  @BeforeAll
  static void init() {
    testResults.put(1, 1);
    testResults.put(2, 2);
    testResults.put(3, 6);
    testResults.put(4, 24);
    testResults.put(5, 120);
    testResults.put(6, 720);
  }

  @TestFactory
  Stream<DynamicTest> dynamicTestsFactorial() {
    return testResults.keySet().stream().map(
      value -> dynamicTest("factorial"+value, () -> assertEquals(testResults.get(value), factorial(value)))
    );
  }

  public Integer factorial(int n) {
    int f = 1;
    if (n > 1) {
      for(int i = 2; i <= n; i++) {
        f = f * i;
      }
    }
    return f;
  }

}
