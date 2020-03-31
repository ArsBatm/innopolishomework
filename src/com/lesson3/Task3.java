package lesson3;
import java.util.Scanner;

class Task3 {
    public static void main(String args[]){
        int rawSalary;
        //Заработная плата до вычета налогов

        System.out.println("Введите свою заработную плату");
        Scanner in = new Scanner(System.in);
        rawSalary = in.nextInt();

        double netSalary = rawSalary* 0.87;
        //зп после вычета налогов

        System.out.println("Зарплата на руки");
        //вывод суммы на экран

        System.out.println(netSalary);
    }
}
