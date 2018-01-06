package test.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericTest2 test2 = new GenericTest2();
		
		List<Doggy> doggyList= new ArrayList<Doggy>();
		doggyList.add(new Doggy("Doggy 1"));
		doggyList.add(new Doggy("Doggy 2"));
		doggyList.add(new Doggy("Doggy 3"));
		doggyList.add(new Doggy("Doggy 4"));
		doggyList.add(new Doggy("Doggy 5"));
		
		
		List<Dogappy> dogappyList= new ArrayList<Dogappy>();
		dogappyList.add(new Dogappy("Dogappy 1"));
		dogappyList.add(new Dogappy("Dogappy 2"));
		dogappyList.add(new Dogappy("Dogappy 3"));
		dogappyList.add(new Dogappy("Dogappy 4"));
		dogappyList.add(new Dogappy("Dogappy 5"));
		
		test2.add(doggyList);
		test2.add(dogappyList);
		
		List<Cat> cattyList = new ArrayList<Cat>();
		cattyList.add(new Cat("Cattappan 1"));
		
		//test2.add(cattyList);
		
		
	}

}
