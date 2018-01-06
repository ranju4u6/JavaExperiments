package test.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class MapTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> nameMap = new HashMap<String, String>();
		Hashtable<String, String> nameTable = new Hashtable<String, String>();
		
		nameMap.put("1", "Renjith");
		nameMap.put("2", null);
		nameMap.put("3", null);
		nameMap.put(null, "Saranya");
		
		System.out.println(nameMap);
		
		
		nameTable.put("1", "Renjith");
		nameTable.put("2", null);
		nameTable.put("3", null);
		nameTable.put(null, "Saranya");
		
		System.out.println(nameTable);
		
	}

}
