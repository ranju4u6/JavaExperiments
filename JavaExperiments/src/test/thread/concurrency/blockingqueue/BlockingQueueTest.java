package test.thread.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Mainly used for Producer-Consumer problems
 * @author Renju
 *
 */
public class BlockingQueueTest {
	
	//private final BlockingQueue<Integer> integerQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<Integer> integerQueue = new ArrayBlockingQueue<>(10);
	
	public static void main(String[] args) {
		final BlockingQueueTest blockingQueueTest = new BlockingQueueTest();
		
		Thread producer = new Thread(()->{

	        // Put 20 ints into Queue
	        for (int i = 0; i < 20; i++) {
	            System.out.println("[Producer]--------------------- Put : " + i);
	            try {
					blockingQueueTest.integerQueue.put(i);
					System.out.println("[Producer]--------------------- Produced: "+i);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
	            System.out.println("[Producer]--------------------- Queue remainingCapacity : " + blockingQueueTest.integerQueue.remainingCapacity());
	            try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	        }
		});
		
		
		Thread consumer = new Thread(()->{
			try {
	            while (true) {
	            	System.out.println("[Consumer]--------------------- Queue : " + blockingQueueTest.integerQueue);
	                Integer take = blockingQueueTest.integerQueue.take();
	                System.out.println("[Consumer]--------------------- Consumed: "+take);	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
		});
		
		
		producer.start();
		consumer.start();
		
	}
	
	


}
