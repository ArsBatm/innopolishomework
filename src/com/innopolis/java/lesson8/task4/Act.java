package innopolis.java.lesson8.task4;

/**
 * Объявление класса акта
 */
public class Act {
    /**
     * Объявление переменных номера договора, дата и список товаров
     */
    private int actNumber;
    private int actData;
    private int[] actProductList;

    public Act(int actNumber, int actData, int[] actProductList) {
        this.actNumber = actNumber;
        this.actData = actData;
        this.actProductList = actProductList;
    }

    public int getActNumber() {
        return actNumber;
    }

    public int getActData() {
        return actData;
    }

    public int[] getActProductList() {
        return actProductList;
    }
}

