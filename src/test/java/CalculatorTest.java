import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calculator = new Calculator();

        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiplication() {

        Calculator calculator = new Calculator();

        assertEquals(25, calculator.multiply(5, 5));
    }
}
