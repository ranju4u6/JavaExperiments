package test.java8.streams;

import java.util.Arrays;
import java.util.List;

public class SearchSubject {

	public static void main(String[] args) {
		

		List<Subject> subjectAry = Arrays.asList(new Subject("S1", -1), new Subject("S2", 10), new Subject("S3", 20),
				new Subject("S4", 30), new Subject("S5", 40));
		
		System.out.println("Short circuit: If it encounters one that does match/un match with the predicate, it stops ");
		
		
		System.out.println("########## anyMatch() ##########");
		
		
		System.out.println("If atlast one mark is greater than 0 : "+ subjectAry.stream().peek(subject -> System.out.println(subject.getMark()))
				.anyMatch(subject -> subject.getMark() > 0));
		
		System.out.println("########## allMatch() ##########");
		
		System.out.println("If all are greater than 0 : "+ subjectAry.stream().peek(subject -> System.out.println(subject.getMark()))
		.allMatch(subject -> subject.getMark() > 0));
		
		
		System.out.println("########## noneMatch() ##########");
		
		System.out.println("If none of them are less than 0 : "+ subjectAry.stream().peek(subject -> System.out.println(subject.getMark()))
		.noneMatch(subject -> subject.getMark() < 0));
		
		System.out.println("If none of them are less than -1 : "+ subjectAry.stream().peek(subject -> System.out.println(subject.getMark()))
		.noneMatch(subject -> subject.getMark() < -1));
		
		
		System.out.println("########## findAny() ##########");
		System.out.println("Any subject whose mark is greater than 0 : "+ subjectAry.stream().peek(subject -> System.out.println(subject.getMark()))
				.filter(subject -> subject.getMark() > 0).findAny());
		
		
		System.out.println("########## findFirst() ##########");
		System.out.println("Any subject whose mark is greater than 0 : "+ subjectAry.stream().peek(subject -> System.out.println(subject.getMark()))
				.filter(subject -> subject.getMark() > 0).findFirst());
		

	}

}
