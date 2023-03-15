package firsttest;

public class Calculator {
	
	public int power(int b, int e) {
		int p = 1;
		int i = 1;
		if( b ==0 || e == 0) {
			return 0;
		}
		else {
		int res = (int) Math.pow(b, e);
		return res;
		}
		/*while (i <= e) {
			p *= b;
		}
		
	    }return p;*/
	
	}
	
	public int factorial(int n) {
		int i;
		int fact = 1;
		if(n == 0 || n == 1) {
			return fact;
		}
		else {
		for(i=1; i<=n;i++) {
			fact = fact * i;
		}
		return fact;
		}
	}
	
	public int add(int a,int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
}
