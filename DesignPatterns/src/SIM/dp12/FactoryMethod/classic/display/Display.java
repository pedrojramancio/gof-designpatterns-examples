package SIM.dp12.FactoryMethod.classic.display;

//Let's say the interface is Display
public interface Display {

	// load a file
	public void load(String fileName);

	// parse the file and make a consistent data type
	public void formatConsistency();

}