package test.thread.concurrency.synchronizers;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Boolean> {
	private final int number;

	public FactorialCalculator(int number) {
		this.number = number;
	}

	@Override
	public Boolean call() throws Exception {
		int fact = factorial(this.number);
		System.out.println("Factorial: " + fact);
		return true;
	}

	private int factorial(int count) throws InterruptedException {

		int result=1;
		
		do{
			Thread.sleep(1000);
			result = result * count;
		}while(--count > 0);
		
		return result;
	}


}
