package SIM.refactoring;

public abstract class Price {
	abstract int getPriceCode();

	// Move Method
	abstract double getCharge(int daysRented);
}