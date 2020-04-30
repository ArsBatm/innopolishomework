package innopolis.java.lesson8.task2;

public class Calculator {
    //  Объявление статических методов операций для дробных чисел
    public static  double plusDoub (double firstNumberDoub, double secondNumberDoub){
        return firstNumberDoub + secondNumberDoub;
    }

   public static  double minusDoub (double firstNumberDoub, double secondNumberDoub){
        return firstNumberDoub - secondNumberDoub;
    }

   public static  double multiDoub (double firstNumberDoub, double secondNumberDoub){
        return firstNumberDoub * secondNumberDoub;
    }

   public static  double divDoub (double firstNumberDoub, double secondNumberDoub){
        return firstNumberDoub / secondNumberDoub;
    }

   public static  double perDoub (double firstNumberDoub, double secondNumberDoub){
        return (firstNumberDoub/100) * secondNumberDoub;
    }

//  Объявление статических методов операций для целых чисел
   public static  int plusI (int firstNumberInt, int secondNumberInt){
        return firstNumberInt + secondNumberInt;
    }

   public static  int minusI (int firstNumberInt, int secondNumberInt){
        return firstNumberInt - secondNumberInt;
    }

   public static  int multiI (int firstNumberInt, int secondNumberInt){
        return firstNumberInt * secondNumberInt;
    }

   public static  int divI (int firstNumberInt, int secondNumberInt){
        return firstNumberInt / secondNumberInt;
    }

   public static  int perI (int firstNumberInt, int secondNumberInt){
        return (firstNumberInt/100) * secondNumberInt;
    }



}
