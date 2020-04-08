package innopolis.java.lesson2.task1;

public class Task {

    public static void main(String args[]) {
        double priceForLiter;
        //цена за 1 литр бензина
        double amount ;
        //количество литров

        System.out.println("цена за литр:");
        priceForLiter = 12;

        System.out.println("Кол-во литров:");
        amount = 1;

        double price = priceForLiter*amount;
        //итоговая сумма

        System.out.println("Стоимость бензина" +price);
        //вывод суммы на экраны
    }
}
