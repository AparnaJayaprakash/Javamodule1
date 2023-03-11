package source;

public class NonSubClass {
	
	public NonSubClass() {
		
		Parent p = new Parent();
		//System.out.println(p.a);  -> it cannot be accessed because a is private
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);
	}

}
