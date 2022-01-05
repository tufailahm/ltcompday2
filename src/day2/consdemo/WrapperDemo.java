package day2.consdemo;

//12:52 PM - 10 minutes Wrapper and Type casting
public class WrapperDemo {

	String marks ="90";
	
	public void display() {
		int finalMarks = Integer.parseInt(marks);
		finalMarks = finalMarks + 5;
		System.out.println(finalMarks);		//95
		
		Float scores1=100.0f;
		float scores2=200.0f;
		
		//type casting
		//implicit casting
		int cost=998;
		long finalCost = cost;		//no error	-- Implicit casting

		
		//explicit casting
		long price = 99;
		int finalPrice = (int)price;		//ERROR	-- explicit casting
		
		System.out.println(finalPrice+finalCost);
	}
	public static void main(String[] args) {
		WrapperDemo d = new WrapperDemo();
		d.display();
		
	}
}
