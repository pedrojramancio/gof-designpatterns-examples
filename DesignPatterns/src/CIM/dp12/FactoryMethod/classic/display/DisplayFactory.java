package CIM.dp12.FactoryMethod.classic.display;

public class DisplayFactory {

	public static Display getDisplay(DisplayType displayType)
			throws DisplayTypeException {
		Display display;

		if (displayType.equals(DisplayType.CVS))
			display = new CSVFile();
		else if (displayType.equals(DisplayType.XML))
			display = new XMLFile();
		else if (displayType.equals(DisplayType.BD))
			display = new DBFile();
		else
			throw new DisplayTypeException();
		return display;
	}

}
