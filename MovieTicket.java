import org.joda.time.DateTime;

public class MovieTicket extends Product {

	private String dateTime;
	private Address address;
	private String movieName;
	private String screenNo;
	private double pricePerUnit;

	public MovieTicket(String productCode, String productType, String dateTime, Address address, String movieName,
			String screenNo, double pricePerUnit) {
		super(productCode, productType);
		this.dateTime = dateTime;
		this.movieName = movieName;
		this.screenNo = screenNo;
		this.pricePerUnit = pricePerUnit;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(String screenNo) {
		this.screenNo = screenNo;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}



}
