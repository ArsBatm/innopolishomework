package innopolis.java.lesson8.task4;

public class Act {
    private int actNumber;
    private int actData;
    private int[] actProductList ;

    public Act( int actNumber, int actData, int[] actProductList ){
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

