package innopolis.java.lesson8.task4;

/**
 * Объявление класса договора
 */
public class Contract {
    /**
     * Объявление переменных номера договора, дата и список товаров
     */
    private int conNumber;
    private int conData;
    private int[] conProductList;

    public Contract(int conNumber, int conData, int[] conProductList) {
        this.conNumber = conNumber;
        this.conData = conData;
        this.conProductList = conProductList.clone();

    }

    public int getConNumber() {
        return conNumber;
    }

    public int getConData() {
        return conData;
    }

    public int[] getConProductList() {
        return conProductList.clone();
    }
}
