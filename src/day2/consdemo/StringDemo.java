package day2.consdemo;

public class StringDemo {
	String name = "yamini";
	public void display() {
		System.out.println(name); // yamini
		name = "suresh";
		System.out.println(name); // suresh

		System.out.println(name.concat(" kumar")); // suresh kumar

		System.out.println(name); // suresh

		System.out.println(name.charAt(2));
		System.out.println(name.contains("s"));
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 4));
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.replace("u", "t"));

		// StringBuffer is mutable
		StringBuffer address = new StringBuffer("bangalore");
		address.append(" karnakata");

		System.out.println(address);
		System.out.println(address.length());

		// StringBuilder is mutable but it is not thread safe and not syncronized (Thread - to do)
		// JDK1.5
		StringBuilder address2 = new StringBuilder("bangalore");
		address2.append(" karnakata");

		System.out.println(address2);
		System.out.println(address2.length());
	}

	public static void main(String[] args) {
		StringDemo d = new StringDemo();
		d.display();

	}
}
