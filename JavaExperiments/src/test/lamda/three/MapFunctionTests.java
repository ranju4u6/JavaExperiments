package test.lamda.three;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapFunctionTests {

	public static void main(String[] args) {
		
		Map<String, String> nameRollNoMap = new HashMap<>();
		
		for(int i=0; i<5; i++) {
			nameRollNoMap.put("Name_"+i, String.valueOf(i));
		}
		
		
		//old impl
		System.out.println("Print using old method of iteration");
		nameRollNoMap.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String key, String value) {
				System.out.println(key+ "    " + value);
			}
		});
		
		//java 8 lambda
		System.out.println("Print using new method of iteration [lambda]");
		nameRollNoMap.forEach((key, value) -> System.out.println(key+ "    " + value));
		
//		nameRollNoMap.merge("Renjith", 007, new BiFunction<String, String, R>() {
//		});

	}

}
