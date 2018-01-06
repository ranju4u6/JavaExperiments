package test.thread;

public class OddEvenTest implements Runnable{
	
	private static int counter;

	@Override
	public synchronized void run() {
		for(int i=0; i<10; i++){
			
				
				System.out.println(Thread.currentThread().getName()+": "+counter++);
			
			
		}
		
	}

}
