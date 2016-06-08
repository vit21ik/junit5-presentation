package examples;

import examples.entities.User;
import examples.tags.Slow;
import org.junit.gen5.api.*;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.expectThrows;

@DisplayName("A very simple tests.  ")
public class FirstJUnit5Test {

  @Test
  void myVeryFirstTest() {
    assertEquals(2, 1 + 1, "1+1 should be 2");
  }

  @Test
  @Tag("fast")
  @DisplayName("1 + 1 shoud be 2")
  void myFirstTest() {
    assertEquals(2, 1 + 1, "1+1 should be 2");
    assertEquals(2, 1 + 1, () -> "1+1 should be 2");
  }

  @Test
  @Tag("fast")
  void myBestTest() {
    assertEquals(2, 1 + 1);
  }

  @Test
  @Disabled("For demonstration purposes")
  void skippedTest() {
    // not executed
  }

  @Test
  @DisplayName("╯°□°）╯")
  void testWithDisplayNameContainingSpecialCharacters() {

  }

  @Test
  @DisplayName("😱")
  @Slow
  void testWithDisplayNameContainingEmoji() {

  }

  @Test
  void exceptionTesting() {
    Throwable exception = expectThrows(IllegalArgumentException.class, () -> {
      throw new IllegalArgumentException("a message");
    });
    assertEquals("a message", exception.getMessage());
  }


  @Test
  void groupedAssertions() {
    User user = new User();
    assertAll("user",
            () -> assertEquals("root", user.getLogin()),
            () -> assertEquals("pass", user.getPassword())
    );
  }

}

