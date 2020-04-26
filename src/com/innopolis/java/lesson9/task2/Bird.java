package innopolis.java.lesson9.task2;

class Bird extends Name implements Fly {
//  иницилизация имени и  способностей птицы

       public void getName(){
           System.out.println("Name bird");
       }

       public void canFly(){
           System.out.println("Can fly");
       }
}
