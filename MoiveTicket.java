
public class MoiveTicket extends Product {

	private String dateTime;
	private Address address;
	private String movieName;
	private int screenNo;
	private double pricePerUnit;

	public MoiveTicket(double productCode, String productType, String dateTime, Address address, String movieName,
			int screenNo, double pricePerUnit) {
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

	public int getScreenNo() {
		return screenNo;
	}

	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}



}
