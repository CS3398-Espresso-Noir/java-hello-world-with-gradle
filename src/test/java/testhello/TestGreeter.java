package hello;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;



public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World War");
      assertEquals(g.getName(),"World War");
      assertEquals(g.sayHello(),"Hello World War!");
   }

   @Test
   public void moreTests()
   {
      g.setName("... Pole");
      assertEquals(g.getName(), "... Pole");
      assertEquals(g.sayHello(), "Hello ... Pole!");
   }
   @Test
   public void newtestZtmGreeterPass()
   {
      g.setName("Zeb");
      assertEquals(g.getName(), "Zeb");
      assertEquals(g.sayHello(), "Hello Zeb!");
   }
   @Test
   public void newtestZtmGreeterFail()
   {
      g.setName("Zeb");
      assertEquals(g.getName(), "Zeb");
      assertEquals(g.sayHello(), "Hello Dr. Lehr!");
   }
}