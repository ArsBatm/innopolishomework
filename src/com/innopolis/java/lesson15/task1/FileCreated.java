package innopolis.java.lesson15.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Класс создающий, переименовывающий, копирующий и удаляющий файл
 */
public class FileCreated {

    public static void main(String[] args) throws IOException {
/*
    Объявление имени 1 и 2 файлов
 */
        String f1 = " newFile1.txt";
        String f2 = " newFile2.txt";
/*
Объяление 1ого и 2ого файлов
 */
        File file1 = new File(f1);
        File file2 = new File(f2);
/*
Задание директорий
 */
/*
    Блок, в котором создают файл
 */

        Path firstFile = Files.createFile(Paths.get(f1));
        System.out.println("Файл создан");
        Files.createDirectory(Paths.get("./newDir"));
        System.out.println("Директория добавлена");
/*
    Блок, в котором копируют файл
 */
        try {

            Files.copy(firstFile, Paths.get("./newDir/newFile2.txt"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл скопирован");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

/*
    Блок, в котором переименовывают файл
 */

        try {
            boolean rename = file1.renameTo(file2);
            if (rename) {

                System.out.println("Файл переименован");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
/*
    Блок, в котором удалют файл
 */
        try {
            System.out.println("Файл удален");
            Files.delete(firstFile);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}