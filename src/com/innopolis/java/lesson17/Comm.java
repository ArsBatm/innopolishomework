package innopolis.java.lesson17;

/**
 *  Класс перечисления команд
 */

public enum Comm {
    LIBRARY("библиотека"),
    BOOKCREATED("добавление книги"),
    EXIST("выход");

    private final String commands;

    Comm(String command){
        this.commands = command;
    }

    public String getComm() {
        return commands;
    }
}

