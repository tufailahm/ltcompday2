package demo;

public class DemoLoop {

	int i;
	String day="aa";
	public void display() {

		for (i = 1; i <= 10; i++) {
			if(i%2!=0)
					System.out.println(i);
		}
		
		switch(day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday": System.out.println("Working day");break;
		case "saturday":
		case "sunday": System.out.println("Weekend");break;
		default: System.out.println("Invalid day");break;
		}
	}

	public static void main(String[] args) {
		DemoLoop dataType = new DemoLoop();
		dataType.display();
	}
}
