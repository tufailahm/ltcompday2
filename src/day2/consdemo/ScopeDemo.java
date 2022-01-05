package day2.consdemo;

//10 minutes 11:19 AM
public class ScopeDemo {

	int num1=100;	//instance variable
	int num2=200;
	public ScopeDemo() {
		num1 = num2++;
		num2 = --num1;
	}
	public void change() {
		int num3=300;		//local variable		//num3=301
		int num1=1000;								//num1=300
		num2++;
		num3--;
		num2 = num1--;
		num1 = num3++;
	}
	public void display() {
		System.out.println("Num1 :"+num1);
		System.out.println("Num2 :"+num2);
	}
	public static void main(String[] args) {
		
		ScopeDemo demo1 = new ScopeDemo();		
		demo1.change();						//num1=199	, num2=1000
		demo1.display();					//num1=199	,num=1000	-OUTPUT
		
		ScopeDemo demo2 = new ScopeDemo();	//num1:199		//num2:199
		demo2.display();				//num1=199	,num2=199		-OUTPUT
	}

}
