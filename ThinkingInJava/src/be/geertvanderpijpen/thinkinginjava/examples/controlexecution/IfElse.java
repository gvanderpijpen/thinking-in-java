package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Shows how the if-else statement is applied<br>
 * The example uses a test value and target value. Depending on if the test value is larger than, smaller than or equal 
 * to the target value, the result 1, -1 or 0 is returned
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class IfElse {

	static int result=0;
	
	/**
	 * Returns<br>
	 * <ul>
	 * <li>+1 when test value is greater than target value</li>
	 * <li>-1 when test value is smaller than target value</li>
	 * <li>0 when test value = target value</li>
	 * </ul> 
	 * @param testval value that is tested
	 * @param target target value against which the test value is testsed
	 */
	static protected void test(int testval, int target){
		if(testval > target)
			result = +1; 
		else if(testval < target)
			result = -1;
		else
			result = 0; // Match
	}
	
	public static void main(String[] args) {
		test(10, 5);
		print(result);
		test(5,10);
		print(result);
		test(5,5);
		print(result);
	}

}
