import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void twoPositiveNumbersTest() { 
        assertEquals(5, Calculator.add(2, 3));
    }
    
    @Test
    public void twoNegativeNumbersTest() {
        assertEquals(-5, Calculator.add(-2, -3));
    }
    
    @Test
    public void twoZerosTest() {
        assertEquals(0, Calculator.add(0, 0));
    }
}