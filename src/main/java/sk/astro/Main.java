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
            char operator;

            try {
                left = scanner.nextDouble();
                operator = scanner.next().charAt(0);
                right = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                continue;
            }


            final Operands operands = new Operands(left, right);
            final AbstractCalculator calculator = calculatorHolder.getSuitableCalculator(operator);
            calculator.calculate(operands, operator);

        } while (true);
    }
}