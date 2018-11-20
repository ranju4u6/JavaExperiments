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

	}

}
