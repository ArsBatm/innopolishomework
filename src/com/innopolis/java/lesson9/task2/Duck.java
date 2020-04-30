package innopolis.java.lesson9.task2;

class Duck  implements Swim, Run, Fly {
//  иницилизация способностей утки

    public void canFly() {
        System.out.println("Can fly");

    }
    public void canSwim() {
        System.out.println("Can swim");

    }
    public void canRun() {
        System.out.println("Can run");
    }


}
