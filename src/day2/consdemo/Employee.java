package day2.consdemo;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private int salary;

	public Employee() {
		employeeId=-1;
		employeeName="NotAvailable";
		employeeAddress="NoAddress";
		salary = -99;
	}
	public Employee(int employeeId, String employeeName, String employeeAddress, int salary) {
		this();		//constructor chaining 
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
		
	}
	public Employee(int employeeId, String employeeName, String employeeAddress) {
		this();		//constructor chaining 
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	public Employee(int employeeId, String employeeName) {
		this();		//constructor chaining 
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	
	}
	public Employee(int employeeId) {
		this();		//constructor chaining 
		this.employeeId = employeeId;
	}
	public void display() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Address :"+employeeAddress);
		System.out.println("Salary : "+salary);
	}
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.display();
		Employee employee2 = new Employee(988,"Tarun","Mandya",94000);
		employee2.display();
		Employee employee3 = new Employee(989,"Uday");	//NULL 0
		employee3.display();
		Employee employee4 = new Employee(990);	//NULL NULL 0
		employee4.display();
	}
}
