package day2.inheritdemo;
public class RegularEmployee extends Employee {
	private int salary;
	private int bonus;

	public void markAttendance() {
		System.out.println(getEmployeeName() + " ,has marked his/her attendance");
	}
}