package anotherPackage;

import source.Parent;

public class NonSubClass {
	
	public NonSubClass() {
		
		Parent p = new Parent();
		// System.out.println(p.a);   -> cannot be accessed
		// System.out.println(p.b);   -> cannot be accessed 
	     // System.out.println(p.c);
		System.out.println(p.d);
	}

}
