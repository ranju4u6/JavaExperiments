package test.thread.concurrency.synchronizers;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(3);

		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			latch.countDown();

			System.out.println(Thread.currentThread().getName() + ".... Ends");
		}, "Service One");

		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();

			System.out.println(Thread.currentThread().getName() + ".... Ends");

		}, "Service Two");

		Thread t3 = new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();

			System.out.println(Thread.currentThread().getName() + ".... Ends");

		}, "Service Three");

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Waiting for others to finish.... ");

		//latch.await(10, TimeUnit.SECONDS);
		latch.await();

		System.out.println("All threads are over.... Let the main thread end..");
	}

}
