package CIM.dp01.Adapter;

public class TeaBag {

	boolean teaBagIsSteeped;

	public TeaBag() {
		teaBagIsSteeped = false;
	}

	public void steepTeaInCup() {
		teaBagIsSteeped = true;
		System.out.println("tea bag is steeping in cup / bolsa de ch� est� embebendo na x�cara");
	}
}