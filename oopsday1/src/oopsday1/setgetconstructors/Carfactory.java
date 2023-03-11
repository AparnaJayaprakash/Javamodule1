package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		//c.setColor("Blue");
		System.out.println(c.getColor());
		
		Car range = new Car("White",5000000, "Range Rover", "Premium SUV"); // range is a car type and car is class.
		
		System.out.println(range);
		System.out.println(range.hashCode());
		System.out.println(Integer.toHexString(range.hashCode()));
		System.out.println(range);
		
		//get Method
		/*
		 * int length; System.out.println(length); // this will give error
		 * System.out.println(range.getPrice()); // this will have a default value, it
		 * will not be an error it will execute with a default value of 0.0
		 */
		
		
		//set Method
		/*
		 * range.setColor("Red"); range.setPrice(5000000);
		 * range.setBrand("Range Rover"); range.setModel("SUV");
		 */
		
		
		//get Method
		/*
		 * System.out.println(range.getColor()); System.out.println(range.getPrice());
		 * System.out.println(range.getBrand()); System.out.println(range.getModel());
		 */
		
		
		//without set Method
		/*
		 * range.color = "Black"; range.price = 5000000; range.brand = "Range Rover";
		 * range.model = "SUV";
		 * 
		 * without get method
		 * System.out.println(range.color); System.out.println(range.price);
		 * System.out.println(range.brand); System.out.println(range.model);
		 */

		Car jag = new Car("Yellow",7000000, "Jaguar","Premium Sedan");

		System.out.println(jag);
		System.out.println(jag.hashCode());
		System.out.println(Integer.toHexString(jag.hashCode()));
		System.out.println(jag);
		
		
		
		//set Method
		/*
		 * jag.setColor("Black"); jag.setPrice(9000000); jag.setBrand("Jaguar");
		 * jag.setModel("Premium Sedan");
		 */
		
		
		
		//get Method
		/*
		 * System.out.println(jag.getColor()); System.out.println(jag.getPrice());
		 * System.out.println(jag.getBrand()); System.out.println(jag.getModel());
		 */

		
		
		//without set method
		/*
		 * jag.color = "Red"; jag.price = 9000000; jag.brand = "Jaguar"; jag.model =
		 * "Sedan";
		 * 
		 * 
		 *without get method
		 * System.out.println(jag.color); System.out.println(jag.price);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */

		// range = "HEllo"; type mismatch range is car type and "Hello" is String.
		//jag = range; // it will work since both are of same car type. this is assignment operator.

	}

}
