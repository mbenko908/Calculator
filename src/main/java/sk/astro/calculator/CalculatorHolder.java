package sk.astro.calculator;

import sk.astro.AritmeticOperator;
import sk.astro.operation.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorHolder {
    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;

    public CalculatorHolder(){
        this.initializeCalculators();
    }

    public void initializeCalculators(){
        final Map<AritmeticOperator, Operation> basicCalculatorOperationMap = new HashMap<>();
        basicCalculatorOperationMap.put(AritmeticOperator.ADDITION, new Addition());
        basicCalculatorOperationMap.put(AritmeticOperator.SUBTRACTION, new Substraction());

        this.basicCalculator = new BasicCalculator("BasicCalcualtor", basicCalculatorOperationMap);

        final Map<AritmeticOperator, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put(AritmeticOperator.MULTIPLICATION, new Multiplication());
        advancedCalculatorOperationMap.put(AritmeticOperator.DIVISION, new Division());

        this.advancedCalculator = new AdvancedCalculator("AdvancedCalcualtor", advancedCalculatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(AritmeticOperator operator){
        switch (operator){
            case ADDITION:
            case SUBTRACTION:
                return this.basicCalculator;

            case MULTIPLICATION:
            case DIVISION:
                return this.advancedCalculator;
            default:
                throw new IllegalArgumentException("Unsupported operation");
        }
    }

}
