package CIM.dp12.FactoryMethod.classic;

import CIM.dp12.FactoryMethod.classic.display.*;

//Test the functionality
class TestFactory {

	public static void main(String[] args) {
		DisplayType[] tipos = DisplayType.values();
		for (DisplayType displayType : tipos) {
			Display display;
			try {
				display = DisplayFactory.getDisplay(displayType);
				// converging code follows
				display.load("");
				display.formatConsistency();
			} catch (DisplayTypeException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
