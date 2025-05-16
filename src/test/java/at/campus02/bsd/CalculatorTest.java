package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        Assertions.assertEquals( 5.0, calculator.add(2.0, 3.0) );
        Assertions.assertEquals( 0.0, calculator.add(-1.0, 1.0) );
        Assertions.assertEquals(-5.0, calculator.add(-2.0, -3.0) );
    }

    @Test
    void testSub() {
        Assertions.assertEquals(-1.0, calculator.subtract(2.0, 3.0) );
        Assertions.assertEquals( 2.0, calculator.subtract(1.0, -1.0) );
        Assertions.assertEquals( 0.0, calculator.subtract(3.0, 3.0) );
    }

    @Test
    void testMul() {
        Assertions.assertEquals( 6.0, calculator.multiply(2.0, 3.0) );
        Assertions.assertEquals(-2.0, calculator.multiply(-1.0, 2.0) );
        Assertions.assertEquals( 0.0, calculator.multiply(0.0, 5.0) );
    }

    @Test
    void testDiv() {
        Assertions.assertEquals( 2.0, calculator.divide(6.0, 3.0) );
        Assertions.assertEquals( 0.5, calculator.divide(1.0, 2.0) );
        Assertions.assertThrows( ArithmeticException.class,
                () -> calculator.divide(5.0, 0.0) );
    }
}
