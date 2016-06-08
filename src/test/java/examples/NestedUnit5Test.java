package examples;

import examples.entities.User;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertNotNull;
import static org.junit.gen5.api.Assertions.assertTrue;

public class NestedUnit5Test {

  static User user;

  @BeforeAll
  static void init() {
    user = new User();
  }


  @Test
  void testCreation() {
    assertNotNull( user );
  }

  @Nested
  class TestUser {

    @Test
    void testLogin() {
      assertEquals("root", user.getLogin());
    }

    @Test
    void testPassword() {
      assertEquals("pass", user.getPassword());
    }

    @Nested
    class TestUserLogin {
      @Test
      void testPassword() {
        assertTrue( loginToService(user) );
      }

      private boolean loginToService(User user) {
        return true;
      }
    }

  }

}
