package examples.interfaces;


import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public interface TestableTests<T> extends Testable<T> {

  @Test
  default void valueEqualsHelloWorld() {
    T value = createValue();
    assertEquals("Hello world", value);
  }

}
