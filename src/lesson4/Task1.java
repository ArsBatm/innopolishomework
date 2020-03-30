package lesson4;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        double first;
//        первое число
        double second;
//        второе число

        System.out.println("Напишите первое число");
        Scanner in = new Scanner(System.in);
        first = in.nextDouble();

        System.out.println("Напишите второе число");
        second = in.nextDouble();

        if (first>second)
            System.out.println("Минимальное число - " +second);
        else
            System.out.println("Минимальное число - " +first);

    }
}
