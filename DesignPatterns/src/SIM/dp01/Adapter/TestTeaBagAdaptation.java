package SIM.dp01.Adapter;

class TestTeaBagAdaptation {

	public static void main(String[] args) {
		TeaCup teaCup = new TeaCup();

		System.out.println("Steeping tea bag / Embebendo saco de chá");
		TeaBag teaBag = new TeaBag();
		teaCup.steepTeaBag(teaBag);

		System.out.println("Steeping loose leaf tea / Embebendo folha solta de chá");
		LooseLeafTea looseLeafTea = new LooseLeafTea();
		AdapterTeaBall teaBall = new AdapterTeaBall(looseLeafTea);
		teaCup.steepTeaBag(teaBall);
	}
}