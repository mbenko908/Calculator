package sk.astro.calculator;

import sk.astro.AritmeticOperator;
import sk.astro.operation.Operation;
import sk.astro.Operands;

import java.util.Map;

public abstract class AbstractCalculator {
    private final String name;
    private final Map<AritmeticOperator, Operation> operationMap;

    public AbstractCalculator(String name, Map<AritmeticOperator, Operation> operationMap){
        this.name = name;
        this.operationMap = operationMap;
    }

    public double calculate(Operands operands, AritmeticOperator operator){
        if (this.operationMap.containsKey(operator)){
            final Operation operation = this.operationMap.get(operator);
            final double result = this.calculateResult(operands, operation);
            this.printResult(result);
            return result;
        }
        else {throw new IllegalArgumentException("Calculator doesn't support operation" + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation){
        final double result = operation.calculate(operands.getLeft(), operands.getRight());
        return result;
    }

    private void printResult(double result){
        System.out.println(this.name + "calculate result " + result);
    }
}
