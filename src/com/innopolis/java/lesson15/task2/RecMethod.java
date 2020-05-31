package innopolis.java.lesson15.task2;

import java.io.File;

public class RecMethod {
    private int spaces = 0;

    /**
     * Метод выводит на консоль все каталоги и файлы из данного каталога,
     *
     * @param directory - каталог
     */
    public void printFiles(File directory) {
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.println(" ".repeat(spaces) + file.getName());
            if (file.isDirectory()) {
                spaces = spaces + 2;
                this.printFiles(file);
                spaces = spaces - 2;
            }
        }
    }
}




/*
    public static File recursion(File f, int i) throws IndexOutOfBoundsException {
        File[] files = f.listFiles();
        if (files.length != i) {
            if (files[i].isDirectory()) {
                System.out.println(files[i].getName() + " - ");
            } else {
                System.out.println(files[i].getName() + " - ");
            }
        } else {
            throw new IndexOutOfBoundsException("nothing");
        }
        i++;
        return recursion(f, i);
    }
}
*/
