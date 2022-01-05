package day2.inheritdemo;

public class ProductApp {

	public static void main(String[] args) {
		
		Product product1 = new Product(100, "Lakme", 12, 99);
		product1.setPrice(199);
		
		System.out.println(product1);
	}
}
