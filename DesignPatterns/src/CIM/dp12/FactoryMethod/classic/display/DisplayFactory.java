package CIM.dp12.FactoryMethod.classic.display;

public class DisplayFactory {

	public static Display getDisplay(int displayType) throws DisplayTypeException {
		Display display;

	      if (1 == displayType)
	         display = new CSVFile();
	      else if (2 == displayType)
	         display = new XMLFile();
	      else if (3 == displayType)
	         display = new DBFile();
	      else
	         throw new DisplayTypeException(); 
	      return display;
	}

}
