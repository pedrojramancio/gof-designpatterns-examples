package SIM.refactoring;


public class HTMLStatement extends Statement {
	String headerString(Costumer aCostumer) {
		return "<H1>Rentals for <EM>" + aCostumer.getName() + "</EM></H1><P>\n";
	}

	String eachRentalString(Rental aRental) {
		return aRental.getMovie().getTitle() + ": "
				+ String.valueOf(aRental.getCharge()) + "<BR>\n";
	}

	String footerString(Costumer aCostumer) {
		return "<P>You owe <EM>" + String.valueOf(aCostumer.getTotalCharge())
				+ "</EM><P>\n" + "On this rental you earned <EM>"
				+ String.valueOf(aCostumer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
	}
}
