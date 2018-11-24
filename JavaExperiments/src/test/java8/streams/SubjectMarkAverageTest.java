package test.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SubjectMarkAverageTest {

	public static void main(String[] args) {
		List<Subject> subjectAry = Arrays.asList(new Subject("S1", -1), new Subject("S1", 10), new Subject("S1", 20),
				new Subject("S1", 30), new Subject("S1", 40));
		
		//use this to see the working of 'OptionalDouble'
//		List<Subject> subjectAry = new ArrayList<>();
		

		//following line will not work as map() returns a Stream of Objects and average is a function of Int/Double/Long Stream
		//double average = subjectAry.stream().map(subject -> subject.getMark())
		
		//this will also not compile as 1) mapToDouble retuens a 'DoubleStream' & 2) average retunns an 'OptionalDouble'
		//double average = subjectAry.stream().mapToDouble(subject -> subject.getMark()).filter(mark -> mark > 0).average();
		
		OptionalDouble optional = subjectAry.stream()
				.mapToDouble(subject -> subject.getMark())
				.filter(mark -> mark > 0)
				.average();
		
		if(optional.isPresent()) {
			System.out.println("Average is: " +optional.getAsDouble());
		}else {
			System.out.println("Invalid source !!");
		}
		
		//NOTE: Similarly we can use max(), min() & sum(). Exception is sum(), which returns a 'primitive' while others return 'Optional'.
	}

}
