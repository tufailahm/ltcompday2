package day4.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo4 {

	public static void main(String[] args) {

		String names[] = { "Jaya", "Uday" , "Kapoor" , "Anu" , "Manoj", "Neha", "Om", "Piyush", "Tufail", "Zeba" };
		
		//converts an array into list
		List<String> employeeNames = Arrays.asList(names);
		
		//sort the list
		Collections.sort(employeeNames);
		System.out.println("After sorting :");
		System.out.println(employeeNames);
		
		//binary search
		int result = Collections.binarySearch(employeeNames, "Neha");
		
		System.out.println(result);
		
	}
}
