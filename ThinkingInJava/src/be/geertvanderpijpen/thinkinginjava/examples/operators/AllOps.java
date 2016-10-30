package be.geertvanderpijpen.thinkinginjava.examples.operators;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates operators on the different data types in Java<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class AllOps {

	static void f(boolean b){}
	static protected void boolTest(boolean x, boolean y){
		// Arithmentic operators: 
		//! x = x * y;
		//! x = x / y;
		//! x = x % y;
		//! x = x + y; 
		//! x = x - y; 
		//! x++;
		//! x--;
		//! x = +y;
		//! x = -y;
		// Relational and Logical:
		//! f(x > y);
		//! f(x >= y);
		//! f(x < y);
		//! f(x <= y);
		f(x == y);
		f(x != y);
		f(!y);
		x = x && y;
		x = x || y;
		// Bitwise operators: 
		//! x = ~y;
		x = x & y; 
		x = x | y;
		x = x ^ y;
		//! x = x << 1; 
		//! x = x >> 1; 
		//! x = x >>> 1;
		// Compound assignment: 
		//! x += y;
		//! x -= y;
		//! x *= y;
		//! x /= y;
		//! x %= y; 
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		x &= y; 
		x ^= y; 
		x |= y; 
		// Casting: 
		//! char c = (char) x; 
		//! byte b = (byte) x; 
		//! short s = (short) x; 
		//! int i = (int) x; 
		//! long l = (long) x; 
		//! float f = (float) x;
		//! double d = (double) x;
	}
	
	static protected void charTest(char x, char y){
		// Arithmentic operators: 
		x = (char)(x * y);
		x = (char)(x / y);
		x = (char)(x % y);
		x = (char)(x + y); 
		x = (char)(x - y); 
		x++;
		x--;
		x = (char)+y;
		x = (char)-y;
		// Relational and Logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! x = x && y;
		//! x = x || y;
		// Bitwise operators: 
		x = (char)(~y);
		x = (char)(x & y); 
		x = (char)(x | y);
		x = (char)(x ^ y);
		x = (char)(x << 1); 
		x = (char)(x >> 1); 
		x = (char)(x >>> 1);
		// Compound assignment: 
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y; 
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y; 
		x ^= y; 
		x |= y; 
		// Casting: 
		char c = (char) x; 
		byte b = (byte) x; 
		short s = (short) x; 
		int i = (int) x; 
		long l = (long) x; 
		float f = (float) x;
		double d = (double) x;
	}
	
	
	public static void main(String[] args) {
		boolTest(true, false);
		charTest('c', 'k');
	}

}
