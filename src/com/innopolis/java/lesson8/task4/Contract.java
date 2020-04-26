package innopolis.java.lesson8.task4;

public class Contract {
    private int conNumber;
    private int conData;
    private int conProductList[] ;
    public Contract( int conNumber, int conData ){
        this.conNumber = conNumber;
        this.conData = conData;
    }

    public int getConNumber() {
        return conNumber;
    }

    public int getConData() {
        return conData;
    }

}
