package observer;

import observer.Observer;

import java.util.*;			//.* -> alles von java.util importieren. Wusst ich vorher nicht. Ist echt n�tzlich :D
public class Observable {
	private ArrayList<observer.Observer> ObserverList;
	private int val;
	
	void addObs (observer.Observer obs) {
		ObserverList.add(obs);
	}
	
	Observable(int val) {
		ObserverList = new ArrayList<observer.Observer>();
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
