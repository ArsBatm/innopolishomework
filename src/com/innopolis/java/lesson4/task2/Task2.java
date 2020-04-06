package innopolis.java.lesson4.task2;
import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        double number;
//        число для анализа


        System.out.println("Напишите число");
        Scanner in = new Scanner(System.in);
        number = in.nextDouble();


        if (number == 0){
            System.out.println("Равно 0");
        }else {
        if (number>0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

        if (number % 2 == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
        }
    }
    }
