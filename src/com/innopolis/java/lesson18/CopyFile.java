package innopolis.java.lesson18;

import java.io.*;

/**
 * Программа переводящая файл из одного формата в другой
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {
/*
    Переменные исходной и конечной кодировок
*/
        String firstCharset = "UTF-8";
        String secondCharset = "windows-1251";
        int readed;
/*
    Размер буфера для записи
*/
        char[] buf = new char[1024];
/*
    Классы чтения и записи файлов
*/
        try (
                FileInputStream fis = new FileInputStream("file.txt");
                InputStreamReader isr = new InputStreamReader(fis, firstCharset);
                FileOutputStream fos = new FileOutputStream("file1.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, secondCharset);) {
            while ( (readed = isr.read(buf, 0, 1024)) > 0 ) {
                osw.write(buf, 0, readed);
            }
        }
    }
}
