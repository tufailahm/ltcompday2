package day5.threadsdemo;

public class Demo2 extends Thread{

	Thread t1,t2 ;
	public Demo2() {
		t1 = new Thread(this);
		t1.setPriority(MIN_PRIORITY);
		t1.start();
		t1.setName("FIRSTTHREAD");
		t2 = new Thread(this);
		t2.setPriority(MAX_PRIORITY);
		t2.start();
		t2.setName("SECONDTHREAD");
	}
	@Override
	public void run() {
		System.out.println("RUN CALLED - Welcome in Thread "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		System.out.println("MAIN CALLED "+Thread.currentThread().getName());
	}

}
