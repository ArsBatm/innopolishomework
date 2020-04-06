package innopolis.java.lesson4.task3;

 class Task3 {
    public static void main(String[] args){

        int factor = 11;
//        массив для подсчета
        for (int firstNumber = 1; firstNumber < factor; firstNumber++){
            System.out.print("\n" + firstNumber + "\n ");

            for (int secondNumber = 1; secondNumber < factor; secondNumber++){
                System.out.print(secondNumber*firstNumber +" ");
            }
        }
//        как выв
    }
}
