package oopsday4.inheritence;

public class B extends A {

	public B() {
		
		//super();  -> this will print the non paramatirized constructor i.e., from A
		//System.out.println(x + y) -> not allowed because super() comes at first non-commented line.;
		super(10,20);   // this will print parametrised constructor statement
	}

	

}
