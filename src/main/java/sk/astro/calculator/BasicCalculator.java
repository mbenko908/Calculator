package sk.astro.calculator;

import sk.astro.AritmeticOperator;
import sk.astro.operation.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator{

    public BasicCalculator(String name, Map<AritmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }

}
