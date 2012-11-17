package SIM.dp06.Observer.adaptado;

public class DvdRelease {
	private String serialNumber;
	private String dvdName;
	private int dvdReleaseYear;
	private int dvdReleaseMonth;
	private int dvdReleaseDay;

	public DvdRelease(String serialNumber, String dvdName, int dvdReleaseYear,
			int dvdReleaseMonth, int dvdReleaseDay) {
		setSerialNumber(serialNumber);
		setDvdName(dvdName);
		setDvdReleaseYear(dvdReleaseYear);
		setDvdReleaseMonth(dvdReleaseMonth);
		setDvdReleaseDay(dvdReleaseDay);
	}

	public void updateDvdRelease(String serialNumber, String dvdName,
			int dvdReleaseYear, int dvdReleaseMonth, int dvdReleaseDay) {
		setSerialNumber(serialNumber);
		setDvdName(dvdName);
		setDvdReleaseYear(dvdReleaseYear);
		setDvdReleaseMonth(dvdReleaseMonth);
		setDvdReleaseDay(dvdReleaseDay);
	}

	public void updateDvdReleaseDate(int dvdReleaseYear, int dvdReleaseMonth,
			int dvdReleaseDay) {
		setDvdReleaseYear(dvdReleaseYear);
		setDvdReleaseMonth(dvdReleaseMonth);
		setDvdReleaseDay(dvdReleaseDay);
	}

	public void setSerialNumber(String serialNumberIn) {
		this.serialNumber = serialNumberIn;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setDvdName(String dvdNameIn) {
		this.dvdName = dvdNameIn;
	}

	public String getDvdName() {
		return this.dvdName;
	}

	public void setDvdReleaseYear(int dvdReleaseYearIn) {
		this.dvdReleaseYear = dvdReleaseYearIn;
	}

	public int getDvdReleaseYear() {
		return this.dvdReleaseYear;
	}

	public void setDvdReleaseMonth(int dvdReleaseMonthIn) {
		this.dvdReleaseMonth = dvdReleaseMonthIn;
	}

	public int getDvdReleaseMonth() {
		return this.dvdReleaseMonth;
	}

	public void setDvdReleaseDay(int dvdReleaseDayIn) {
		this.dvdReleaseDay = dvdReleaseDayIn;
	}

	public int getDvdReleaseDay() {
		return this.dvdReleaseDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dvdName == null) ? 0 : dvdName.hashCode());
		result = prime * result + dvdReleaseDay;
		result = prime * result + dvdReleaseMonth;
		result = prime * result + dvdReleaseYear;
		result = prime * result
				+ ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DvdRelease other = (DvdRelease) obj;
		if (dvdName == null) {
			if (other.dvdName != null)
				return false;
		} else if (!dvdName.equals(other.dvdName))
			return false;
		if (dvdReleaseDay != other.dvdReleaseDay)
			return false;
		if (dvdReleaseMonth != other.dvdReleaseMonth)
			return false;
		if (dvdReleaseYear != other.dvdReleaseYear)
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}
}
