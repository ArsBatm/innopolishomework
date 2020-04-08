package innopolis.java.lesson2.task3;

class Task3 {
    public static void main(String args[]){
        int rawSalary;
        //Заработная плата до вычета налогов

        System.out.println(" Заработная плата белая");
        rawSalary = 1;

        double netSalary = rawSalary* 0.87;
        //зп после вычета налогов

        System.out.println("Зарплата на руки");
        //вывод суммы на экран

        System.out.println(netSalary);
    }
}
