package innopolis.java.lesson15.task2;

import java.io.File;

public class Recursion {
    public static void main(String[] args) {
/*
создает объект класса recMethod
 */
        RecMethod recMethod = new RecMethod();
/*
Создает директорию, которую будет обходить метод
 */
        String catalog = "rec\\";
        File directory = new File(catalog);
/*
Вызов метода обхода переданной дирректории
 */
        recMethod.printFiles(directory);

    }
}


