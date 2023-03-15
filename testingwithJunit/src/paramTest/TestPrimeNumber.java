package paramTest;

import static org.junit.Assert.*;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)                      //this will run the test cases

public class TestPrimeNumber {
	
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber primeNumber;    //obj ref
	
	
	@Before                                               //used to create the object fresh before going to next test
	public void initialize() {
		
		primeNumber = new PrimeNumber();
		
	}
	
	public TestPrimeNumber(Integer inputNumber, Boolean expectedResult) {           //constructor
		
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters                                         //read the parameters from primeNumber method
	public static Collection primeNumbers() {
		
		return Arrays.asList(new Object[][] {
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false},
			{10,false}}
		);
		}
	
	
	@Test
	public void testValidator() {
		
		System.out.println("Parameterized number is "+ inputNumber);
		assertEquals(expectedResult,primeNumber.validate(inputNumber));
		
		
		
		//fail("Not yet implemented");
	}

}
