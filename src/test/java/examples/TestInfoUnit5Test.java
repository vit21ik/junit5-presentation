package examples;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestInfo;
import org.junit.gen5.api.TestReporter;

import java.util.HashMap;

import static org.junit.gen5.api.Assertions.assertEquals;

public class TestInfoUnit5Test {

  @Test
  @DisplayName("testInfo")
  void testInfo(TestInfo testInfo) {
    assertEquals("testInfo", testInfo.getDisplayName());
  }


  @Test
  void reportSeveralValues(TestReporter testReporter) {
    HashMap<String, String> values = new HashMap<>();
    values.put("user name", "XXX");
    values.put("user pass", "1974");

    testReporter.publishEntry(values);
  }

}
