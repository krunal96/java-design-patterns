package designpatterns.decorator;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConcreteDecoratorATest {

  private ByteArrayOutputStream stdOutBuffer;
  private final PrintStream realStdOut = System.out;

  @Before
  public void setup() {
    stdOutBuffer = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOutBuffer));
  }
  
  @Test
  public void testDecoration() {
    ConcreteComponent decorated = new ConcreteComponent();
    ConcreteDecoratorA decorator = new ConcreteDecoratorA(decorated);
    decorator.operation();
    String expectedOutput = "<------------>\nConcreteComponent\n<------------>";
    assertEquals(expectedOutput , String.valueOf(stdOutBuffer).trim());
  }

  @After
  public void teardown() {
    System.setOut(realStdOut);
  }
  
}
