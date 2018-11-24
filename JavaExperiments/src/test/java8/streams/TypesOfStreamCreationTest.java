package test.java8.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypesOfStreamCreationTest {

	public static void main(String[] args) {
		
		System.out.println("############# Using ARRAYS.stream() #############");
		//Using Arrays class
		int[] intAry= {10,20,30,40};
		
		//will not compile: cannot convert from IntStream to Stream<Integer>
		//Stream<Integer> ageStream = Arrays.stream(intAry);
		
		IntStream ageIntStream = Arrays.stream(intAry);
		ageIntStream.forEach(value -> System.out.println(value));
		
		//Run time exception: java.lang.IllegalStateException: stream has already been operated upon or closed
		//ageIntStream.forEach(value -> System.out.println(value));
		
		System.out.println("*********** INTEGER ************");
		
		Integer[] integerAry = {10,20,30,40};
		//Will compile as it is fed with an array on type Integer
		Stream<Integer> ageIntegerStream = Arrays.stream(integerAry);
		
		ageIntegerStream.forEach(System.out::println);
		
		System.out.println("############# Using listInstance.stream() #############");
		
		List<Integer> integerList =  Arrays.asList(10,20,30,40);
		Stream<Integer> integerAryStream = integerList.stream();
		
		integerAryStream.forEach(System.out::println);
		
		System.out.println("############# Using Files.lines #############");
		try(Stream<String> fileLineStream = Files.lines(Paths.get("src/test/java8/streams/integervalues.txt"))){
			
			fileLineStream.forEach(System.out::println);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("############# Using static Stream.of() #############");
		Stream<Integer> integerAryStreamUsingOf = Stream.of(integerAry);
		integerAryStreamUsingOf.forEach(System.out::println);
		
		
	}

}
