package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		
		Math math = new Math();
		int result = math.add(10,20);
		System.out.println(result);
		
		result = math.add(10, 20, 30);
		System.out.println(result);
		
		double result2 = math.add(10.25, 25.25);
		System.out.println(result2);
		
		result2 = math.add(10.25, 25.25, 35.25);
		System.out.println(result2);
		
		
		result2 = math.add(10L, 20L, 30L);   //it will call double because it is the widest one and will accomodate long
		System.out.println("Long " + result2);
		
		result2 = math.add(10.25f, 20.25f);
		System.out.println("Float " + result2);

	}

}
