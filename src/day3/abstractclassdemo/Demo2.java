package day3.abstractclassdemo;
interface Radio {
	int frequency=100;
	void scanChannel();
	void startRadio();
	void stopRadio();
}
//jdk1.8 interfaces can have static and default methods
interface AirConditioner {
	void switchOn();
	default void blowAir() {
		System.out.println("AC blow air");
	}
	static void autoClean() {
		System.out.println("This AC would be auto clean");
	}
}
abstract class Vehicle {
	int cost;
	public abstract void start();
	public abstract void stop() ;
	public void musicPlayer() {	
		System.out.println("Music player has started music");
	}
}
class Car extends Vehicle implements Radio,AirConditioner{
	@Override
	public void start() {
		System.out.println("Car started");
	}
	@Override
	public void stop() {
		System.out.println("Car stop");	
	}
	//should override start and stop
	@Override
	public void scanChannel() {
		System.out.println("Radio scanning channels");
		
	}
	@Override
	public void startRadio() {
		System.out.println("Radio started");
		
	}
	@Override
	public void stopRadio() {
		System.out.println("Radio stopped");
		
	}
	@Override
	public void switchOn() {
		System.out.println("Switching On the AC");
		
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}
}
