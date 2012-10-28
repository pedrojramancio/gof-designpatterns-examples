package CIM.dp02.Facade.tea;

/**
 * @author pedrojramancio
 * 
 *         <em> Esta classe representa o desing pattern Façade </em>
 * 
 * 
 */

public class FacadeCuppaMaker {
	TeaCup cup;
	boolean teaBagIsSteeped;

	public FacadeCuppaMaker() {
		System.out
				.println("FacadeCuppaMaker ready to make you a cuppa! /  FacadeCuppaMaker pronto para fazer-lhe uma xícara de chá!");
	}

	/**
	 * Este método concrentra a inteligência da fachada. Comente as operações de
	 * cup ou water e veja o resultado da execução
	 */
	public void makeACuppa() {
		cup = new TeaCup();
		TeaBag teaBag = new TeaBag();
		Water water = new Water();
		cup.addTeaBag(teaBag);
		water.boilWater();
		cup.addWater(water);
		cup.steepTeaBag();
	}

	public String showTeaCup() {
		if (cup == null)
			return "Do the tea first / Faça o chá antes";
		else
			return cup.toString();

	}
}
