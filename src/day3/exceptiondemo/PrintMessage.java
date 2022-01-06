package day3.exceptiondemo;
/**
 * throws - delegate the exception
 * @author tufai
 *
 */
public class PrintMessage {

	public void display1() throws InterruptedException {
		System.out.println("Display1 started");
		Thread.sleep(3000);
		System.out.println("Display1 ended");
	}
	public void display2() throws InterruptedException {
		System.out.println("Display2 started");
		Thread.sleep(3000);
		System.out.println("Display2 ended");
	}
	public static void main(String[] args) throws InterruptedException {		//JVM
		
		System.out.println("Main started");
		
		PrintMessage message = new PrintMessage();
		message.display1();
		message.display2();
		Thread.sleep(3000);
		System.out.println("Main Ended");
	}
}
