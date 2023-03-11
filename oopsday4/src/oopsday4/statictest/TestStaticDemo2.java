package oopsday4.statictest;

public class TestStaticDemo2 {
	
	public static void main(String[] args) {
		
		StaticDemo2 d1 = new StaticDemo2();
		
		d1.method();
		
		StaticDemo2.method();      // to access instance method object is necessary
		
		double result = Math.PI * 5.5 * 5.5;
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
