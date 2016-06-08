package examples;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assumptions.assumeTrue;
import static org.junit.gen5.api.Assumptions.assumingThat;

public class AssumeUnit5Test {

  @Test
  void testOnlyOnCiServer() {
    assumeTrue( "CI".equals(System.getenv("ENV")) );
  }

  @Test
  void testOnlyOnDeveloperWorkstation() {
    assumeTrue("PROD".equals("DEV"), () -> "Aborting test: not on developer workstation");
    assertEquals(1+3, 2);
  }

  @Test
  void testInAllEnvironments() {
    assumingThat("CI".equals(System.getenv("ENV")),() -> {
      assertEquals(2, 2);
    });
    assertEquals("a string", "a string");
  }

}
