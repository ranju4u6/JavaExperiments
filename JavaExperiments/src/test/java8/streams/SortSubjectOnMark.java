package test.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortSubjectOnMark {

	public static void main(String[] args) {
		
		List<Subject> subjectAry = Arrays.asList(new Subject("E", -1), new Subject("B", 40), new Subject("A", 20),
				new Subject("C", 30), new Subject("D", 10));
		
		Comparator<Subject> markComparator = Comparator.comparing(Subject::getMark);
		//Comparator<Subject> subNameComparator =  Comparator.comparing(Subject::getSubjectName);
		
		System.out.println("########## sorted() : Natural order ##########");
		
		subjectAry.stream()
		.filter(subject -> subject.getMark() > 0)
		.sorted(markComparator).forEach(System.out::println);
		
		
		System.out.println("########## sorted() : reversed() ##########");
		
		
		subjectAry.stream()
		.filter(subject -> subject.getMark() > 0)
		.sorted(markComparator.reversed()).forEach(System.out::println);
		
		
		//**** NOT working as expected.... re visit
//		System.out.println("########## sorted() : reversed(): sorted() by name ##########");
//		
//		
//		subjectAry.stream()
//		.filter(subject -> subject.getMark() > 0)
//		.sorted(markComparator.thenComparing(subNameComparator)).forEach(System.out::println);

	}

}
