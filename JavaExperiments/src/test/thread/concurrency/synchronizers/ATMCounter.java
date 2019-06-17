package test.thread.concurrency.synchronizers;

import java.util.concurrent.Semaphore;

public class ATMCounter implements Runnable{
	
	static Semaphore permitHolder = new Semaphore(1);

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " Accessing ATM");
		
		System.out.println("Availalbe Counters : "+ permitHolder.availablePermits());
		
		try {
			permitHolder.acquire();
		} catch (InterruptedException e1) {
			System.out.println(Thread.currentThread().getName() +" interrupted." + e1);
		}
		
		System.out.println(Thread.currentThread().getName() + " Withdrawing Cash");

		System.out.println(Thread.currentThread().getName() + " Waiting for Cash");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(Thread.currentThread().getName() + " Got the Cash");
		
		permitHolder.release();
		
		System.out.println("Availalbe Counters after release: "+ permitHolder.availablePermits());



	}

}
