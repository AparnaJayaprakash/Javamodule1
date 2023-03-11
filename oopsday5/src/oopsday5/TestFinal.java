package oopsday5;


final class A {
	
	final void m() {
		
	}
}
// class B extends A {     // -> by making class A() final the type B cannot subclass the final class A.
	
	// void m() {     -> final prevent the overriding of subclass
		
	//}
//}






public class TestFinal {
	int a = b;    // b is forward referenced -> trying to access b by a which is not defined
	static int b = 10;
	static final double pie = 3.14;    // final is compile time constant
								// it can have n copies so we make it static to make it as one copy.
	
	public TestFinal() {
		System.out.println(3.14);
	}
	
	

	public static void main(String[] args) {
		

	}

}
