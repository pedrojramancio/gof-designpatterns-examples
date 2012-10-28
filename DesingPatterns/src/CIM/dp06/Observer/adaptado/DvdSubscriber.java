package CIM.dp06.Observer.adaptado;

public class DvdSubscriber implements Observer {

	private DvdReleaseByCategory subject;
	private String subscriberName;

	public DvdSubscriber(String subscriberName) {
		super();
		this.subscriberName = subscriberName;
	}

	@Override
	public void setSubject(Subject subjectIn) {
		this.subject = (DvdReleaseByCategory) subjectIn;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public String getSubscriberName() {
		return this.subscriberName;
	}

	public DvdReleaseByCategory getSubject() {
		return subject;
	}

	@Override
	public void udpdate(ObserverEvent observerEvent) {
		DvdRelease dvdRealse = ((DdvObserverEvent) observerEvent)
				.getdvdRelease();

		if (observerEvent instanceof NewDdvObserverEvent) {
			newDvdRelease(dvdRealse);
		} else {
			updateDvdRelease(dvdRealse);
		}
	}

	private void newDvdRelease(DvdRelease dvdRealease) {
		System.out.println("");
		System.out.println("Alô " + this.subscriberName
				+ ", assinante da lista de DVDs "
				+ this.subject.getCategoryName());
		System.out.println("O novo DVD " + dvdRealease.getDvdName()
				+ " será liberado em " + dvdRealease.getDvdReleaseDay() + "/"
				+ dvdRealease.getDvdReleaseMonth() + "/"
				+ dvdRealease.getDvdReleaseYear() + ".");
	}

	private void updateDvdRelease(DvdRelease dvdRealease) {
		System.out.println("");
		System.out.println("Alô " + this.subscriberName
				+ ", assinante da lista de DVDs "
				+ this.subject.getCategoryName());
		System.out.println("Os seguintes DVDs foram revisados: "
				+ dvdRealease.getDvdName() + " será liberado em  "
				+ dvdRealease.getDvdReleaseDay() + "/"
				+ dvdRealease.getDvdReleaseMonth() + "/"
				+ dvdRealease.getDvdReleaseYear() + ".");
	}

}
