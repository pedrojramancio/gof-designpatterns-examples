package CIM.dp06.Observer.adaptado;

public interface Observer {
	public void udpdate(ObserverEvent observerEvent);
	public void setSubject(Subject subject);
}
