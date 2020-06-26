package innopolis.java.lesson21.task1;
/**
 *  Класс с методом для смещения массива
 */

public class ArrayLeft {
    public  void toLeft() {
/*
    Данный двумерный масив массив
 */
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8},{9,10,11,12},{1,2,3,4}};
/*
    Цикл смещения и замены последних ячеек в строке
 */
        for (int i =  0; i < a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                a[i][j] = a[i][j+1];
                System.out.print(a[i][j]);
            }
            a[i][a[i].length-1] = 0;
            System.out.println(a[i][a[i].length-1]);
        }

/*


 */

/*
        for (int m = 0; m < b.length-1 ; m++) {

            b[m] = b[m+1];
            System.out.println(b[m]);
        }
        b[b.length-1] = 0;
        System.out.println(b[b.length-1]);


 */

    }
}
