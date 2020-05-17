package innopolis.java.lesson13;

/**
 * Класс перечислений доступных продуктов
 */
public enum Food {
    APPLE("яблоко"),
    PORRIDGE("каша"),
    EGG("яицо"),
    SANDWICH("сандвич");
    /*
        Объявления поля, передающего еду на русском
     */
    private final String breakfast;

    Food(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getBreakfast() {
        return breakfast;
    }
}
