package SIM.dp06.Observer.adaptado;

import java.util.ArrayList;
import java.util.ListIterator;

public class Subject {
	ArrayList observers = new ArrayList();

	public boolean addObserver(Observer observerIn) {
		observerIn.setSubject(this);
		return observers.add(observerIn);
	}

	public boolean removeObserver(Observer observerIn) {
		ListIterator listIterator = observers.listIterator();
		while (listIterator.hasNext()) {
			if (observerIn == (Observer) (listIterator.next())) {
				listIterator.remove();
				return true;
			}
		}
		return false;
	}

	public void notifyObservers(ObserverEvent observerEvent) {
		for (int i = 0; i < observers.size(); i++) {
			((Observer) observers.get(i)).udpdate(observerEvent);
		}
	}

}
