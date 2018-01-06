package test.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myIntList = new ArrayList<Integer>();
		
		myIntList.add(4);
		myIntList.add(8);
		myIntList.add(7);
		myIntList.add(1);
		
		insertSomething(myIntList);
		
		System.out.println(myIntList);
	}
	
	private static void insertSomething(List yourRiskyList){
		yourRiskyList.add("I am inserting a string. what can you do!!??");
		
	}

}
