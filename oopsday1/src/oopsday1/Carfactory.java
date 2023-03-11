package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car range = new Car();  // range is a car type and car is class.
		range.color = "Black";
		range.price = 5000000;
		range.brand = "Range Rover";
		range.model = "SUV";
		
		System.out.println(range.color);
		System.out.println(range.price);
		System.out.println(range.brand);
		System.out.println(range.model);
		
		
		Car jaguar = new Car();
		jaguar.color = "Red";
		jaguar.price = 9000000;
		jaguar.brand = "Jaguar";
		jaguar.model = "Sedan";
		
		
		System.out.println(jaguar.color);
		System.out.println(jaguar.price);
		System.out.println(jaguar.brand);
		System.out.println(jaguar.model);
		
		
		// range = "HEllo";   type mismatch - range is car type and "Hello" is String.
		jaguar = range;    // it will work since both are of same car type. this is assignment operator.
		
		
		
		

	}

}
