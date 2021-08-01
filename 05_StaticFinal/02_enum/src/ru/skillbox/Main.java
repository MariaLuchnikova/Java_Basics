package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(4, 5);
        System.out.println("Результат операции сложения: " + calculator.calculate(Operation.ADD));
        System.out.println("Результат операции вычитания: " + calculator.calculate(Operation.SUBTRACT));
        System.out.println("Результат операции умножения: " + calculator.calculate(Operation.MULTIPLAY));
    }
}
