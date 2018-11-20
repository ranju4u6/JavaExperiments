package test.lamda.two;

public class Book {
	
	private String name;
	private int pageNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Book(String name, int pageNumber) {
		super();
		this.name = name;
		this.pageNumber = pageNumber;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", pageNumber=" + pageNumber + "]";
	}
	
	

}
