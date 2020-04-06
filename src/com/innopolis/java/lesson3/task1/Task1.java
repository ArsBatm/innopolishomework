/* Первое домашнее задание
*подсчет стоимости бензина
 */
package innopolis.java.lesson3.task1;
import java.util.Scanner;

public class Task1 extends Object {
    public static void main(String args[]) {
        double priceForLiter;
        //цена за 1 литр бензина
        double amount ;
        //количество литров

        System.out.println("Введите цену за 1 литр");
        Scanner in = new Scanner(System.in);
        priceForLiter = in.nextDouble();

        System.out.println("Введите количество литров");
        amount = in.nextDouble();

        double price = priceForLiter*amount;
        //итоговая сумма

        System.out.println("Стоимость бензина");
        System.out.println(price);
        //вывод суммы на экраны
    }
}