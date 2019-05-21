package test.thread.singleton;

public class ConsoleService {
	
	private static ConsoleService CONSOLESERVICEINSTANCE;
	
	private ConsoleService(){
		
	}
	
	public static ConsoleService getInstance(){
		if(CONSOLESERVICEINSTANCE == null){
			CONSOLESERVICEINSTANCE = new ConsoleService();
		}
		
		return CONSOLESERVICEINSTANCE;
	}
	
	public void printData(String printData){
		System.out.println("Thread: "+ Thread.currentThread().getName() + "   Data: "+ printData);
	} 

}
