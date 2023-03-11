package oopsday2;

public class ClassFactory2 {
	
	public static void main(String[] args) {
		
	//	CarIface car = new CarIface();     we cannot create object of interface
		
	//	CarIface car;  //  not referring to any objects
		
		CarIface car = new Car(5000,500,0,false);
		
		System.out.println(car);
		
		car.start();
		car.honk();
		car.move();
		car.stop();
		
		System.out.println(car);
		
	}

}
