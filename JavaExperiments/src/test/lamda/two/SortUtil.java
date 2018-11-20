package test.lamda.two;

public class SortUtil {
	
	public static int sortWithName(Book b1, Book b2) {
		return b1.getName().compareTo(b2.getName());
	}

	
	public static int sortWithPageNUmber(Book b1, Book b2) {
		return b1.getPageNumber() - b2.getPageNumber();
	}
}
