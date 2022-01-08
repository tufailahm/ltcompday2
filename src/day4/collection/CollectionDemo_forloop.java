package day4.collection;

import java.util.Iterator;
import java.util.Vector;

public class CollectionDemo_forloop {

	public static void main(String[] args) {

		Vector<String> names = new Vector<String>();

		names.add("Mohan");
		names.add("Tarun");
		names.add("Anu");
		names.add("Ravi");
		names.add("Ahmed");
		names.add("Anu");
		names.add("Anu");

		System.out.println(names);

		names.remove("Anu");

		names.add("Zeba");

		System.out.println(names);

		System.out.println(names.isEmpty());
		System.out.println(names.size());

		System.out.println("Printing one by one  by iterator:: ");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Printing one by one using enhanced for loop:: ");

		for(String s:names) {
			System.out.println(s);
		}

	}
}
