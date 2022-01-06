package day3.arraydemo;

import java.util.Scanner;

//Use case : WAP to accept 5 numbers and print the sum
public class ArrayDemo {

	Scanner scanner =new Scanner(System.in);
	int num[] = new int[5];
	int sum=0;
	public void display() {
		for(int i=0;i<5;i++) {
			System.out.println("Enter "+(i+1)+ " number");
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		
		System.out.println("Total sum of the numbers are :"+sum);
	}
	public static void main(String[] args) {
		ArrayDemo d = new ArrayDemo();
		d.display();

	}

}
