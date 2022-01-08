package day5.threadsdemo;

public class Demo extends Thread{

	Thread t1 ;
	public Demo() {
		t1 = new Thread(this);
		t1.start();
		t1.setName("FIRSTTHREAD");
	}
	@Override
	public void run() {
		System.out.println("RUN CALLED - Welcome in Thread "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println("MAIN CALLED "+Thread.currentThread().getName());
	}

}
