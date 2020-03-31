package lesson4;

 class Task3 {
    public static void main(String[] args){

        int [] factor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        массив для подсчета
        for (int firstNumber = 1; firstNumber < factor.length; firstNumber++){
            System.out.print("\n" + firstNumber + "\n ");

            for (int secondNumber = 1; secondNumber < factor.length; secondNumber++){
                System.out.print(secondNumber*firstNumber +" ");
            }
        }
//        как выв
    }
}
