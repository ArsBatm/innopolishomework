package innopolis.java.lesson22;
/**
 *  Класс для сравнения человеак по двум полям
 */

import java.util.Comparator;
public  class  PersonSuperComparator implements Comparator<Person> {
/*
    Метод для сравнения и сортировки людей по имени и возрасту
 */
        public int compare(Person obj1, Person obj2) {
            String name1 = obj1.getName();
            String name2 = obj2.getName();
            int age1 = obj1.getAge();
            int age2 = obj2.getAge();

            if (name1.equals(name2)) {
                return name1.compareTo(name2);
            } else {
                if (age1 > age2)
                    return 1;
                else if (age1 < age2)
                    return -1;
                else
                    return 0;
            }

        }
    }


