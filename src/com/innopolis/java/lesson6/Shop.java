package innopolis.java.lesson6;


// объявление названия магазина 
public class Shop {

    //Название магазина
    private String brand;
//    объявление массивов продавцов и товаров
    private Seller[] sellers;
    private Product[] products;


    public Shop(Seller[] sellers, Product[] products, String brand) {
        this.sellers = sellers;
        this.products = products;
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

