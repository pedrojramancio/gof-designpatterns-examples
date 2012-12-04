package SIM.refactoring;

import java.util.Enumeration;

public abstract class Statement {

	public Statement() {
		super();
	}

	public String value(Costumer aCostumer) {
		Enumeration rentals = aCostumer.getRentals();
		String result = headerString(aCostumer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for each rental
			result += eachRentalString(each);
		}
		// add footer lines
		result += footerString(aCostumer);
		return result;
	}

	abstract String headerString(Costumer aCostumer);

	abstract String eachRentalString(Rental aRental);

	abstract String footerString(Costumer aCostumer);

}