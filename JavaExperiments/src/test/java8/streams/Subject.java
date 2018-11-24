package test.java8.streams;

public class Subject {

	public Subject(String subjectName, double mark) {
		super();
		this.subjectName = subjectName;
		this.mark = mark;
	}

	private String subjectName;
	private double mark;
	public String getSubjectName() {
		return subjectName;
	}
	public double getMark() {
		return mark;
	}

}
