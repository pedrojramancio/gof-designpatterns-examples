package CIM.dp06.Observer.adaptado;

public class DdvObserverEvent extends ObserverEvent {
	
	private DvdRelease dvdRelease;

	public DdvObserverEvent(Object sourceIn, DvdRelease dvdRelease) {
		super(sourceIn);
		this.dvdRelease = dvdRelease;
	}
	
	public DvdRelease getdvdRelease() {
		return dvdRelease;
	}

}
