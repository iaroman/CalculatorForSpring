package pro.sky.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParameterizedTest {
    private CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "20, 10",
            "-10, 10"
    })
    void plus(Integer num1, Integer num2) {
        Integer expected = calculatorService.plus(num1, num2);
        Integer actual = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "20, 10",
            "-10, 10"
    })
    void minus(Integer num1, Integer num2) {
        Integer expected = calculatorService.minus(num1, num2);
        Integer actual = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "20, 10",
            "-10, 10"
    })
    void multiply(Integer num1, Integer num2) {
        Integer expected = calculatorService.multiply(num1, num2);
        Integer actual = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "20, 10",
            "-10, 10"
    })
    void divide(Integer num1, Integer num2) {
        Integer expected = calculatorService.divide(num1, num2);
        Integer actual = num1 / num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "20, 10",
            "-10, 10"
    })
    void result(Integer num1, Integer num2) {
        String operation = "+";
        String expected = calculatorService.result(num1, num2, operation, calculatorService.plus(num1, num2));
        String actual = num1 + " " + operation + " " + num2 + " = " + calculatorService.plus(num1,num2);
        assertEquals(expected, actual);
    }
}