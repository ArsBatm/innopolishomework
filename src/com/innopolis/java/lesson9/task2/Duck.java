package innopolis.java.lesson9.task2;

class Duck extends Name implements Swim, Run, Fly {
//  иницилизация имени и способностей утки
    @Override
    public void getName() {
        System.out.println("Duck Name");
    }

    @Override
    public void canFly() {
        System.out.println("Can fly");

    }
    @Override
    public void canSwim() {
        System.out.println("Can swim");

    }
    @Override
    public void canRun() {
        System.out.println("Can run");
    }


}
