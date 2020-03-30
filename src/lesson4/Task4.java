package lesson4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int firstMember, n, nMember, step;
//    double nMember;
//    double step;

        System.out.println("Напишите первый член прогрессии");
        Scanner in = new Scanner(System.in);
        firstMember = in.nextInt();

        System.out.println("Напишите шаг прогрессии");
        step = in.nextInt();

        System.out.println("Напишите кол-во шагов прогрессии");
        n = in.nextInt();

        nMember = firstMember + step * (n - 1);
//не сделано
        do {
            System.out.println(nMember);
            nMember = firstMember + step;
        }
        while (firstMember == nMember + step * (n-1));

//        for (double nMember = 0; nMember == firstMember + step; nMember = nMember + step)
//            System.out.println(nMember);

    }
}
