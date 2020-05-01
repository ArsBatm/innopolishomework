package innopolis.java.lesson7;

import java.util.Scanner;

public class Balance {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
//  переменная Баланса на начало работы автомата
        double cash = 0;
//  переменная позволяющая выйти из программы автомата
        boolean outPuted = false;
        Menu[] m = Menu.values();

        while (!outPuted) {
            System.out.println("Введите номер команды или help для вывода списка доступных команд");
            String com = inputScanner.next();

            if (com.toLowerCase().equals("help")) {
                listCommands();
                continue;
            }
            int commandIndex = Integer.parseInt(com);
            if (commandIndex < 1) {
                System.out.println("Попробуйте ввести другое число");
                continue;
            }
            Command command = Command.values()[commandIndex - 1];
            switch (command) {
                case CASH:
                    writeOutCash(cash);
                    break;
                case MENU:
                    System.out.println("Наше меню:");
                    getMenu(m);
                    break;
                case CASHIN:
                    System.out.println("Внесите средства");
                    cash = getCash(cash);
                    System.out.println("Кол-во денежных средств " + cash);
                    break;
                case ORDER:
                    System.out.println("Напишите название желаемого напитка из меню");
                    String menus = inputScanner.next();
                    Menu menu = Menu.valueOf(menus.toUpperCase());
                    switch (menu) {
                        case AMERICANO:
                            if (cash >= menu.AMERICANO.getPrice()) {
                                System.out.println("Возьмите ваш напиток - " + menu.AMERICANO);
                                cash = cash - menu.AMERICANO.getPrice();
                                System.out.println("Ваш баланс: " + cash + " рублей");
                            } else {
                                System.out.println("Недостаточно средств, пополните баланс");
                            }
                            break;
                        case CAPPUCCINO:
                            if (cash >= menu.CAPPUCCINO.getPrice()) {
                                System.out.println("Возьмите ваш напиток - " + menu.CAPPUCCINO);
                                cash = cash - menu.CAPPUCCINO.getPrice();
                                System.out.println("Ваш баланс: " + cash + " рублей");
                            } else {
                                System.out.println("Недостаточно средств, пополните баланс");
                            }
                            break;
                        case ESPRESSO:
                            if (cash >= menu.ESPRESSO.getPrice()) {
                                System.out.println("Возьмите ваш напиток - " + menu.ESPRESSO);
                                cash = cash - menu.ESPRESSO.getPrice();
                                System.out.println("Ваш баланс: " + cash + " рублей");
                            } else {
                                System.out.println("Недостаточно средств, пополните баланс");
                            }
                            break;
                        case LATTE:
                            if (cash >= menu.LATTE.getPrice()) {
                                System.out.println("Возьмите ваш напиток - " + menu.LATTE);
                                cash = cash - menu.LATTE.getPrice();
                                System.out.println("Ваш баланс: " + cash + " рублей");
                            } else {
                                System.out.println("Недостаточно средств, пополните баланс");
                            }
                            break;
                    }
                    break;
                case OUTPUT:
                    outPuted = true;
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
        System.out.println("Спасибо за заказ");
    }

//Объявление методов
//    метод вызова списка команд
    private static void listCommands() {
        System.out.println("Список доступных команд");
        for (int i = 0; i < Command.values().length; i++) {
            System.out.println((i + 1) + " - " + Command.values()[i].getDescription());
        }
    }
//    Метод вызова баланса
    private static void writeOutCash(double cash) {
        System.out.println(String.format("У вас на счету %.2f рублей", cash));
    }
//    Метод вызова меню  с ценами
    private static void getMenu(Menu[] m) {
        for (Menu men : m)
            System.out.println(men + " - " + men.getPrice() + " рублей");
    }
//    Метод вызова внесения средств
    private static double getCash(double oldCashAmount) {
        double cashIn = inputScanner.nextDouble();
        if (cashIn >= 0)
        return oldCashAmount + cashIn;
        else
        System.out.println("Вы не можете внести меньше 0 рублей");
        return oldCashAmount;
    }
}

