package examples.interfaces;


public class StringUnit5Test implements TestablesTests<String> {

  @Override
  public String createValue() {
    return "Hello world";
  }

}
