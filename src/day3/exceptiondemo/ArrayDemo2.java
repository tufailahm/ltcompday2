package day3.exceptiondemo;

import java.util.Scanner;

//Use case : WAP to accept 5 names and print the all the names
public class ArrayDemo2 {

	Scanner scanner =new Scanner(System.in);
	String name[] = new String[5];
	public void display() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Enter "+(i+1)+ " name");
				name[i] = scanner.next();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Names entered by you ");
		for(String s:name) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ArrayDemo2 d = new ArrayDemo2();
		d.display();

	}

}
