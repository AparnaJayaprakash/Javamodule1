package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator calc;
	
	@Before
	public void setup() throws Exception {
		
		calc = new Calculator();
			
	}
	

	@Test                                // it indicates that this method is to be used as test case
	public void testPowerZero() {

		int inputBase = 0;
		int exp = 0;
		int expectedValue = 0;
		int actualValue = calc.power(inputBase, exp);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testPower() {

		int inputBase = 2;
		int exp = 3;
		int expectedValue = 8;
		int actualValue = calc.power(inputBase, exp);

		assertEquals(expectedValue, actualValue);

		// fail("Not yet implemented");
	}
	
	/*
	 * @Test public void testFactorialZero() {
	 * 
	 * int inputNumber = 0; int expectedValue = 1; int actualValue =
	 * calc.factorial(inputNumber);
	 * 
	 * assertEquals(expectedValue, actualValue); }
	 */
	/*
	 * @Test public void testFactorial() {
	 * 
	 * int inputNumber = 5; int expectedValue = 120; int actualValue =
	 * calc.factorial(inputNumber);
	 * 
	 * assertEquals(expectedValue, actualValue);
	 * 
	 * }
	 * 
	 * 
	 * @Test public void testAdd() {
	 * 
	 * int inputA = 2; int inputB = 2; int expectedValue = 4; int actualValue =
	 * calc.add(inputA,inputB);
	 * 
	 * assertEquals(expectedValue, actualValue);
	 * 
	 * }
	 */

}
