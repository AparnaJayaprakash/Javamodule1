package anotherPackage;

import source.Parent;

public class SubClass extends Parent {
	
	public SubClass() {
		
		//System.out.println(a);  // cannot be accessed beacause a is private
		//System.out.println(b);   -> b is default so cannot be accssed since it is in different package i.e. defalut variable cannot be accessed in different package
		System.out.println(c);
		System.out.println(d);
	}

}
