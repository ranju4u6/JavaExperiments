package test.thread.concurrency.synchronizers;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTaskTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		FactorialCalculator task1 = new FactorialCalculator(8);
		FactorialCalculator task2 = new FactorialCalculator(5);
		
		Future<Boolean> f1 = executor.submit(task1);
		Future<Boolean> f2 = executor.submit(task2);
		
		for(int i=0;i<15;i++){
			Thread.sleep(1000);
			System.out.println("Doing some other task");
		}
		
		if(!(f1.isDone() && f2.isDone()))
			System.out.println("Waiting........");
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		executor.shutdown();
		System.out.println("its over");
	}

}
