package CIM.dp06.Observer.adaptado;

public class ObserverEvent {
	
	private Object source;

	public Object getSource() {
		return source;
	}

	public ObserverEvent(Object sourceIn) {
		this.source = sourceIn;
	}

}
