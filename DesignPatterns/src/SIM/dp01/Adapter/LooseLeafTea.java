package SIM.dp01.Adapter;

public class LooseLeafTea {
	boolean teaIsSteeped;

	public LooseLeafTea() {
		teaIsSteeped = false;
	}

	public void steepTea() {
		teaIsSteeped = true;
		System.out.println("tea is steeping / chá está embebendo");
	}
}