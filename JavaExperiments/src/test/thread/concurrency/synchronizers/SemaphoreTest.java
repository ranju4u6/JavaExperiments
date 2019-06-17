package test.thread.concurrency.synchronizers;

public class SemaphoreTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ATMCounter(), "Person 1");
		Thread t2 = new Thread(new ATMCounter(), "Person 2");
		Thread t3 = new Thread(new ATMCounter(), "Person 3");
		Thread t4 = new Thread(new ATMCounter(), "Person 4");
		Thread t5 = new Thread(new ATMCounter(), "Person 5");
		Thread t6 = new Thread(new ATMCounter(), "Person 6");
		Thread t7 = new Thread(new ATMCounter(), "Person 7");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

	}

}
