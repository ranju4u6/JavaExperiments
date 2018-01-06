package test.thread;

import java.util.Date;

public class CarOwner implements Runnable {

    CarQueueClass q;  
    CarOwner(CarQueueClass queue){  
        this.q=queue;  
        new Thread(this, "CarOwner").start();  
    }  
    @Override  
    public void run() {  
        int count =0;  
        try {             
            while(count< 5){  
                Thread.sleep(2000);  
                System.out.println(new Date() +":Car owner putting service request for car "+count);
                q.put(count++);  
            }  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    } 
}
