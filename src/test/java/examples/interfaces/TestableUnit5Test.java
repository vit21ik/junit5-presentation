package examples.interfaces;

public class TestableUnit5Test implements TestableTests<String> {

  @Override
  public String createValue() {
    return "Hello world";
  }


}
