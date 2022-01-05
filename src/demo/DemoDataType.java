package demo;

import java.util.Scanner;

public class DemoDataType {

	int age;
	String name;
	boolean married;
	float salary;
	
	Scanner scanner = new Scanner(System.in);	//take input from user
	public void display() {
		System.out.println("Please enter your name :");
		name = scanner.next();
		
		System.out.println("Please enter your age : ");
		age = scanner.nextInt();
		
		System.out.println("Please enter your marital status (true/false) : ");
		married = scanner.nextBoolean();
		
		System.out.println("#### Here are the details entered by you ::  ");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Marital Status :"+married);

		
	}
	public static void main(String[] args) {
		DemoDataType dataType = new DemoDataType();
		dataType.display();
	}
}
