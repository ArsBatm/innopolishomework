package innopolis.java.lesson8.task3;

public class Counter {
    //    реализуем счетчик
    public static void main(String[] args) {
//        тест 1, без значений
        System.out.println(Methods.getCount());
        Methods method1 = new Methods("first method");
//        тест 2 значение 1
        System.out.println(Methods.getCount());
        Methods method2 = new Methods("Second method");
//        тест 3 значение 2
        System.out.println(Methods.getCount());
        Methods method3 = new Methods("Third method");
//        тест 3 значение 3
        System.out.println(Methods.getCount());
    }
}
