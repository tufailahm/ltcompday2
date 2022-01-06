package day3.exceptiondemo;

import java.util.Scanner;

public class EmployeeMain {

	public void display() {
		String names[] ={"William","Obama","Modi","Rahul","Ahmed"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name  = scanner.next();
		
		boolean exists=false;
		for(String s:names) {
			if(name.equals(s))
			{
				exists = true;
				throw new UserAlreadyExistsException("User already exists, please enter a new name ");
			}
		}
		if(exists==false) {
			System.out.println("Welcome Mr/Ms. "+name);
		}
	}
	public static void main(String[] args) {
		EmployeeMain e = new EmployeeMain();
		try {
			e.display();
		} catch (UserAlreadyExistsException e1) {
			System.out.println(e1.getMessage());
		}

	}

}
