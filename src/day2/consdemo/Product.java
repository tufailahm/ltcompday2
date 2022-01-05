package day2.consdemo;
public class Product {
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	
	public Product() {
		productId=123;
		productName="bat";
		quantityOnHand=3;
		price=3000;
		
	}
	public Product(int productId, String productName, int quantityOnHand, int price) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public Product(int productId, String productName, int quantityOnHand) {
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
	}

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	public void display() {

		System.out.println("productId :"+productId);
		System.out.println("productName :"+productName);
		System.out.println("quantityOnHand :"+quantityOnHand);
		System.out.println("price :"+price);
		
	}
	public static void main(String args[]) {
		Product product1 = new Product();
		product1.display();
		Product product2 = new Product(456,"ball",5,500);
		product2.display();
	}

}
