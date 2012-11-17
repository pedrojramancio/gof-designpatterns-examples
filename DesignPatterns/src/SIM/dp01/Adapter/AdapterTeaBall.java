package SIM.dp01.Adapter;

/**
 *  @author pedrojramancio
 *  
 *  <em> Esta classe representa o desing pattern Adapter </em>
 *  
 *
 */

public class AdapterTeaBall extends TeaBag {
	LooseLeafTea looseLeafTea;

	public AdapterTeaBall(LooseLeafTea looseLeafTeaIn) {
		looseLeafTea = looseLeafTeaIn;
		teaBagIsSteeped = looseLeafTea.teaIsSteeped;
	}

	public void steepTeaInCup() {
		looseLeafTea.steepTea();
		teaBagIsSteeped = true;
	}
}