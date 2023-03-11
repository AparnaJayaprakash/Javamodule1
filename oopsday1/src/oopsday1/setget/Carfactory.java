package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car range = new Car(); // range is a car type and car is class.

		range.setColor("Red");
		range.setPrice(5000000);
		range.setBrand("Range Rover");
		range.setModel("SUV");

		System.out.println(range.getColor());
		System.out.println(range.getPrice());
		System.out.println(range.getBrand());
		System.out.println(range.getModel());

		/*
		 * range.color = "Black"; range.price = 5000000; range.brand = "Range Rover";
		 * range.model = "SUV";
		 * 
		 * System.out.println(range.color); System.out.println(range.price);
		 * System.out.println(range.brand); System.out.println(range.model);
		 */

		Car jag = new Car();

		jag.setColor("Black");
		jag.setPrice(9000000);
		jag.setBrand("Jaguar");
		jag.setModel("Premium Sedan");

		System.out.println(jag.getColor());
		System.out.println(jag.getPrice());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());

		
		/*
		 * jag.color = "Red"; jag.price = 9000000; jag.brand = "Jaguar"; jag.model =
		 * "Sedan";
		 * 
		 * 
		 * System.out.println(jag.color); System.out.println(jag.price);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */

		// range = "HEllo"; type mismatch range is car type and "Hello" is String.
		jag = range; // it will work since both are of same car type. this is assignment operator.

	}

}
