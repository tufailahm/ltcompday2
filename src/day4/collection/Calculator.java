package day4.collection;

//Generics
public class Calculator<T> {

	public T add(T t1) {
		return t1;
	}
	
	public <T extends Number> int addNumbers(T t1,T t2) {
		return t1.intValue() + t2.intValue();
	}
	public static void main(String[] args) {
		
		Calculator<String> calc1 = new Calculator<String>();
		System.out.println(calc1.add("Mohan"));
		
		Calculator<Integer> calc2 = new Calculator<Integer>();
		System.out.println(calc2.add(22));
		
		System.out.println(calc1.addNumbers(23, 23));
		System.out.println(calc1.addNumbers(23.5f, 23.9f));
	}
}
