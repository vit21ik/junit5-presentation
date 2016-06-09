package examples.interfaces;

public interface Testable2 {

  default boolean isString(Object t) {
    return t instanceof String;
  }

}
