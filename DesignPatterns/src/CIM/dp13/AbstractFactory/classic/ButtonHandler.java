package CIM.dp13.AbstractFactory.classic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener {
	  AutoSearchUI autoSearchUI;

	  public void actionPerformed(ActionEvent e) {
	    String searchResult = null;

	    if (e.getActionCommand().equals(AutoSearchUI.EXIT)) {
	      System.exit(1);
	    }
	    if (e.getActionCommand().equals(AutoSearchUI.SEARCH)) {
	      //get input values
	      String vhCategory = autoSearchUI.getSelectedCategory();
	      String vhType = autoSearchUI.getSelectedType();

	      //get one of Luxury or NonLuxury vehicle factories
	      VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

	      if (vhType.equals(AutoSearchUI.CAR)) {
	        Car c = vf.getCar();
	        searchResult = "Name: " + c.getCarName() + "  Features: "
	            + c.getCarFeatures();
	      }
	      if (vhType.equals(AutoSearchUI.SUV)) {
	        SUV s = vf.getSUV();
	        searchResult = "Name: " + s.getSUVName() + "  Features: "
	            + s.getSUVFeatures();
	      }
	      autoSearchUI.setResult(searchResult);
	    }

	  }

	  public ButtonHandler() {
	  }

	  public ButtonHandler(AutoSearchUI inObjAutoSearchUI) {
	    autoSearchUI = inObjAutoSearchUI;
	  }

	} // End of class ButtonHandler