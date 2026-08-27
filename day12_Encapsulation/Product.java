package day12_Encapsulation;


public class Product {

	private int productId;
	private String productName;
	private double price;

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setPrice(double price) {

		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price must be greater than zero");
		}
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {

		Product product = new Product();

		product.setProductId(101);
		product.setProductName("Laptop");
		product.setPrice(55000);

		System.out.println("Product ID   : " + product.getProductId());
		System.out.println("Product Name : " + product.getProductName());
		System.out.println("Price        : " + product.getPrice());
	}
}
