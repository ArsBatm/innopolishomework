package lesson4;

 class Task3 {
    public static void main(String[] args){

        int [] factor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        массив для подсчета

        for (int firstNumber = 0; firstNumber < factor.length; firstNumber++){
            System.out.println( firstNumber + " | ");
            for (int secondNumber = 0; secondNumber < factor.length; secondNumber++){
                System.out.println((secondNumber*firstNumber) + '\n');
            }
        }
    }
}
