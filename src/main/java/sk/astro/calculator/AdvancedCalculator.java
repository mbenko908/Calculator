package sk.astro.calculator;

import sk.astro.operation.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator{
    public AdvancedCalculator(String name, Map<Character, Operation> operationMap) {
        super(name, operationMap);
    }
}
