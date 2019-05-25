package test.thread.concurrency.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * counter is incremented from 1-100 by two threads equally sharing the 
 * opportunity to increment the variable
 * @author Renju
 *
 */
public class Counter {
	
	private int count;
	private ReentrantLock lock = new ReentrantLock();
	private Condition t1CompleteCondition = lock.newCondition();
	private Condition t2CompleteCondition = lock.newCondition();
	private Thread t1;
	private Thread t2;


	
	
	public int getCount(){
		//lock.lock();
		if(! lock.tryLock())return 0;
		
		try{
			System.out.println("Thread ["+Thread.currentThread().getName()+"]"+"  Count:" + count);
			return count++;
		}finally{
			if(Thread.currentThread().getName().equals(t1.getName()) && lock.isHeldByCurrentThread()){
				t1CompleteCondition.signal();
				try {
					System.out.println(Thread.currentThread().getName()+ " waiting...");
					t2CompleteCondition.await(2, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if(Thread.currentThread().getName().equals(t2.getName()) && lock.isHeldByCurrentThread()){
				t2CompleteCondition.signal();
				try {
					System.out.println(Thread.currentThread().getName()+ " waiting...");
					t1CompleteCondition.await(2, TimeUnit.SECONDS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
			
			
			if(lock.isHeldByCurrentThread())
				lock.unlock();
		}
	}
	
	

	public static void main(String[] args) {
		final Counter counter = new Counter();


	
		
		counter.t1 = new Thread(() ->{
			int localCount = 0;
			while(localCount < 10){
				
				localCount = counter.getCount();	
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
		});
		
		counter.t2 = new Thread(() ->{
			int localCount = 0;
			while(localCount < 10){
				localCount = counter.getCount();
					
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		counter.t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		counter.t2.start();

	}

}
