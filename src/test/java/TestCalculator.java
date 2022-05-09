import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testCanAddSmall(){
        assertEquals(11, calculator.add(3, 8));
    }

    @Test
    public void testCanAddLarge(){
        assertEquals(999, calculator.add(44, 955));
    }

    @Test
    public void testCanSubtractToPositive(){
        assertEquals(2, calculator.subtract(9, 7));
    }

    @Test
    public void testCanSubtractToNegative(){
        assertEquals(-3, calculator.subtract(2, 5));
    }

    @Test
    public void testCanMultiplySmall(){
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testCanMultiplyLarge(){
        assertEquals(1600, calculator.multiply(40, 40));
    }

    @Test
    public void testCanDivideSmall(){
        assertEquals(2, calculator.divide(6, 3), 0.0);
    }

    @Test
    public void testCanDivideLarge(){
        assertEquals(10, calculator.divide(110, 11), 0.0);
    }

}
