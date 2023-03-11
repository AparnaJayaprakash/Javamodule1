package source;

public class Subclass extends Parent {
	public Subclass() {
		
		// System.out.println(a);   -> it cannot be accessed because it is declared as private
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
		
}
