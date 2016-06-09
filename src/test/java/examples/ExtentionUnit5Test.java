package examples;

import examples.entities.User;
import examples.extention.InjectUser;
import examples.extention.UserExtention;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertEquals;

@ExtendWith(UserExtention.class)
public class ExtentionUnit5Test {

  @Test
  void firstTestWithInjectedUser(@InjectUser User user) {
    assertAll("user",
            () -> assertEquals("root", user.getLogin()),
            () -> assertEquals("pass", user.getPassword())
    );
  }

}
