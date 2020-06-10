package innopolis.java.lesson14;
//Перечисение списка действий автомата
public enum Command {
    CASH("Вывод баланса на экран"),
    MENU("Вывод меню на экран"),
    CASHIN("Внесение денежных средств"),
    ORDER("Заказ напитка"),
    OUTPUT("Выход");


//объявление переменной описания действия
    private final String description;

    Command(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
