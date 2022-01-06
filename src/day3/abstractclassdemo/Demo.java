package day3.abstractclassdemo;

abstract class Animal {
	int age;
	public abstract void eat() ;
	public void sleep() {
		System.out.println("All animals sleeps for 8 hours");
	}
}
class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("Cat eats milk");
	}
}
class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog eats meat");	
	}
	@Override
	public void sleep() {
		System.out.println("Dog sleeps for 6 hours");
	}
}
class Men extends Animal{
	@Override
	public void eat() {
		System.out.println("Men eats veg and non-veg");	
	}
}
public class Demo {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sleep();
		Dog d = new Dog();
		d.eat();
		d.sleep();
		
		Men m = new Men();
		m.eat();
		m.sleep();
		
	}

}
