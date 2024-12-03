import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Calculation;

public class TestMethods {
    Calculation calculator = new Calculation();

    @Test
    public void testAdditionPositive() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtractionPositive() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplicationPositive() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivisionByZeroNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    public void givenRadiusCalculateAreaPositive() {
        double actualArea = calculator.calculateArea(1d);
        double expectedArea = 3.141592653589793;
        assertEquals(expectedArea, actualArea);
    }
}
