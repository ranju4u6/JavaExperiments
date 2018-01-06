package test.thread;

import java.util.Date;

public class CarQueueClass {
    int n;  
    boolean mechanic_available = false;  
    synchronized int get() {  
       if(!mechanic_available)  
       try {  
    	   System.out.println(new Date() +": Car not available... mechanic waiting for 5 secs");
          wait(5000);  
       } catch(InterruptedException e) {  
          System.out.println("InterruptedException caught");  
       }  
       System.out.println(new Date() +":Mechanic servicing car : " + n);  
       try{
    	   System.out.println(new Date() +":Mechanic went for a tea break while servicing car : " + n); 
    	   wait(5000);
       }catch(InterruptedException e) {  
           System.out.println("InterruptedException caught");  
        } 
       mechanic_available = false;  
       notify();
       System.out.println(new Date() +": Car owner is notified... after servicing car: "+n);
       return n;  
    }  
    synchronized void put(int n) {  
       if(mechanic_available)  
       try { 
    	  System.out.println(new Date() +":Car service is going on.... waiting 5 secs before putting new request");
          wait(5000);  
       } catch(InterruptedException e) {  
          System.out.println("InterruptedException caught");  
       }  
       this.n = n;  
       mechanic_available = true;  
       System.out.println(new Date() +":Owner placed request for car: " + n);  
       notify(); 
       System.out.println(new Date() +"Mechanic is notified...after placing service request for car: "+n); 
    }  
}
