package day4.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo_ProductApp {

	public static void main(String[] args) {

		float f1=1/3;
	//	float f2=1.01;
		int i=1/3;	
		double d=999d;
		
		List<Product> products = new ArrayList<Product>();

		Product p1 = new Product(1, "Lakme", 20, 23);
		Product p2 = new Product(2, "Aroma", 10, 785);
		Product p3 = new Product(3, "Mouse", 2, 766);
		Product p4 = new Product(4, "Pendrive", 9272, 99);
		Product p5 = new Product(5, "Aloe", 32, 1222);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(new Product(6, "Mobile", 24, 42000));

		System.out.println("Printing one by one :: ");
		Iterator<Product> iterator = products.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sort the product by price
		Collections.sort(products);

		System.out.println("After Sorting by price -- Printing one by one :: ");
		Iterator<Product> iterator1 = products.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		// Sort the product by quantity
		Collections.sort(products, new QuantityComparator());

		System.out.println("After Sorting by quantity -- Printing one by one :: ");
		Iterator<Product> iterator2 = products.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		// Sort the product by product name
		Comparator<Product> comparator = (Product g1,Product g2) -> g1.getProductName().compareTo(g2.getProductName());
		Collections.sort(products, comparator);

		System.out.println("After Sorting by product name -- Printing one by one :: ");
		Iterator<Product> iterator3 = products.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
	}
}
