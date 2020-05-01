package innopolis.java.lesson9.task3;
/**
 * Женщина
 */
public class Realize1 extends Human {

    @Override
    public void fastRun() {
        System.out.println("Человек бегает быстро");
    }

    @Override
    public void slowRun() {
        System.out.println("Человек бегает медленно");
    }

    @Override
    public void fastSwim() {
        System.out.println("Человек плавает быстро");
    }

    @Override
    public void slowSwim() {
        System.out.println("Человек плавает медленно");
    }
}
