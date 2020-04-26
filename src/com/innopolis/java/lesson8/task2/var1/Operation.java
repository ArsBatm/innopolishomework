package innopolis.java.lesson8.task2.var1;

public class Operation {
    public static void main(String[] args) {
//  Записываются нужные значения в скобках, результат выводиться в консоль
        System.out.println(String.format("%.2f", Calculator.plus(12.3323, 32.4334)));
        System.out.println(String.format("%.2f", Calculator.minus(12.3323, 32.4334)));
        System.out.println(String.format("%.2f", Calculator.multi(12.3323, 32.4334)));
        System.out.println(String.format("%.2f", Calculator.div(12.3323, 32.4334)));
        System.out.println(String.format("%.2f", Calculator.per(12.3323, 32.4334)));

    }
}
