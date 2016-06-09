package examples.interfaces;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertFalse;
import static org.junit.gen5.api.Assertions.assertTrue;

public interface Testable2Tests extends Testable2 {

  @Test
  default void testIsString() {
    assertTrue( isString("xxx") );
  }

  @Test
  default void testIsObject() {
    assertFalse( isString(new Object()) );
  }

}
