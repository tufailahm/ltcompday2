package day4.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo5 {

	public static void main(String[] args) {

		Map<String, Integer> employeeDetails = new TreeMap<String, Integer>();
		
		employeeDetails.put("Tufail", 98000);
		employeeDetails.put("Sangeetha", 18000);
		employeeDetails.put("Yogesh", 48000);
		employeeDetails.put("Rahul", 78000);
		employeeDetails.put("Rohith", 198000);
		
		
		System.out.println(employeeDetails);
		
		System.out.println("Printing map one by one : ");
		Set<Entry<String, Integer>> entry = employeeDetails.entrySet();
		
		 for (Map.Entry<String, Integer> it: entry)
	        {
			 	System.out.println("Key name :"+it.getKey()+ " Value :"+it.getValue());
	        }
		
		
	}
}
