package test.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericTest2 {

	List<Dog> dogList = new ArrayList<Dog>();
	
	public void add(List<? extends Dog> dogTypeList){
		dogList.addAll(dogTypeList);
		
		System.out.println("Added:  "+dogList);
	}
	
	
	
}
