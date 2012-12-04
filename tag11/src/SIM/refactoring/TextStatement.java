package SIM.refactoring;


public class TextStatement extends Statement {

	String headerString(Costumer aCostumer) {
		return "Rental Record for " + aCostumer.getName() + "\n";
	}

	String eachRentalString(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t"
				+ aRental.getCharge() + "\n";
	}

	String footerString(Costumer aCostumer) {
		return "Amount owed is " + aCostumer.getTotalCharge() + "\n"
				+ "You earned " + aCostumer.getTotalFrequentRenterPoints()
				+ " frequent renter points";
	}

}
