package innopolis.java.lesson23;

import java.util.ArrayList;
import java.util.List;

public class BasketRealization implements Basket {
   private List<String> basket = new ArrayList<String>();


    @Override
    public void addProduct(String product, int quantity) {
       for(int i = 0; i< basket.size(); i++) {
       }

    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.add(product);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
return  null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
