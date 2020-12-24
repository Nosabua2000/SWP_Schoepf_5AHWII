package factory;

import java.util.ArrayList;

class Salami implements IPizza {

    private ArrayList<String> ingredients = new ArrayList<String>();

    Salami(){
        ingredients.add("Teig");
        ingredients.add("Tomatensosse");
        ingredients.add("Salami");
    }

    @Override
    public void printIngredients() {
        for (String s:ingredients) {
            System.out.print(s+", ");
        }
        System.out.println();
    }
}