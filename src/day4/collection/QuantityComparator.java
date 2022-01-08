package day4.collection;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Product> 
{

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getQuantityOnHand() > o2.getQuantityOnHand())
			return 1;
		else
			return -1;
	}
}
