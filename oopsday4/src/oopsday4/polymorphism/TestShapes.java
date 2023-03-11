package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		
		
	//	B b = new A();    -> narrowing
		
		double d = 10;
	//	int i = d;        -> narrowing
		
		Shape s = new Rectangle (10.25,65.75);    // s is specific to rectangle
		double result = s.area();
		System.out.println(result);
		
		s = new Circle(35.87);
		result = s.area();
		System.out.println(result);
		
		s = new Square(55);
		result = s.area();
		System.out.println(result);
		
		
		Object obj = new String("Hello");
		obj = new Integer("10");
		
		

	}

}
