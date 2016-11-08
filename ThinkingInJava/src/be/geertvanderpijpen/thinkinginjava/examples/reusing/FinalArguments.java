package be.geertvanderpijpen.thinkinginjava.examples.reusing;


class Gizmo {
	public void spin() {}
}

/**
 * 
 * @author gvanderpijpen
 * Using "final" with method arguments
 *
 */
public class FinalArguments {
	
	void with (final Gizmo g) {
		// does not compile g = new Gizmo();
	}
	
	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g is not final
		g.spin();
	}
	
	public static void main(String[] args) {

	}

}
