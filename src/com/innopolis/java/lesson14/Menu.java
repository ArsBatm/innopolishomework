package innopolis.java.lesson14;
//перечисление меню
public enum Menu {
    AMERICANO (30),
    CAPPUCCINO( 35),
    ESPRESSO(25),
    LATTE(50);

//переменная цены
    private final double price;

    Menu (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}