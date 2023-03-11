package testlambdas;

@FunctionalInterface
public interface TestInterface {
	
	public double method();
	
	public default void method2() {                              // in java 8, we can have default and static methods in inteface
		
		System.out.println("from method2");
	}
	public static void method3() {
		System.out.println("from static method3");
	}

}
