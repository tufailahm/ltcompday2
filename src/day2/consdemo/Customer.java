package day2.consdemo;
/*
 * Constructor
-------------------

special function because it will be called automatically, whenever you create an object.
it has same name as class name
will not have any return type , not even void.
initialize the member variables
it can be overloaded (ploymorphism)

 */
public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	public Customer() {
		System.out.println("######cons called");
		customerId=100;
		customerName="Harish";
		customerAddress="Agra";
		billAmount=98000;
	}
	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		System.out.println("######parametrized cons called");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}
	public void display() {
		System.out.println("Customer Id :"+customerId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Customer Address :"+customerAddress);
		System.out.println("Bill Amount : "+billAmount);
	}
	public static void main(String[] args) {
		System.out.println("Main");
		Customer customer1 = new Customer();	//default cons
		customer1.display();
		Customer customer2 = new Customer(87,"Tufail","Bangalore",65400);	// para
		customer2.display();
		Customer customer3 = new Customer(765,"Jaya","Udupi",7000);
		customer3.display();
	}

}
