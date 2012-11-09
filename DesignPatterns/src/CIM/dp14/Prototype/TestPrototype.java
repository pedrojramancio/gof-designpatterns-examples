package CIM.dp14.Prototype;

class TestPrototype {
	public static void main(String[] args) {
		
		System.out.println("Creating a Prototype Factory with "
				+ " a SoupSpoon and a SaladFork");
		PrototypeFactory prototypeFactory = new PrototypeFactory(
				new SoupSpoon(), new SaladFork());

		AbstractSpoon derivedSpoon = prototypeFactory.makeSpoon();
		AbstractFork fork = prototypeFactory.makeFork();
		System.out.println("Getting the Spoon and Fork name:");
		System.out.println("Spoon: " + derivedSpoon.getSpoonName() + ", Fork: "
				+ fork.getForkName());
		System.out.println(" ");

		System.out.println("Creating a Prototype Factory "
				+ "with a SaladSpoon and a SaladFork");
		SaladSpoon prototypeSpoon = new SaladSpoon();
		prototypeFactory = new PrototypeFactory(prototypeSpoon,
				new SaladFork());
		derivedSpoon = prototypeFactory.makeSpoon();
		fork = prototypeFactory.makeFork();
		System.out.println("Getting the Spoon and Fork name:");
		System.out.println("Spoon: " + derivedSpoon.getSpoonName() + ", Fork: "
				+ fork.getForkName());
		
		System.out.println("\nPrototype spoon: " + prototypeSpoon + "\nDerived spoon 1:" + derivedSpoon);
		System.out.println("\nPrototype spoon: " + prototypeSpoon + "\nDerived spoon 2:" + prototypeFactory.makeSpoon());
	}
}