package oopsday3_maths;

public class MathsImp implements MathsIface {
	
	private int a;
	private int b;
	private int sum;
	private int mul;
	private int sub;
	private double div;
	
	
	
	public MathsImp() {
		// TODO Auto-generated constructor stub
	}
	
	public MathsImp(int a, int b) {
		this.a = a;
		this.b = b;

	}
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}


	@Override
	public void Addition(int a , int b) {
		sum = a + b;
		System.out.println("Sum is "+ sum);

	}
	
	@Override
	public void multiplication(int a , int b) {
		mul = a * b;
		System.out.println("Product is"+ mul);
		
	}
	
	@Override
	public void subtraction(int a , int b) {
		sub = a - b;
		System.out.println("Difference is"+ sub);
		
	}
	
	@Override
	public void division(int a , int b) {
		div = a / b;
		System.out.println("Division of " +a + "and " + b + "is " + div);
		
	}
	
	@Override
	public void factorial(int a) {
		double fact = 1;
		for(int i = 1; i<a; i++) {
			fact = fact*i;
		}System.out.println("Factorial is" + fact);
		
	}
	
	@Override
	public void primeOrNot(int a) {
		for (int i = 1; i<a; i++) {
			int count = 0;
			for (int j = 2; j<i; j++) {
				if(i%j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.println("" +i);
			}
		}
		
	}
	
	@Override
	public void reverseNumber(int a) {
		
		int rev = 0;
		while (a != 0) {
			int rem = a%10;
			rev = rev*10 + rev;
			a = a/10;
		} System.out.println(rev);
		
	}
	
	@Override
	public void fibnocci(int a) {
		
		
		
	}
	
	@Override
	public void modulus(int a , int b) {
		
	}

	@Override
	public String toString() {
		return "MathsImp [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
	
	

}
