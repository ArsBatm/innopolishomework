package innopolis.java.lesson9.task2;

class Cat extends Name implements Run {
//  иницилизация имени и способностей кошки

       public void getName(){
           System.out.println("Name cat");
       }

       public void canRun(){
           System.out.println("Can run");
       }
}
