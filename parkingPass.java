
public class parkingPass extends Product{

	private double parkingFee;
	
	public parkingPass(double productCode, String productType, double parkingFee) {
		super(productCode, productType);
		this.parkingFee = parkingFee;
	}

	
	public double getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}
}
