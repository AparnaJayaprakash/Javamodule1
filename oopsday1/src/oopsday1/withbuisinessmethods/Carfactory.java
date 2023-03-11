package oopsday1.withbuisinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car range = new Car("White", 5000000, "Range Rover", "Premium SUV"); 
		
		range.start();
		range.changeGear(1);
		range.stop();
		
	

		Car jag = new Car("Yellow", 7000000, "Jaguar","Premium Sedan");
		
		
		jag.start();
		jag.changeGear(1);
		jag.stop();
		
		
	
	}

}
