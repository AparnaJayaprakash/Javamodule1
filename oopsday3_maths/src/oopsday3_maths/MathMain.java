package oopsday3_maths;

public class MathMain {

	public static void main(String[] args) {
		
		MathsIface MathsImp = new MathsImp();
		
		MathsImp.Addition(9, 4);
		MathsImp.multiplication(9,4);
		MathsImp.division(9, 4);
		MathsImp.subtraction(9, 4);
		MathsImp.factorial(9);
		
		
		
		

	}

}
