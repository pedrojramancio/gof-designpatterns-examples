package SIM.dp05.Singleton;

class TestSingleSpoon {

	public static void main(String[] args) {
		System.out.println("First person getting the spoon");
		SingleSpoon spoonForFirstPerson = SingleSpoon.getTheSpoon();
		if (spoonForFirstPerson != null)
			System.out.println(spoonForFirstPerson);
		else
			System.out.println("No spoon was available");

		System.out.println("");

		System.out.println("Second person getting a spoon");
		SingleSpoon spoonForSecondPerson = SingleSpoon.getTheSpoon();
		if (spoonForSecondPerson != null)
			System.out.println(spoonForSecondPerson);
		else
			System.out.println("No spoon was available");

		System.out.println("");

		System.out.println("First person returning the spoon");
		spoonForFirstPerson.returnTheSpoon();
		spoonForFirstPerson = null;
		System.out.println("The spoon was returned");

		System.out.println("");

		System.out.println("Second person getting a spoon");
		spoonForSecondPerson = SingleSpoon.getTheSpoon();
		if (spoonForSecondPerson != null)
			System.out.println(spoonForSecondPerson);
		else
			System.out.println("No spoon was available");
		
		// Ah! Vou clonar! 
		try {
			SingleSpoon spoonClone = (SingleSpoon) spoonForSecondPerson.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("");
			System.out.println("Boooooo! Cloning not allowed.");
		}
	}
}