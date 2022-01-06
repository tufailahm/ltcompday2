package day3.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterIDCard {
	int age;
	Scanner scanner = new Scanner(System.in);

	public void checkAge() {
		System.out.println("Please enter your age : ");
		age = scanner.nextInt();
		if (age < 0) {
			throw new NegativeAgeException("Age cannot be negative");
		} else if (age > 120) {
			throw new InvalidAgeException("Age cannot be more than 120");
		} else if (age < 18) {
			System.out.println("Sorry, you are not eligible to Vote");
		} else {
			System.out.println("Congratulaions, you can cast you vote because you age is : " + age);
		}
	}

	public static void main(String[] args) {
		VoterIDCard card = new VoterIDCard();
		try {
			card.checkAge();
		} catch (NegativeAgeException e) {
			System.out.println(e.getMessage());
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please enter numbers only");
		} catch (Exception e) {
			System.out.println("Some other error occurred");
		} finally {
			System.out.println("Trans IT Voter ID Company");
		}
		System.out.println("Thanks for your using my voter id app");
	}

}
