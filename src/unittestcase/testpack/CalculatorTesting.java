package unittestcase.testpack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import unittestcase.javapack.Calculator;

public class CalculatorTesting {

	@Test
	//@Parameters({1,2})
	public void testAdd(int a, int b){
		Calculator obj = new Calculator();
		int result = obj.add(10, 20);
		assertEquals(30,result);
		assertNotEquals(null, null);
	}
}
