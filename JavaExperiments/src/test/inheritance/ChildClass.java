package test.inheritance;

public class ChildClass extends BaseClass {

	//will not compile; instance method cannot override static method from base class
//	public void display() {
//		
//	}
	
	// this is not an overriding
	public static void display() {

	}
}
