package com.example.calc;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
   private Calculator calc = new Calculator();
  
   @Test 
   public void testSum() {
      assertEquals(5, calc.sum(2, 3));
   }
}
   
