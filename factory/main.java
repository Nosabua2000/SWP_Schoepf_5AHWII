package factory;

public class Main implements IPizza {

    public static void main(String[] args) {
        IPizza diavolo = PizzaFactory.prepare("Diavolo");
        Diavolo.printIngredients();

        IPizza salami = PizzaFactory.prepare("Salami");
        salami.printIngredients();

    }

    @Override
    public void printIngredients() {

    }
}