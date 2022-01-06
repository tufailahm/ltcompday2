package day3.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	Scanner scanner = new Scanner(System.in);
	int num1, num2;
	int result = 0;

	public void display() {
		try {
			System.out.println("Enter first number :");
			num1 = scanner.nextInt();
			System.out.println("Enter second number :");
			num2 = scanner.nextInt();

			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Numbers cannot be divided by zero");
		} catch (InputMismatchException e) {
			System.out.println("Please enter numbers only");
		} catch (Exception e) {
			System.out.println("Some error occurred");
		} finally {
			System.out.println("FINALLY CALLED");
		}

		System.out.println("The division of the two numbers are :" + result);
	}

	public static void main(String[] args) {
		Calculator d = new Calculator();
		d.display();
		System.out.println("Thanks for using my calculator app");
	}

}
