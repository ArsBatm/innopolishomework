/* Первое домашнее задание
*подсчет стоимости бензина
 */
package lesson3;
import java.util.Scanner;

public class main extends Object {
    public static void main(String args[]) {
        double priceForLiter;
        //цена за 1 литр бензина
        double amount ;
        //количество литров

        System.out.println("Введите цену за 1 литр");
        Scanner in = new Scanner(System.in);
        priceForLiter = in.nextInt();

        System.out.println("Введите количество литров");
        amount = in.nextInt();

        double price = priceForLiter*amount;
        //итоговая сумма

        System.out.println("Стоимость бензина");
        System.out.println(price);
        //вывод суммы на экраны
    }
}