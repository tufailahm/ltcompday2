package day2.inheritdemo;


public class Demo {

	public static void main(String[] args) {
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setEmployeeName("Yamini");
		contractEmployee.registerEmployee();
		contractEmployee.raiseInvoice();
		
		
		Employee employee = new Employee(22, 188, "Tufail", "Bangalore", "8867205331");
		System.out.println(employee);
		
	}
}
