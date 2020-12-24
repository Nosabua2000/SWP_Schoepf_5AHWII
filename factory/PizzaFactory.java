package factory;
public class PizzaFactory {

    static IPizza prepare(String s){
        IPizza pizza;
        s=s.toLowerCase();
        switch (s) {
            case "diabolo":
                pizza = new Diavolo();
                break;
            case "salami":
                pizza = new Salami();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }
        return pizza;
    }

}