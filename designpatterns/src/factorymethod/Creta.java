package factorymethod;

public class Creta implements Vehicle {

	@Override
	public void start() {
		System.out.println("Started......" + getClass());

	}

	@Override
	public void stop() {
		System.out.println("Stopped...." + getClass());

	}

	@Override
	public void honk() {
		System.out.println("Pomm Pomm......" + getClass());

	}

	@Override
	public void move() {
		System.out.println("It's moving....." + getClass());

	}

}
