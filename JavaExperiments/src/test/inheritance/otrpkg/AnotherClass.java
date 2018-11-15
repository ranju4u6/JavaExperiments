package test.inheritance.otrpkg;

import test.inheritance.BaseClass;

public class AnotherClass {

	public static void main(String[] args) {
		BaseClass baseClass = new BaseClass();
		
		//protected members are not accessible in another package
		//System.out.println(baseClass.a);
	}

}
