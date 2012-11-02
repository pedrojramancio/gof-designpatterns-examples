package CIM.dp12.FactoryMethod.classic;

import CIM.dp12.FactoryMethod.classic.display.*;


//Test the functionality
class TestFactory {

  public static void main(String[] args) {
	  
      for (int displayType = 1; displayType <= 4 ; displayType++ ){
    	  Display display;
		try {
			display = DisplayFactory.getDisplay(displayType);
			//converging code follows
			display.load("");
			display.formatConsistency();
		} catch (DisplayTypeException e) {
			System.out.println(e.getMessage());
		}
    	  
      }
      
 }    
}
