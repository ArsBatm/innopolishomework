package innopolis.java.lesson17;

/**
 * Класс добавления книги в библиотеку
 */

import java.io.*;
import java.util.Scanner;

public class Library {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        boolean logOff = false;
        Comm[] c = Comm.values();

        while ( !logOff ) {
            System.out.println("Введите help для вывода списка доступных команд");
/*
    Ввод нужной команды
*/
            String listComm = inputScanner.next();

            if (listComm.toLowerCase().equals("help")) {
                menuList();
                continue;
            }

            int commIndex;
            commIndex = Integer.parseInt(listComm);
            Comm comm = Comm.values()[commIndex - 1];
/*
    Выбор конкретной команды
 */
            switch (comm) {
                case LIBRARY:
/*
    Вывод всей библиотеки
 */
                    FileInputStream fileInputStream = new FileInputStream("library.data");
                    try {
                        DataInputStream dis = new DataInputStream(fileInputStream);
                        while ( true ) {
                            System.out.println(dis.readUTF());
                        }
                    } catch (IOException e) {
                        fileInputStream.close();
                        e.getMessage();
                    }
                    break;
                case BOOKCREATED:
                    System.out.println("Введите название книги");
                    String title = inputScanner.next();

                    System.out.println("Введите автора книги");
                    String author = inputScanner.next();

                    System.out.println("Введите год написания книги");
                    String year = inputScanner.next();
/*
    ввод новой книги в файл
 */
                    FileOutputStream library = new FileOutputStream("library.data", true);
                    try {
                        DataOutputStream dos = new DataOutputStream(library);
                        Book book = new Book(title, author, year);
                        dos.writeUTF(book.toString());
                        library.close();
                    } catch (IOException ex) {
                        ex.getMessage();
                    }
                    break;
                case EXIST:
/*
    Выход из программы
 */
                    logOff = true;
                    break;
            }
        }
    }

    private static void menuList() {
        System.out.println("Список доступных команд");
        for (int i = 0; i < Comm.values().length; i++) {
            System.out.println((i + 1) + " - " + Comm.values()[i].getComm());
        }
    }
}
