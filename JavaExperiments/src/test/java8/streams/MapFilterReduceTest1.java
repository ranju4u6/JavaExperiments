package test.java8.streams;

import java.util.Arrays;

public class MapFilterReduceTest1 {

	public static void main(String[] args) {
		
		Integer[] integerAry = new Integer[11];
		Arrays.setAll(integerAry, x -> x+1);
		
		//Target: square all even numbers of the array and print all of them  < 100
		Arrays.stream(integerAry)
			.peek(System.out::println)//print the numbers - accepts a consumer
			.map(x -> x*x) //modify them - accepts a Function
			.filter(x -> x <= 100) //accepts a Predicate
			.forEach(x ->{ //accepts a Consumer
				System.out.println("After Filter :"+ x);
			});
	}

}
