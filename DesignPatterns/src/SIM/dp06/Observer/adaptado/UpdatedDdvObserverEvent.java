package SIM.dp06.Observer.adaptado;

public class UpdatedDdvObserverEvent extends DdvObserverEvent {

	public UpdatedDdvObserverEvent(DvdReleaseByCategory dvdReleaseByCategoryIn, DvdRelease dvdReleaseIn) {
		super(dvdReleaseByCategoryIn, dvdReleaseIn);
	}

}
