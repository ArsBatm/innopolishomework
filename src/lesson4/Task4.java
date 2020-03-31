package lesson4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int firstMember, n, step, nMember;

        System.out.println("Напишите первый член прогрессии");
        Scanner in = new Scanner(System.in);
        firstMember = in.nextInt();

        System.out.println("Напишите шаг/знаменатель прогрессии");
        step = in.nextInt();

        System.out.println("Напишите кол-во шагов прогрессии");
        n = in.nextInt();

//      Подсчет арифметической прогрессии
        System.out.println("Арифметическая прогрессия, если шаг прогрессии положительная");
        for (nMember = firstMember; nMember <= firstMember + step * (n-1); nMember = nMember + step)
        System.out.println(nMember);

        System.out.println("Арифметическая прогрессия, если шаг прогрессии отрицательный");
        for (nMember = firstMember; nMember >= firstMember + step * (n-1); nMember = nMember + step)
        System.out.println(nMember);

//      Подсчет геометрической прогрессии
        System.out.println("Геометрическая прогрессия");
        for (nMember= firstMember; nMember <= firstMember * Math.pow(step, (n-1)); nMember = nMember * step)
            System.out.println(nMember);

    }
}
