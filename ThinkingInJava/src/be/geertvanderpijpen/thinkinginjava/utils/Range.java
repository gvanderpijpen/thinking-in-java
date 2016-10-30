package be.geertvanderpijpen.thinkinginjava.utils;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Produces int range arrays<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Range {
	
	/**
	 * Returns a range of ints 0 to range
	 * @param range upper boundary of the range (excluded)
	 * @return int array containing the desired range
	 */
	public static int[] range(int range){
		int[] array=new int[range];
		for(int i =  0; i < range; i++){
			array[i] = i;
		}
		
		return array;
	}
	
	/**
	 * Returns range [min, max[ as an int array
	 * @param min Lower boundary of the range (included)
	 * @param max Upper boundary of the range (excluded)
	 * @return int array containing the desired range
	 */
	public static int[] range(int min, int max){
		int number =  max - min;
		int[] array = new int[number];
		for(int i = 0; i < number; i++){
			array[i] = min + i;
		}
		
		return array;
	}
	
	/**
	 * Returns range [min, max[ with defined steps as an int array
	 * @param min Lower boundary of the range (included)
	 * @param max Upper boundary of the range (excluded)
	 * @param step The jump that is used in the range
	 * @return int array containing the desired range
	 */
	public static int[] range(int min, int max, int step){
		int number = (max - min) / step;
		int[] array = new int[number];
		
		for(int i = 0; i < number; i++){
			array[i] = min + (i * step);
		}
		
		return array;
	}
}
