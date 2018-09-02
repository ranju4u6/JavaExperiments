package test.lamdas;

import java.util.ArrayList;
import java.util.List;

public class FindFish {
	
	private static List<Animal> fishList = new ArrayList<Animal>();

	public static void main(String[] args) {
		
		CommonFinder<Animal> fishFinder = new CommonFinder<Animal>() {
			
			@Override
			public boolean find(Animal type) {
				return type.isCanSwim();
			}
		};
		
		findFish(new Animal("Tiger-1",true, false),  fishFinder);
		findFish(new Animal("Fish-1",false, true),  fishFinder);
		findFish(new Animal("Tiger-2",true, false),  fishFinder);
		findFish(new Animal("Fish-2",false, true),  fishFinder);
		
		System.out.println(fishList);
		
		
	}
	
	private static void findFish(Animal a, CommonFinder<Animal> commanFinder) {
		
		if(commanFinder.find(a)) {
			fishList.add(a);
		}
		
	}

}
