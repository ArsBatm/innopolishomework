package innopolis.java.lesson8.task4;

/**
 * Объявление класса конвертации
 */
public class Сonversion {

    /**
     * Объяаление метода конвертации
     */

    public static Act convert(Contract contract) {

        return new Act(contract.getConNumber(), contract.getConData(), contract.getConProductList());
    }
}

