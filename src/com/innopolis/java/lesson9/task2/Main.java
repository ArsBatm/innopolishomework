package innopolis.java.lesson9.task2;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Duck duck = new Duck();
//вывод на консоль  способности что-то делать определенное животное
        System.out.println("bird information");
        bird.canFly();

        System.out.println("Cat information");
        cat.canRun();

        System.out.println("Duck information");
        duck.canFly();
        duck.canRun();
        duck.canSwim();
    }
}
