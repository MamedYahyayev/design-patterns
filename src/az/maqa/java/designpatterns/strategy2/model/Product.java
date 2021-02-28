package az.maqa.java.designpatterns.strategy2.model;

public class Product {

	private Float price;
	private String upcCode;

	public Product(Float price, String upcCode) {
		this.price = price;
		this.upcCode = upcCode;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @return the upcCode
	 */
	public String getUpcCode() {
		return upcCode;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", upcCode=" + upcCode + "]";
	}

}
