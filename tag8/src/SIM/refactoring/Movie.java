package SIM.refactoring;

public class Movie {
	
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private Price _price;
	private String _title;

	
	public Movie(String title, int priceCode){
		_title = title;
		setPriceCode(priceCode);
		
	}
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		_title = title;
	}
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	public void setPriceCode(int priceCode) {
		switch(priceCode){
		case REGULAR:
			_price = new RegularPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		case CHILDREN:
			_price = new ChildrensPrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code"); 
		}
	}
	
	
	// Move Method
	public double getCharge(int daysRented) {
		double result = 0;
		// determine amounts for each line
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2)
				result += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDREN:
			result += 1.5;
			if (daysRented > 3)
				result += (daysRented - 3) * 1.5;
			break;
		}
		return result;
	}
	
	public int getFrenquentRenterPoits(int daysRented) {
		// add bonus for a two days new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE)
				&& daysRented > 1)
			return 1;
		else
			return 0;
	}


}