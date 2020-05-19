package innopolis.java.lesson13;

import java.util.Scanner;
/**
 * Класс матери, который предлагает еду и получает реакцию
 */
public class Mother {
    private static Scanner inScanner = new Scanner(System.in);
    public static void main(String[] args) {

        Child child = new Child();
        Food[] foods1 = Food.values();
/*
Блок, в котором передается доступная для получения пища
 */
        System.out.println("Что сегодня можно предложить ребенку");
        for (Food fo : foods1) {
            System.out.println(fo + " - " + fo.getBreakfast());
        }
/*
Блок, в котором идет ввод того, что будет есть ребенок
 */
        System.out.println("Ввод того, что сегодня будет есть ребенок");
        String lunch = inScanner.nextLine();
        Food foods = Food.valueOf(lunch.toUpperCase());
/*
Анализ поступившей еды и выбрасывание исключения, в случае отказа
 */
        try {
            child.eat(foods);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Спасибо за еду");
        }
    }
}

