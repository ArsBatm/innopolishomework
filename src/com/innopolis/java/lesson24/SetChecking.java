package innopolis.java.lesson24;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс с методом удаления строк, с четным кол-вом сиволов
 */
public class SetChecking {
/*
    Метод, в которо происходит удаление
    на вход принимает колеекцию Set
 */
    public  Set<String> removeEvenLength(Set<String> set){
/*
    Создает коллекцию для записи туда всех строк
    с нечетным кол-вом символов
 */
        Set<String> set1 = new HashSet<>();
/*
    Обход входной коллекции
 */
        for (Object object : set) {
            String element = (String) object;
/*
    Проверка на кол-во символов
    и запись в выходную коллекцию
 */
            if (element.length()%2 != 0 ) {
                set1.add(element);
            }
        }
        return set1;
    }

}
