package observer;

import observer.Direktion;

import java.util.Scanner;

public class main {
	 public static void main(String[] args) {
		 
	        Lehrer Lehr = new Lehrer("Juen");
	        Sekr Sekr = new Sekr();
	        Direktion Dir = new Direktion();

	        Observable heizung=new Observable(20);
	        heizung.addObs(Lehr);
	        heizung.addObs(Sekr);
	        heizung.addObs(Dir);
	        
	        boolean heizungAn = true;
	        while(heizungAn){
	            Scanner s =new Scanner(System.in);
	            String string = s.nextLine();
	            if (string.equals("anhalten")){
	                heizungAn = false;
	            }else{
	                try {
	                    int value=Integer.parseInt(string);
	                    System.out.println("Set Heizung to "+value);
	                    heizung.setVal(value);
	                }catch(Exception e){
	                    e.printStackTrace();
	                }
	            }
	        }
	        System.out.println("bb");
}
}
