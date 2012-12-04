package SIM.refactoring;

public class Main {
	public Main() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main program = new Main();
		program.execute();

	}

	private void execute() {
		Costumer DinsDale = new Costumer("Dinsdale Pirhana");
		DinsDale.addRental(new Rental(new Movie(
				"Monty Python and the Holy Grail", Movie.REGULAR), 3));
		DinsDale.addRental(new Rental(new Movie("Ran", Movie.REGULAR), 1));
		DinsDale.addRental(new Rental(new Movie("Star Trek 27",
				Movie.NEW_RELEASE), 2));
		DinsDale.addRental(new Rental(
				new Movie("Star Wars 3.2", Movie.CHILDREN), 4));
		DinsDale.addRental(new Rental(new Movie("Wallace and Gromit",
				Movie.CHILDREN), 6));
		System.out.println(DinsDale.Statement());
		System.out.println(DinsDale.htmlStatement());

	}

}
