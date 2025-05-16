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
        Assertions.assertEquals( 5, calculator.add(2, 3) );
        Assertions.assertEquals( 0, calculator.add(-1, 1) );
        Assertions.assertEquals(-5, calculator.add(-2, -3) );
    }

    @Test
    void testSub() {
        Assertions.assertEquals(-1, calculator.subtract(2, 3) );
        Assertions.assertEquals( 2, calculator.subtract(1, -1) );
        Assertions.assertEquals( 0, calculator.subtract(3, 3) );
    }

    @Test
    void testMul() {
        Assertions.assertEquals( 6, calculator.multiply(2, 3) );
        Assertions.assertEquals(-2, calculator.multiply(-1, 2) );
        Assertions.assertEquals( 0, calculator.multiply(0, 5) );
    }

    @Test
    void testDiv() {
        Assertions.assertEquals( 2, calculator.divide(6, 3) );
        Assertions.assertEquals( 0, calculator.divide(1, 2) );  // Integer-Division
        Assertions.assertThrows( ArithmeticException.class,
                () -> calculator.divide(5, 0) );
    }
}
