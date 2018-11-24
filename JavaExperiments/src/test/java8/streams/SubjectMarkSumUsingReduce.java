package test.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SubjectMarkSumUsingReduce {

	public static void main(String[] args) {
		

		List<Subject> subjectAry = Arrays.asList(new Subject("S1", -1), new Subject("S1", 10), new Subject("S1", 20),
				new Subject("S1", 30), new Subject("S1", 40));
		
		//use this to see the working of 'OptionalDouble'
//		List<Subject> subjectAry = new ArrayList<>();
		
		double sum = subjectAry.stream()
				.mapToDouble(subject -> subject.getMark())
				.filter(mark -> mark > 0)
				.sum();
		System.out.println("Normal sum: "+ sum);
		
		OptionalDouble optional = subjectAry.stream()
				.mapToDouble(subject -> subject.getMark())
				.filter(mark -> mark>0)
				.reduce((mark_x, mark_y) -> mark_x+mark_y);
		
		if(optional.isPresent()) {
			System.out.println(optional.getAsDouble());
		}else {
			System.out.println("Sum not found!!");
		}
		
		double defaultSum = subjectAry.stream()
				.mapToDouble(subject -> subject.getMark())
				.filter(mark -> mark>0)
				.reduce(0.0,((mark_x, mark_y) -> mark_x+mark_y));
		System.out.println("Sum with default value for reduce: "+defaultSum);
		
	}

}
