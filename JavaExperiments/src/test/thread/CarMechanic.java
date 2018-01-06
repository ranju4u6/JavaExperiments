package test.thread;

import java.util.Date;

public class CarMechanic implements Runnable {

    CarQueueClass q;  
    CarMechanic(CarQueueClass queue){  
        this.q=queue;  
        new Thread(this, "CarMechanic").start();  
    }  
    @Override  
    public void run() {  
        for(int i=0;i< 5;i++) {    
        	System.out.println(new Date() +":Mechanic getting the request for car "+i);
        q.get();  
        }
    }  

}
