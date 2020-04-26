package innopolis.java.lesson9.task2;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Duck duck = new Duck();
//вывод на консоль имени и способности что-то делать определенное животное
        System.out.println("bird information");
        bird.getName();
        bird.canFly();

        System.out.println("Cat information");
        cat.getName();
        cat.canRun();

        System.out.println("Duck information");
        duck.getName();
        duck.canFly();
        duck.canRun();
        duck.canSwim();
    }
}
