package test.java8.streams;

public class Person {
	
	private int age;
	private String name;
	private String gender;
	private double weight;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public Person(int age, String name, String gender, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.weight = weight;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + ", weight=" + weight + "]";
	}

	
	

}
