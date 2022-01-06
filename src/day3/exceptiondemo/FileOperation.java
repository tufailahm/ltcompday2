package day3.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileOperation {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		File file = new File("d:\\a.txt");
		try {
			FileInputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
}
