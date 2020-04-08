package innopolis.java.lesson6;

public class Main{


    public static void main(String[] args) {

//        Shop newShop = new Shop();
        Seller newSeller = new Seller();
        Product newProduct = new Product();

//
//        newShop.setBrand("zara");
//        String shopName = newShop.getBrand();

        newSeller.setSeller(12);
        int shopSeller = newSeller.getSeller();

        newProduct.setProduct(324);
        int shopProduct = newProduct.getProduct();


//        System.out.println(shopName);
        System.out.println(shopSeller);
        System.out.println(shopProduct);

    }
}
