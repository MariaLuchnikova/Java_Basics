package ru.skillbox;

public class ArithmeticCalculator {
    private final int number1;
    private final int number2;

    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int calculate(Operation operation) {
        int result = 0;
        switch (operation) {
            case ADD:
                result = number1 + number2;
                break;
            case SUBTRACT:
                result = number1 - number2;
                break;
            case MULTIPLAY:
                result = number1 * number2;
                break;
        }
        return result;
    }
}
