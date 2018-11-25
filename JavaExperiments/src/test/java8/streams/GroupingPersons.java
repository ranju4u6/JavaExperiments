package test.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingPersons {

	public static void main(String[] args) {
	
		List<Person> persons = Arrays.asList(new Person(20, "Name-1", "Male", 70)
				,new Person(20, "Name-2", "Female", 72.9)
				,new Person(30, "Name-3", "Male",50)
				,new Person(30, "Name-4", "Female",55)
				,new Person(40, "Name-5", "Male",60.5)
				,new Person(40, "Name-6", "Female",66.7)
				,new Person(50, "Name-7", "Male", 80.5)
				,new Person(50, "Name-8", "Female",78.4));
		
		Map<Integer, List<Person>> ageMap = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println("########## Simple GROUP BY Age##########");
		System.out.println(ageMap);
		
		Map<Integer, Long> ageCountMap = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println("########## Simple GROUP BY Age and count ##########");
		System.out.println(ageCountMap);
		
		System.out.println("########## GROUP BY Age - Display name only##########");
		Map<Integer, List<String>> ageMapWithName = persons.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(ageMapWithName);

		
		System.out.println("########## Simple Partition BY Gender##########");
		Map<Boolean, List<Person>> isMaleMap = persons.stream().collect(Collectors.partitioningBy(p -> p.getGender().equals("Male")  ));
		System.out.println(isMaleMap);
		
		
		System.out.println("########## Total weight by summingDouble Collector##########");
		Map<Integer, Double> ageWiseTotralWeightMap = persons.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.summingDouble(Person::getWeight)));
		System.out.println(ageWiseTotralWeightMap);
		
		
		System.out.println("########## Total weight by averagingInt Collector##########");
		Map<String, Double> genderWiseAgeAvgMap = persons.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.averagingDouble(Person::getAge)));
		System.out.println(genderWiseAgeAvgMap);
		
		
	}

}
