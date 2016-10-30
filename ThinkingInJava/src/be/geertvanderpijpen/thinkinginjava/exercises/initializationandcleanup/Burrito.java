package be.geertvanderpijpen.thinkinginjava.exercises.initializationandcleanup;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * A burrito has one property: {@link Spiciness}<br>
 * 3 burritos are created and a description of their spiciness is printed<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class Burrito {
	
	Spiciness degree;
	
	public Burrito(Spiciness degree){
		this.degree = degree;
	}
	
	public void describe(){
		printnb("This burrito is ");
		switch(degree){
		case NOT: 	print("not spicy at all");
					break;
		case MILD:
		case MEDIUM:	print("a little hot");
						break;
		case HOT:
		case FLAMING: 	
		default:		print("maybe too hot");
					
		}
	}

	public static void main(String[] args) {
		Burrito plain = new Burrito(Spiciness.NOT),
				greenChile = new Burrito(Spiciness.MEDIUM),
				jalapeno = new Burrito(Spiciness.HOT);
		
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
		
	}

}
