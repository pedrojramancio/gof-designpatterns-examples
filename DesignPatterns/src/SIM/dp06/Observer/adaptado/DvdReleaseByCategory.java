package SIM.dp06.Observer.adaptado;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdReleaseByCategory extends Subject {
	String categoryName;
	ArrayList dvdReleaseList = new ArrayList();

	public DvdReleaseByCategory(String categoryNameIn) {
		categoryName = categoryNameIn;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void updateDvd(DvdRelease dvdRelease) {
		boolean dvdUpdated = false;
		if (dvdReleaseList.size() == 0) {
			dvdReleaseList.add(dvdRelease);
			notifyObservers(new NewDdvObserverEvent(this, dvdRelease));
		} else {
			DvdRelease tempDvdRelease;
			ListIterator listIterator = dvdReleaseList.listIterator();
			while (listIterator.hasNext()) {
				tempDvdRelease = (DvdRelease) listIterator.next();
				if (dvdRelease.getSerialNumber().equals(
						tempDvdRelease.getSerialNumber())) {
					listIterator.remove();
					listIterator.add(dvdRelease);
					notifyObservers(new UpdatedDdvObserverEvent(this, dvdRelease));
					break;
				}
			}
		}
	}

}
