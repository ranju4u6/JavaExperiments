package test.lamdas;

import java.util.ArrayList;
import java.util.List;

public class LamdaFindFish {


	private static List<Animal> fishList = new ArrayList<Animal>();

	public static void main(String[] args) {
		
		/**
		 * a - parameter to the one an only one method of functional interface
		 * a.isCanSwim() is the implementation of the interface. Here instead of value we are passing the implementation itself.
		 * if the interface method has more than one params, it should be coverd in () . E.g. (a,b)-> impl
		 * if the implementation has more than one line it should be covered by {}
		 */
		
		
		findFish(new Animal("Tiger-1",true, false),  a -> a.isCanSwim());
		findFish(new Animal("Fish-1",false, true),  a -> a.isCanSwim());
		findFish(new Animal("Tiger-2",true, false),  a -> a.isCanSwim());
		findFish(new Animal("Fish-2",false, true),  a -> a.isCanSwim());
		
		System.out.println(fishList);
		
		//OR
		fishList.clear();
		findFish2(new Animal("Tiger-1",true, false),  a -> a.isCanSwim());
		findFish2(new Animal("Fish-1",false, true),  a -> a.isCanSwim());
		findFish2(new Animal("Tiger-2",true, false),  a -> a.isCanSwim());
		findFish2(new Animal("Fish-2",false, true),  a -> a.isCanSwim());
		
		System.out.println(fishList);
		
		
	}
	
	private static void findFish(Animal a, java.util.function.Predicate<Animal> commanFinder) {
		
		if(commanFinder.test(a)) {
			fishList.add(a);
		}
		
	}
	
	private static void findFish2(Animal a, CommonFinder<Animal> commanFinder) {
		
		if(commanFinder.find(a)) {
			fishList.add(a);
		}
		
	}

}
