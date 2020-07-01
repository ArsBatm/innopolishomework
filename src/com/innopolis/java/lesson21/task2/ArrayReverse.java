package innopolis.java.lesson21.task2;

import java.util.Arrays;

/**
 * Класс для реверса массива
 */
public class ArrayReverse {

    public static void main(String[] args) {

/*
    Входной одномерный массив
 */
        int[] array = {34, 545, 421, 476, 787, 876};
/*
    Массив до реверса
 */
        System.out.println("Массив до реверса:");
        for (int i: array) {
            System.out.println(i);
        }
/*
    Цикл реверса одномерного массива
 */
        for (int leftStep = 0, rightStep = array.length - 1; leftStep < rightStep; leftStep++, rightStep--) {
            int temp = array[leftStep];
            array[leftStep] = array[rightStep];
            array[rightStep] = temp;
        }
/*
    Массив после реверса
 */
        System.out.println("Массив после реверса:");
        for (int j: array) {
            System.out.println(j);
        }
    }
}
