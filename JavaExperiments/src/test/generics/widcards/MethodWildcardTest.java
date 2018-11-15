package test.generics.widcards;

import java.util.ArrayList;
import java.util.List;

public class MethodWildcardTest {

	public static void main(String[] args) {
		
		/**
		 * It is not necessary that the right side of an instantiation expression that contains generics
		 * should follow the LHS. This is for simplifaication of code.
		 * eg. 
		 * 	List<String> stringList = new ArrayList<>();
		 *  Map<String, Map<String,String>> doubleMap = new HashMap<>();
		 */
		
		List<String> stringList = new ArrayList<>();
		stringList.add("A");
		stringList.add("B");
		stringList.add("C");
		stringList.add("D");
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		displayListContent(stringList);
		displayListContent(integerList);
		
		
		displayListContent2(stringList);
		displayListContent2(integerList);
		
		displayListContent3(stringList);
		//displayListContent3(integerList);//does not work as Integer does not inherits String
		

	}
	
	/**
	 * This method accepts anything.
	 * @param dataList
	 */
	public static void displayListContent(List<?> dataList) {
		
		dataList.forEach(item -> System.out.println(item.toString()));
		System.out.println("-------------------X------------------");
		
	}
	
	/**
	 * This method accepts anything that "extends Object".
	 * @param dataList
	 */
	public static void displayListContent2(List<? extends Object> dataList) {
		
		dataList.forEach(item -> System.out.println(item.toString()));
		System.out.println("-------------------X------------------");
		
	}
	
	/**
	 * This method accepts "String" OR anything that has "String as super class".
	 * @param dataList
	 */
	public static void displayListContent3(List<? super String> dataList) {
		
		dataList.forEach(item -> System.out.println(item.toString()));
		System.out.println("-------------------X------------------");
		
	}

}
