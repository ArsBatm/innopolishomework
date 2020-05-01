package innopolis.java.lesson9.task2;

class Duck  implements Swim, Run, Fly {
//  иницилизация способностей утки

    public void fly() {
        System.out.println("Can fly");

    }
    public void swim() {
        System.out.println("Can swim");

    }
    public void run() {
        System.out.println("Can run");
    }


}
