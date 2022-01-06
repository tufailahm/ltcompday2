package day2.inheritdemo;
public class Employee{
	private int age = 10;
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private String mobileNumber;
	private final double PI = 3.14;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int age, int employeeId, String employeeName, String employeeAddress, String mobileNumber) {
		super();
		this.age = age;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.mobileNumber = mobileNumber;
	}


	public  void registerEmployee() {
		System.out.println(employeeName + " ,  got registered by Employee");
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	@Override
	public String toString() {
		return "Employee [age=" + age + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", employeeAddress=" + employeeAddress + ", mobileNumber=" + mobileNumber + "]";
	}

	
	
	
}