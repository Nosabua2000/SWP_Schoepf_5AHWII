package observer;
import observer.Observer;

public class Sekr implements Observer {

    @Override
    public void notify(int val) {
        System.out.println("Sekr. notify "+val);
    }
}


