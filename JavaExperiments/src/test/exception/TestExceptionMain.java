package test.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TestExceptionMain {

	public static void main(String[] args) {
		
		boolean b = new TestExceptionMain().isFileAvailable();
		System.out.println(b);

	}
	
	
	private boolean isFileAvailable(){
		try{
			FileInputStream fis = new FileInputStream("nofile.txt");
			return true;
		}catch(Exception e){
			System.out.println("No File .....");
			return false;
		}	
		finally{
			System.out.println("Finally..................");
		}
	}

} 
