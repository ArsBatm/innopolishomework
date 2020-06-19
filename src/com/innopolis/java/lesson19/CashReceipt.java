package innopolis.java.lesson19;

import java.io.*;

/**
 * Класс перевода списка покупок с ценами и количеством в единый чек
 */
public class CashReceipt {
    public static void main(String[] args) {
/*
    Переменная для прочтения строк
 */
        String line, cost, count;
/*
    Переменная для подсчёта суммы покупок
*/
        double sum = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("put.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"))) {
/*
    Цикл для прочтения и записи строк
 */
            while ( true ) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                count = bufferedReader.readLine();
                Double countD = Double.parseDouble(count);
                cost = bufferedReader.readLine();
                Double costD = Double.parseDouble(cost);

                Double comp = costD * countD;
/*
    Запись строк в нужный формат
 */
                String s = String.format("%s   %.2f  x  %.3f = %.2f %n", line, costD, countD, comp);
                sum = sum + comp;
                bufferedWriter.write(s);
            }
            String sumString = String.format("Сумма в чеке: %.2f", sum);
            bufferedWriter.write(sumString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
