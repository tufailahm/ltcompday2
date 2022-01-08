package day4.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo3 {

	public static void main(String[] args) {

		String names[] = { "Anu" , "Manoj", "Neha", "Om", "Piyush", "Tufail", "Zeba" };
		
		//converts an array into list
		List<String> employeeNames = Arrays.asList(names);
		
		//binary search
		int result = Collections.binarySearch(employeeNames, "Anuradha");
		
		System.out.println(result);
		
	}
}
