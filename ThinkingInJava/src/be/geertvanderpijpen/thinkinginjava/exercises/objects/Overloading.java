package be.geertvanderpijpen.thinkinginjava.exercises.objects;

/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A tree that has as sole member field its height<br>
 * Trees can be planted as seedlings (0 height)<br>
 * Or created with an initial height<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
class Tree{
	int height;
	
	/**
	 * Default constructor. Creates a new Tree with initial height 0
	 */
	Tree(){
		System.out.println("Planting a seedling");
		height=0;
	}
	
	/**
	 * Creates a new Tree with an initial height 
	 * @param initialHeight The initial height of the Tree
	 */
	Tree(int initialHeight){
		System.out.println("Creating a new Tree that is " + initialHeight + " feet tall");
		height=initialHeight;
	}
	
	/**
	 * Prints the height of the Tree
	 * 
	 */
	void info(){
		System.out.println("Tree is " + height + " feet tall");
	}
	
	/**
	 * 
	 * Prints the Tree height with a preceding message
	 * @param s Message that is printed in front of the Tree height
	 */
	void info(String s){
		System.out.println(s + ": Tree is " + height + " feet tall");
	}
}


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demonstrates the concept of method overloading using the {@link Tree} class.<br>
 * 5 Trees are created with an initial height of 0 to 5 feet.<br>
 * After creation, the 2 info methods are called:<br>
 * <ul>
 * <li>{@link Tree#info()} </li>
 * <li>{@link Tree#info(String)}</li>
 * </ul>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++){
			Tree t = new Tree(i);
			t.info();
			t.info("Overloaded method");
		}
		
		//Overloaded constructor : 
		new Tree();

	}

}
