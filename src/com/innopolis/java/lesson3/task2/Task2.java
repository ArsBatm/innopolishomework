package innopolis.java.lesson3.task2;
import java.util.Scanner;

 class Task2 {
    public static void main(String args[]) {
        double sec;
        //количество секунд

        System.out.println("Введите количество секунд");
        Scanner in = new Scanner(System.in);
        sec = in.nextInt();

        double hour = sec / 3600;
         //подсчет часов

        System.out.println("Полученое количество часов");
        System.out.println(hour);
        //вывод итога на экран
    }
}