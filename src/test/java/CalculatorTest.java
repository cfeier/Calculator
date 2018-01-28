import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Colin Feierabend
 */
public class CalculatorTest {

    @Test
    public void addTwoPositiveNumbersTest() { 
        assertEquals(5, Calculator.add(2, 3));
    }
    
    @Test
    public void addTwoNegativeNumbersTest() {
        assertEquals(-5, Calculator.add(-2, -3));
    }
    
    @Test
    public void addTwoZerosTest() {
        assertEquals(0, Calculator.add(0, 0));
    }
}