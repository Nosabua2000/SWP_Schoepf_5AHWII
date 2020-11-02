import java.util.*;			//.* -> alles von java.util importieren. Wusst ich vorher nicht. Ist echt nützlich :D
public class Observable {
	private ArrayList<Observer> ObserverList;
	private int val;
	
	void addObs (Observer obs) {
		ObserverList.add(obs);
	}
	
	Observable(int val) {
		ObserverList = new ArrayList<Observer>();
		this.val = val;
	}
	
	void notifmsg() {
		for (Observer obs: ObserverList) {
			obs.notify(this.val);
		}
	}
	
	void setVal(int val) {
		this.val = val;
		notifmsg();
	}

}
