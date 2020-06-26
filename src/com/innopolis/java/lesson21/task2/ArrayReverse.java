package innopolis.java.lesson21.task2;

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
    Переменная ссылки на последнюю ячейку массива
 */
        int rightStep = array.length - 1;
/*
    Цикл реверса одномерного массива
 */
        for (int leftStep = 0; leftStep < rightStep; leftStep++, rightStep--) {
            int temp = array[leftStep];
            array[leftStep] = array[rightStep];
            array[rightStep] = temp;
            System.out.println(array[leftStep]);
        }

    }
}
