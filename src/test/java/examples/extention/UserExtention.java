package examples.extention;

import examples.entities.User;
import org.junit.gen5.api.extension.ExtensionContext;
import org.junit.gen5.api.extension.ParameterResolutionException;
import org.junit.gen5.api.extension.ParameterResolver;
import org.junit.gen5.api.extension.TestInstancePostProcessor;

import java.lang.reflect.Parameter;
import java.util.Optional;

public class UserExtention implements TestInstancePostProcessor, ParameterResolver {

  @Override
  public boolean supports(Parameter parameter, Optional<Object> target, ExtensionContext extensionContext) throws ParameterResolutionException {
    return parameter.isAnnotationPresent(InjectUser.class);
  }

  @Override
  public Object resolve(Parameter parameter, Optional<Object> target, ExtensionContext extensionContext) throws ParameterResolutionException {
    return new User();
  }

  @Override
  public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {

  }

}
