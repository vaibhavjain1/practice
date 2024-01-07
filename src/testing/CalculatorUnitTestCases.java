package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorUnitTestCases {
	static Calculator1 obj;
	 @Test
	    public void testConcatenate() {
 int result = obj.add(1,2);

	        assertEquals(3, result);

	    }
	 
	 @BeforeClass
	 public static void testMul(){
		 obj = new Calculator1();
	        
	 }
}
