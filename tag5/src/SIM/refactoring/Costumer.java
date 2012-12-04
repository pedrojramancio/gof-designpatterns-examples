package SIM.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Costumer {

	private String _name;
	private Vector _rentals = new Vector();

	public Costumer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String Statement() {
		
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ each.getCharge() + "\n";
		}
		// add footer lines
		result += "Amount owed is " + getTotalCharge()	 + "\n";
		result += "You earned " + getTotalFrequentRenterPoints()
				+ " frequent renter points";
		return result;
	} // end statement()
	
	private double getTotalCharge(){
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = (Rental)rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while(rentals.hasMoreElements()){
			Rental each = (Rental)rentals.nextElement();
			result += each.getFrenquentRenterPoits();
		}
		return result;
	}

}
