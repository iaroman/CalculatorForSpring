package pro.sky.Calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private Integer num1;
    private Integer num2;
    private CalculatorService calculatorService;
    @BeforeEach
    void setUp() {
        num1 = 4;
        num2 = 2;
        calculatorService = new CalculatorService();
    }
    @Test
    void plus() {
        Integer expected = calculatorService.plus(num1, num2);
        Integer actual = num1 + num2;
        assertEquals(expected, actual);
    }

    @Test
    void minus() {
        Integer expected = calculatorService.minus(num1, num2);
        Integer actual = num1 - num2;
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        Integer expected = calculatorService.multiply(num1, num2);
        Integer actual = num1 * num2;
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        Integer expected = calculatorService.divide(num1, num2);
        Integer actual = num1 / num2;
        assertEquals(expected, actual);
    }

    @Test
    void result() {
        String operation = "+";
        String expected = calculatorService.result(num1, num2, operation, calculatorService.plus(num1, num2));
        String actual = num1 + " " + operation + " " + num2 + " = " + calculatorService.plus(num1,num2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(1, 0));
    }

}