package innopolis.java.lesson6;


public class Task1 {
    //класс (условно) какой-то магазин
    public static class Shop {
        public String brand;
        //        название бренда
        public int seller;
        //        кол-во продавцов
        public int product;
//        кол-во продаваемой продукции

        Shop(String name, int count, int goods) {
            name = brand;
            count = seller;
            goods = product;
        }

        /*        формула рассчета зарплаты продавцов в магазине,
                где зарплата рассчитывается как среднее двойного кол-во продукции, продаваемой за неделю *
                * на коэф от продаж * на кол-во продавцов + стабильный оклад
         */
        private int profit() {
            int salary = seller * (product * 5 + 15000);
            return salary;
        }
    }


    public static void main(String[] args) {
        Shop newShop = new Shop("shop", 1, 1);
//        Ввести название магаза
        newShop.brand = " Обувь на все времена";
//        Ввести кол-во продавцов
        newShop.seller = 10;
//        Ввести кол-во продукции
        newShop.product = 5;
        newShop.profit();

        System.out.println("В магазине: " + newShop.brand);
        System.out.println("Кол-во продавцов: " + newShop.seller);
        System.out.println("В среднем продают товаров: " + newShop.product);
        System.out.println("Начислить заработную плату в размере: " + newShop.profit());

    }
}


