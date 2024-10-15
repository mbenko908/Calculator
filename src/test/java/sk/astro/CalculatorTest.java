package sk.astro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sk.astro.calculator.CalculatorHolder;

public class CalculatorTest {

    private final CalculatorHolder calculatorHolder = new CalculatorHolder();
    private final Operands operands = new Operands(5, 10);

    @Test
    public void testAddition() {
        final AritmeticOperator operator = AritmeticOperator.ADDITION;
        final double expected = 15;
        final double result = calculatorHolder.calculateResult(operands, operator);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        final AritmeticOperator operator = AritmeticOperator.SUBTRACTION;
        final double expected = -5;
        final double result = calculatorHolder.calculateResult(operands, operator);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        final AritmeticOperator operator = AritmeticOperator.MULTIPLICATION;
        final double expected = 50;
        final double result = calculatorHolder.calculateResult(operands, operator);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        final AritmeticOperator operator = AritmeticOperator.DIVISION;
        final double expected = 0.5;
        final double result = calculatorHolder.calculateResult(operands, operator);

        Assertions.assertEquals(expected, result);
    }
}
