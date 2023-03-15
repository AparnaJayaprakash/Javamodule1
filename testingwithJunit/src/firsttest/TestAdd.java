package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAdd {
	
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("Before test executed....");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testAdd() {
		int inputA = 2;
		int inputB = 2;
		int expectedValue = 4;
		int actualValue = calc.add(inputA,inputB);
		
		assertEquals(expectedValue, actualValue);
		//fail("Not yet implemented");
	}

}
