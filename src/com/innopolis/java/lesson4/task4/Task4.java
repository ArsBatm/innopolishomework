package innopolis.java.lesson4.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        double firstMember, step, nMember;
        int n;

        boolean arifmetic;

        System.out.println("Напишите true, если прогрессия арифметическая");
        Scanner in = new Scanner(System.in);
        arifmetic = in.nextBoolean();

        System.out.println("Напишите первый член прогрессии");
        firstMember = in.nextDouble();

        System.out.println("Напишите шаг/знаменатель прогрессии");
        step = in.nextDouble();

        System.out.println("Напишите кол-во шагов прогрессии");
        n = in.nextInt();


        if (arifmetic == true) {

//      Подсчет арифметической прогрессии
            System.out.println("Арифметическая прогрессия, если шаг прогрессии положительная");
            for (nMember = firstMember; nMember == firstMember + step * (n-1); nMember = nMember + step)
                System.out.println(nMember);

            System.out.println("Арифметическая прогрессия, если шаг прогрессии отрицательный");
            for (nMember = firstMember; nMember >= firstMember + step * (n - 1); nMember = nMember + step)
                System.out.println(nMember);
        }


        else {
//      Подсчет геометрической прогрессии
            System.out.println("Геометрическая прогрессия");
            for (nMember = firstMember; nMember <= firstMember * Math.pow(step, (n - 1)); nMember = nMember * step)
                System.out.println(nMember);
        }
    }
}
