package day3.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

//Use case : WAP to accept 5 numbers and print the sum
public class ArrayDemo {

	Scanner scanner =new Scanner(System.in);
	int num[] = new int[5];
	int sum=0;
	public void display() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Enter "+(i+1)+ " number");
				num[i] = scanner.nextInt();
				sum += num[i];
			}
		} catch (InputMismatchException e) {
				System.out.println("You cannot enter characters");
		}
		
		System.out.println("Total sum of the numbers are :"+sum);
	}
	public static void main(String[] args) {
		ArrayDemo d = new ArrayDemo();
		d.display();
		
		System.out.println("Thanks for using app");
		//
		//

	}

}
