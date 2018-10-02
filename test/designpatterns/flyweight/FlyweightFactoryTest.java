package designpatterns.flyweight;

import static org.junit.Assert.*;
import org.junit.Test;

public class FlyweightFactoryTest {

  @Test
  public void testGetFlyweight() {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight flyweight1 = factory.getFlyweight("ConcreteFlyweight");
    assertNotNull(flyweight1);
    Flyweight flyweight2 = factory.getFlyweight("ConcreteFlyweight");
    assertNotNull(flyweight2);
    assertSame(flyweight1, flyweight2);
    
    Flyweight flyweight3 = factory.getFlyweight("UnsharedConcreteFlyweight");
    assertNotNull(flyweight3);
    Flyweight flyweight4 = factory.getFlyweight("UnsharedConcreteFlyweight");
    assertNotNull(flyweight4);
    assertSame(flyweight3, flyweight4);
  }

}