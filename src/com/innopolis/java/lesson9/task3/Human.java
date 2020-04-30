package innopolis.java.lesson9.task3;
//  Объявление абстрактного класса человек, содержащий интерфейсы бежать и плавать
abstract class Human implements Run, Swim {
//  Объявление методов методов
    public abstract void fastRun();

    public  abstract void slowRun();

    public abstract void fastSwim();

    public abstract void slowSwim();
}
