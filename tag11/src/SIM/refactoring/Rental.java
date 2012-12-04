package SIM.refactoring;

public class Rental {

	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	// Move Method
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	public int getFrenquentRenterPoits() {
		return _movie.getFrenquentRenterPoits(_daysRented);
	}

}
