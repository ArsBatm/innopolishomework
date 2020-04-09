package innopolis.java.lesson6;

public class Seller {
    /*кол-во продавцов в магазине
    необходимо для подсчета заработной платы за месяц
     */
   private int seller;

    public Seller(int seller){
        this.seller = seller;
    }
    public int getSeller(){
        return seller;
    }
}
