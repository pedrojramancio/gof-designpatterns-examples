package CIM.dp02.Facade.tea;

/**
 * @author pedrojramancio
 * 
 *         <em> Esta classe representa o desing pattern Fa�ade </em>
 * 
 * 
 */

public class FacadeCuppaMaker {
	TeaCup cup;
	boolean teaBagIsSteeped;

	public FacadeCuppaMaker() {
		System.out
				.println("FacadeCuppaMaker ready to make you a cuppa! /  FacadeCuppaMaker pronto para fazer-lhe uma x�cara de ch�!");
	}

	/**
	 * Este m�todo concrentra a intelig�ncia da fachada. Comente as opera��es de
	 * cup ou water e veja o resultado da execu��o
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
			return "Do the tea first / Fa�a o ch� antes";
		else
			return cup.toString();

	}
}
