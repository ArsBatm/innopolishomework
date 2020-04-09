package innopolis.java.lesson6;


public class Shop {

    //Название магазина
    private String brand;
//    Объявление массивов продавцов и товаров
    private Seller[] sellers;
    private Product[] products;


    public Shop(Seller[] sellers, Product[] products, String brand) {
        this.sellers = sellers;
        this.products = products;
        this.brand = brand;
    }

    public Seller[] getSellers() {
        return sellers;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getBrand() {
        return brand;
    }
}

