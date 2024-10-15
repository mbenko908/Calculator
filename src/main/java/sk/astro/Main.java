package sk.astro;

import sk.astro.calculator.AbstractCalculator;
import sk.astro.calculator.CalculatorHolder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner  scanner = new Scanner(System.in);
    private final static CalculatorHolder calculatorHolder = new CalculatorHolder();
    public static void main(String[] args) {
        do {
            System.out.println("Write number, then type of operation (+, -, *, /) and then write number again");
            System.out.println("Example 1 + 5");
            double left, right;
            //char operator;
            final AritmeticOperator operator;

            try {
                left = scanner.nextDouble();
                final String line = scanner.next();
                operator = AritmeticOperator.getFromSymbol(line);
                right = scanner.nextDouble();
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            final Operands operands = new Operands(left, right);
            calculatorHolder.getSuitableCalculator(operator).calculate(operands,operator);

        } while (true);
    }
}