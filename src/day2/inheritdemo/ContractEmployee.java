package day2.inheritdemo;
public class ContractEmployee extends Employee {
	public int age = 20;
	private int contractDuration;
	private int payPerHour;

	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
	



	public void raiseInvoice() {
		System.out.println(getEmployeeName() + " ,has raised invoice");
	}

	// method overriding
	public void registerEmployee() {
		int age = 30;
		System.out.println(getEmployeeName() + " ,  got registered in contractual way");
		System.out.println("The age of the employee is :" + age);
		System.out.println("The this.age of the employee is :" + this.age);
		System.out.println("The super.age of the employee is :" + getAge());
	}
}