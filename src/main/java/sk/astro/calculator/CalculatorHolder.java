package sk.astro.calculator;

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
        final Map<Character, Operation> basicCalculatorOperationMap = new HashMap<>();
        basicCalculatorOperationMap.put('+', new Addition());
        basicCalculatorOperationMap.put('-', new Substraction());

        this.basicCalculator = new BasicCalculator("BasicCalcualtor", basicCalculatorOperationMap);

        final Map<Character, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put('*', new Multiplication());
        advancedCalculatorOperationMap.put('/', new Division());

        this.advancedCalculator = new AdvancedCalculator("AdvancedCalcualtor", advancedCalculatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(char operator){
        switch (operator){
            case '+':
            case '-':
                return this.basicCalculator;

            case '*':
            case '/':
                return this.advancedCalculator;
            default:
                throw new IllegalArgumentException("Unsupported operation");
        }
    }

}
