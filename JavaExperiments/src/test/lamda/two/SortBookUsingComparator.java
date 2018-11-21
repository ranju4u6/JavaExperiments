package test.lamda.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBookUsingComparator {

	public static void main(String[] args) {
		
		//Using lambda to implement the compare method of Comparator
		Comparator<Book> bookNameCompare = (b1, b2)->SortUtil.sortWithName(b1, b2);
		Comparator<Book> bookPageNumberCompare = (b1,b2)->SortUtil.sortWithPageNUmber(b1, b2);
		
		//Using method reference. Java will automatically identify the method parameters
		//provided the implemented interface and the method should have equal params.
		
		//A method reference can't be used for any method. They can only be used to replace a single-method lambda expression.
		//So to use a method reference, you first need a lambda expression with one method. 
		//And to use a lambda expression, you first need a functional interface, an interface with just one abstract method.
		
//		Instead of using
//		AN ANONYMOUS CLASS
		
//		you can use
//		A LAMBDA EXPRESSION
		
//		And if this just calls one method, you can use
//		A METHOD REFERENCE
		Comparator<Book> bookNameCompareMethodRef = SortUtil::sortWithName;
		Comparator<Book> bookPageNumberCompareMethodRef = SortUtil::sortWithPageNUmber;
		
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("B3", 10));
		bookList.add(new Book("B2", 70));
		bookList.add(new Book("B1", 20));
		bookList.add(new Book("B4", 40));
		bookList.add(new Book("B5", 30));
		bookList.add(new Book("B6", 60));
		bookList.add(new Book("B7", 50));
		
		Collections.sort(bookList, bookNameCompare);
		System.out.println("Lambda Name Comparison \n"+bookList);
		
		Collections.sort(bookList, bookPageNumberCompare);
		System.out.println("Lambda Page No: Comparison \n"+bookList);
		
		
		Collections.sort(bookList, bookNameCompareMethodRef);
		System.out.println("MethodRef Name Comparison \n"+bookList);
		
		Collections.sort(bookList, bookPageNumberCompareMethodRef);
		System.out.println("MethodRef Page No: Comparison \n"+bookList);
		
		//different way of printing books --uses consumer [c-Consumer]
		//Actual impl
		//bookList.forEach(new Consumer(){ public void consume(Book b){System.out.println(b);}});
		System.out.println("Lambda Printing");
		bookList.forEach(c -> System.out.println(c));
		
		//much easier way. method ref --uses consumer.
		//Actual impl
		//bookList.forEach(new Consumer(){ public void consume(Book b){System.out.println(b);}});
		System.out.println("Lambda + method ref");
		bookList.forEach(System.out::println);
		
		
		//using Predicate to remove data from Collection
		//Actual impl
		//bookList.forEach(new Predicate(){ public boolean test(Book b){return b.getName().endsWith("6");}});
		//We cannot use method ref here
		System.out.println("Using removeIf(Predicate)");
		bookList.removeIf(b-> b.getName().endsWith("6"));
		bookList.forEach(System.out::println);
		
	}

}
