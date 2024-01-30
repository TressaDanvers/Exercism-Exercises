import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
  @Test
  public void greeterGetGreetingReturnsExpectedValue() {
    assertEquals("Hello, World!", new Greeter().getGreeting());
  }
}