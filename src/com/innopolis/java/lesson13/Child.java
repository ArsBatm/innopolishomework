package innopolis.java.lesson13;

/**
 * Класс ребенка, анализирующий поступившую еду
 */
public class Child {
    /*
    Переменная массива, для анализа еды
     */
    private Food[] tastyFood;

    /*
    Конструктор, в котором прописывается та еда, которую ребенок ест
     */
    public Child() {
        Food[] tastyFood = new Food[]{Food.APPLE, Food.SANDWICH};
        this.tastyFood = tastyFood;
    }

    /*
    Метод, анализирующий вкус ребенка и выбрасывающий исключение, в случае отказа от еды
     */
    public Food eat(Food food) throws Exception {
        for (Food f : tastyFood) {
            if (food == f) {
                System.out.println("Я поел за обе щеки" + " " + f.getBreakfast());
                break;
            } else throw new Exception("Выплюнул" + " " + f.getBreakfast());
        }
        return food;
    }
}
