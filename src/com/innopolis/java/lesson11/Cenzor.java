package innopolis.java.lesson11;

import java.util.Scanner;
/**
 * Класс цензора, в котором и происходит вся обработка
 */
public class Cenzor {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
// Запрос у пользователя текста
        System.out.println("Введите свой текст: ");
        String text = in.nextLine();

        //   Анализ и цензурирования текста, с выводом на экран

        System.out.println(text.replaceAll("[Б|б]яка", "вырезано цензурой"));

    }
}
