package factory;
import java.util.ArrayList;

class Diavolo implements IPizza {

    private ArrayList<String> ingredients=new ArrayList<String>();

    Diavolo(){
        ingredients.add("Teig");
        ingredients.add("Tomaten");
        ingredients.add("Pfefferoni");
        ingredients.add("scharfe Salami");
    }

    @Override
    public void printIngredients() {
        for (String s:ingredients) {
            System.out.print(s+", ");
        }
        System.out.println();
    }
}