package innopolis.java.lesson6;


public class Task1 {

    static class Shop {
        Seller sell = new Seller();
        Product prod = new Product();

        private String brand;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
        this.brand = brand;
        }

        private int salary;

     public int getSalary(){
         return salary = sell.getSeller() * (prod.getProduct() * 5 + 15000);
     }

    }
}

 class Seller {
    private int seller;

     public void setSeller(int seller) {
         this.seller = seller;
     }

    public int getSeller() {
        return seller;
    }
}

class Product{
    private int product;

    public void setProduct(int product){
        this.product = product;
    }

    public int getProduct() {
        return product;
    }
}
