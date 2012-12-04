package SIM.refactoring;

public class Movie {
	
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	
	public Movie(String title, int priceCode){
		_title = title;
		_priceCode = priceCode;
		
	}
	private String _title;
	private int _priceCode;
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		_title = title;
	}
	public int getPriceCode() {
		return _priceCode;
	}
	public void setPriceCode(int priceCode) {
		_priceCode = priceCode;
	}
	

}
