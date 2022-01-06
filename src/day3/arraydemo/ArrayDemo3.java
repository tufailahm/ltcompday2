package day3.arraydemo;

//Use case : WAP to store 5 products information
public class ArrayDemo3 {

	public void display() {
		Product[] product = new Product[5];

		product[0] = new Product(100, "Lakme", 10, 120);
		product[1] = new Product(101, "Aroma", 10, 220);
		product[2] = new Product(102, "Mouse", 10, 200);
		product[3] = new Product(103, "Monitor", 10, 90);
		product[4] = new Product(104, "Pendrive", 12, 99);
		
		//Hands on
		//To print all the product using enhanced for loop
		System.out.println("All the product details : ");
		for(Product p:product) {
			System.out.println(p);
		}

		String address[] = { "Pune", "Mangalore", "Mandya", "Udupi"};
		
		for(String s:address) {
			System.out.println(s); 
		}
	}

	public static void main(String[] args) {
		ArrayDemo3 d = new ArrayDemo3();
		d.display();

	}

}
