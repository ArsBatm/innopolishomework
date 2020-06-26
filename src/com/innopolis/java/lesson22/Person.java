package innopolis.java.lesson22;

/**
 * Класс для описания человека
 */
public class Person {
/*
    Переменные возраста и имени человека
 */
    private int age;
    private String name;
/*
    Конструктор описания человека
 */
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
/*
    Геттеры полей
 */
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonSuperComparator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

