package day5.threadsdemo;
/**  thread safe program StringBuffer,Vector,HashTable - Advantange - locked **/ 
class PrintWelcomeMessage {
	//thread safe
	synchronized static void print(String firstName,String lastName) {
		System.out.println("Welcome :"+firstName);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thanks :"+lastName);
	}
}
public class Demo3_ThreadSafety extends Thread{
	String firstName;
	String lastName;
	public Demo3_ThreadSafety() {
	}
	public Demo3_ThreadSafety(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public void run() {
		PrintWelcomeMessage.print(this.firstName,this.lastName);
	}
	public static void main(String[] args) {
		Demo3_ThreadSafety d1 = new Demo3_ThreadSafety("Tufail","Ahmed");
		Demo3_ThreadSafety d2 = new Demo3_ThreadSafety("Neha","Agrawal");
		d1.start();
		d2.start();
		System.out.println("MAIN CALLED "+Thread.currentThread().getName());
	}

}
