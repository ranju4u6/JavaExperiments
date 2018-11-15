package test.inheritance;

public class AnotherClass {

	public static void main(String[] args) {
		BaseClass baseClass = new BaseClass();
		
		//protected members are accessible in same package
		System.out.println(baseClass.a);
		
		//this will not compile as compile knows that the instance pointed
		//by reference variable of type 'BaseClass' can never be of type 'AnotherClass'
		//System.out.println(baseClass instanceof AnotherClass);
	}

}
