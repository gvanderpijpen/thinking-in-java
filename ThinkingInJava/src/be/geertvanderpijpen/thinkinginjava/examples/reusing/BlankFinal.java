package be.geertvanderpijpen.thinkinginjava.examples.reusing;

class Poppet {
	private int i;
	Poppet(int i1){
		this.i = i1;
	}
}

/**
 * 
 * @author gvanderpijpen
 * "Blank" final fields
 *
 */
public class BlankFinal {
	
	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference
	
	// Blank finals MUST be nitialized in the constructor
	public BlankFinal(){
		j = 1; 
		p = new Poppet(1);
	}
	
	public BlankFinal(int x){
		j = x; // INitialization of blank final
		p = new Poppet(x); // INitialize blank final reference
		
	}

	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);

	}

}
