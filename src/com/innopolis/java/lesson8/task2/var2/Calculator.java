package innopolis.java.lesson8.task2.var2;

import java.util.Scanner;

public class Calculator {
        private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//  Вводятся числа
        Calculator calculator = new Calculator(23, 43);
//        Вывод результата в консоль
        System.out.println(calculator.getOperationPlus());
        System.out.println(calculator.getOperationMinus());
        System.out.println(calculator.getOperationMulty());
        System.out.println(calculator.getOperationDiv());
        System.out.println(calculator.getOperationPer());
    }
//    Инициализируются переменные, где operation - статические операции, first/second number - числа
    private static double operationPlus;
    private static double operationMinus;
    private static double operationMulty;
    private static double operationDiv;
    private static double operationPer;
    private static double firstNumber, secondNumber;

    Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        operationPlus = firstNumber + secondNumber;
        operationMinus = firstNumber - secondNumber;
        operationMulty = firstNumber * secondNumber;
        operationDiv = firstNumber / secondNumber;
        operationPer = firstNumber % secondNumber;
    }

//    возвращаются операции
    public static double getOperationPlus() {
        return operationPlus;
    }

    public static double getOperationMinus() {
        return operationMinus;
    }

    public static double getOperationMulty() {
        return operationMulty;
    }

    public static double getOperationDiv() {
        return operationDiv;
    }

    public static double getOperationPer() {
        return operationPer;
    }
}
