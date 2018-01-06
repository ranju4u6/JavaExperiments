package test.thread;

public class Main {

    public static void main(String[] args) {  
        /*CarQueueClass q = new CarQueueClass();  
         new CarOwner(q);  
         new CarMechanic(q);  
         System.out.println("Press Control-C to stop.");  */
    	
    	OddEvenTest work1 = new OddEvenTest();
    	OddEvenTest work2 = new OddEvenTest();
    	Thread t1 = new Thread(work1,"Thread 1 #");
    	Thread t2 = new Thread(work2,"Thread 2 #");
    	
    	t1.start();
    	t2.start();
    	
    	
   }  

}
