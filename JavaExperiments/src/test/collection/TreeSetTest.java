package test.collection;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args){
		TreeSet<Integer> intergerSet = new TreeSet<Integer>();
		
		intergerSet.add(30);
		intergerSet.add(100);
		intergerSet.add(20);
		intergerSet.add(10);
		intergerSet.add(40);
		intergerSet.add(80);
		intergerSet.add(110);
		
		System.out.println(intergerSet);
		
	}

}
