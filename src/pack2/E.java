package pack2;

import pack1.A;

public class E extends A{
	public void display() {
		A a = new A();
		//you cannot access with an object
		System.out.println(a.num); 
		System.out.println(num);
	}
}
