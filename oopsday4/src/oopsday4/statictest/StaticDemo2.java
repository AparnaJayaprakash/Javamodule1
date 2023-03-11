package oopsday4.statictest;

public class StaticDemo2 {
	
	static int a;
	public static void method() {
		
		
		System.out.println("from method" + a);
		// method2(); is not accessible since it is non-static.
	}
	
	public void method2() {
		
		System.out.println(a);
		method();     // it is possible since static can be used in non-static.
	}
	
	}



