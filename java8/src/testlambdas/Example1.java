package testlambdas;                                  // lambdas is a place holders    syntax: () -> {
                                                          //                                      };
@FunctionalInterface
interface Shape {
	double area();
//	double perimeter;                             it is not allowed
}
interface math {
	double power(int b, int e);
	
}
interface factorial {
	double fact(int a);
	
}
public class Example1 {
	
	public static void main(String[] args) {
		
		int a1 = 10;
		
		Runnable r1 = new Runnable() {                                            //Anonymous class
			public void run() {
				System.out.println("from run method");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r = () -> {
			for(int i = 1; i<5;i++) {
				System.out.println("in run method" + i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	//math power	
		math m = (int b , int e) -> {
			int p = 1;
			for(int i = 1; i<=e; i++) {
				
				p *= b;
			}
			return p;
		};
		double p = m.power(2, 3);
		System.out.println(p);
		
	//Shape area	
		Shape s = () -> {                           // -> is a arrow object
			return 0.0;                             // in this shape is treated as reference 
		};
		
		double result = s.area();
		System.out.println(result);
		
	//factorial of number	
		factorial f = (int a) -> {
			
			int fact = 1;
			for (int i = 1; i<=a; i ++) {
				fact = fact * i;
			}
			return fact;
		};
		double fact = f.fact(5);
		System.out.println(fact);
		
		
	}

}
