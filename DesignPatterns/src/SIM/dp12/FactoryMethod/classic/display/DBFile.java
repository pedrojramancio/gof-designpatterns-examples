package SIM.dp12.FactoryMethod.classic.display;

//deal with binary format file
class DBFile implements Display {

	public void load(String dbfile) {
		System.out.println("load from a db file");
	}

	public void formatConsistency() {
		System.out.println("db file format changed");
	}
}