package innopolis.java.lesson8.task3;

public class Methods {
    //    объявление счетчика
    private static int count;
    //    объявление тестового метода
    private String method1;

    //    инициализация счетчика и метода
    public Methods(String method1) {
        this.method1 = method1;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
