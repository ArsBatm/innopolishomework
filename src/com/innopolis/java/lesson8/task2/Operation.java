package innopolis.java.lesson8.task2;

import java.util.Scanner;

public class Operation {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
/**
 * В ведение типа переменных
 */
        System.out.println("Введите тип переменных, целочисленный - int или дробный - double");
        String type = in.next();

/**
 * Условие 1: если необходимо посчитать целочисленные знаечения
 */
        if (type.equals("int")) {

/**
 * Введиние чисел 1 и 2
 */
            System.out.println("Введите первое число в целочисленном формате");
            int firstNumberInt = in.nextInt();
            System.out.println("Введите второе число в целочисленном формате");
            int secondNumberInt = in.nextInt();

/**
 * В ведение необходимой операции
 */
            System.out.println("Введите необходимую оперцию: сложение- '+', вычитание- '-', умножение- '*', деление- '/', взятие процента- '%'");
            String operation = in.next();

/**
 *  Р езультат в зависимости от выбранного знака
 */
            switch (operation) {
                case "+":
                    System.out.println("Результат: " + Calculator.plusI(firstNumberInt, secondNumberInt));
                    break;
                case "-":
                    System.out.println("Результат: " + Calculator.minusI(firstNumberInt, secondNumberInt));
                    break;
                case "*":
                    System.out.println("Результат: " + Calculator.multiI(firstNumberInt, secondNumberInt));
                    break;
                case "/":
                    if (secondNumberInt != 0) {
                        System.out.println("Результат: " + Calculator.divI(firstNumberInt, secondNumberInt));
                        break;
                    } else {
                        System.out.println("На 0 делить нельзя");
                    }
                    break;
                case "%":
                    System.out.println("Результат: " + Calculator.perI(firstNumberInt, secondNumberInt));
                    break;
                default:
                    System.out.println("Введите корректный знак операции");
            }
/**
 * Условие 2: если необходимо посчитать дробные знаечения
 */
        } else {

/**
 *  Введиние чисел 1 и 2
 */
            System.out.println("Введите первое число в дробном формате");
            double firstNumberDoub = in.nextDouble();
            System.out.println("Введите второе число в дробном формате");
            double secondNumberDoub = in.nextDouble();

/**
 *  В ведение необходимой операции
 */
            System.out.println("Введите необходимую оперцию: сложение- '+', вычитание- '-', умножение- '*', деление- '/', взятие процента- '%'");
            String operation = in.next();

/**
 *  Результат в зависимости от выбранного знака
 */
            switch (operation) {
                case "+":
                    System.out.println("Результат: " + Calculator.plusDoub(firstNumberDoub, secondNumberDoub));
                    break;
                case "-":
                    System.out.println("Результат: " + Calculator.minusDoub(firstNumberDoub, secondNumberDoub));
                    break;
                case "*":
                    System.out.println("Результат: " + Calculator.multiDoub(firstNumberDoub, secondNumberDoub));
                    break;
                case "/":
                    if (secondNumberDoub != 0) {
                        System.out.println("Результат: " + Calculator.divDoub(firstNumberDoub, secondNumberDoub));
                        break;
                    } else {
                        System.out.println("На 0 делить нельзя");
                    }
                    break;
                case "%":
                    System.out.println("Результат: " + Calculator.perDoub(firstNumberDoub, secondNumberDoub));
                    break;
                default:
                    System.out.println("Введите корректный знак операции");
            }
        }
    }
}
