public class Lehrer implements Observer {
	private String name;
    Lehrer(String name){
        this.name = name;
    }

    @Override
    public void notify(int val) {
        if(val >= 25) {
            System.out.println(name+" notified: "+val);
        }
    }
}

