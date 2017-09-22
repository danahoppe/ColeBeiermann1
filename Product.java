
public abstract class Product {

	private String productCode;
	private String productType;

	public Product(String productCode, String productType) {
		this.productType = productType;
		this.productCode = productCode;
	}
	
	public String getProductCode() {
		return productCode;
	}

	public String getProductType() {
		return productType;
	}




}
