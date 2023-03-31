package factorymethod;

public class UseVehicleFactory {
	
	public static void main(String[] args) {
		
		Vehicle creta = VehicleFactory.newInstance("Creta");
		creta.start();
		
		Vehicle seltos = VehicleFactory.newInstance("Seltos");       //It will give seltos of Seltos type
		seltos.honk();
		
		Vehicle suzuki = VehicleFactory.newInstance("XCross");       // It will give suzuki of XCross type
		suzuki.move();
	}

}
