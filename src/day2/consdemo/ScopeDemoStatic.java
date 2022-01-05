package day2.consdemo;

public class ScopeDemoStatic {

	int num1 = 100; // instance variable
	static int num2 = 200; // static (class) variable
	public ScopeDemoStatic() {
		num1 = num2++;
		num2 = --num1;
	}
	public void change() {
		int num3 = 300; // local variable //num3=300
		int num1 = 1000; // num1=299
		num2++;
		num3--;
		num2 = num1--;
		num1 = num3++;
	}
	public void display() {
		System.out.println("Num1 :" + num1);
		System.out.println("Num2 :" + num2);
	}

	public static void accept() {
		num2 = 200;
		System.out.println("Accept called");
	}
	public static void main(String[] args) {
		ScopeDemoStatic demo1 = new ScopeDemoStatic(); // num1=199 , num2=199
		demo1.change(); // num1=199 , num2=1000
		demo1.display(); // num1=199 , num2=1000
		ScopeDemoStatic demo2 = new ScopeDemoStatic(); // num1=999 , num2=1000
		demo2.display(); // num1=999 , num2 = 999
		System.out.println(num2);
		System.out.println(demo1.num2);
		System.out.println(demo2.num2);
		System.out.println(ScopeDemoStatic.num2);
		accept();
		ScopeDemoStatic.accept();
		demo1.accept();
	}

}
