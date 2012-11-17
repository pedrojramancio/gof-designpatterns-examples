package SIM.dp02.Facade;

import SIM.dp02.Facade.tea.FacadeCuppaMaker;

class TestFacade {
	public static void main(String[] args) {
		FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
		cuppaMaker.makeACuppa();
		System.out.println(cuppaMaker.showTeaCup());
	}
}
