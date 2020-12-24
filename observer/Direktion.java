package observer;

public class Direktion implements Observer {

    @Override
    public void notify(int val) {
        if(val >= 30){
            System.out.println("Dir notified: "+val);
        }
    }
}