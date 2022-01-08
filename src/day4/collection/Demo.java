package day4.collection;
/*
 * Method overloading :
 * If a class has multiple methods having same name but different in parameters, 
 * it is known as Method Overloading
 */
public class Demo {

	public void add(int num1, int num2) {
		System.out.println("Adding numbers :" + (num1 + num2));
	}

	public void add() {
		System.out.println("Not provived any parameters");
	}

	public void add(String str1,String str2) {
		System.out.println("Adding string :" + (str1 + str2));

	}

	public static void main(String[] args) {

		System.out.println(90);
		System.out.println("Ahmed");
		System.out.println(true);

		Demo d = new Demo();
		d.add(12, 22);
		d.add();
		d.add("Kajal", "Agrawal");

	}
}
