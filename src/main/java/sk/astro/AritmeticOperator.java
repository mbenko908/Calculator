package sk.astro;

public enum AritmeticOperator {

    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private final char symbol;

    AritmeticOperator(char symbol){
        this.symbol = symbol;
    }

    public static AritmeticOperator getFromSymbol(String line){
        if (line.length() == 1) {
            for (AritmeticOperator operator : AritmeticOperator.values()) {
                if (operator.symbol == line.charAt(0)) {
                    return operator;
                }
            }
        }
        throw new IllegalArgumentException();
    }

}
