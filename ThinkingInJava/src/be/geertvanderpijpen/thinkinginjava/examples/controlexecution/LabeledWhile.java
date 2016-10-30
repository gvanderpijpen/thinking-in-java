package be.geertvanderpijpen.thinkinginjava.examples.controlexecution;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * Demontrates labeled continues and breaks using while loops<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class LabeledWhile {

	public static void main(String[] args) {
		int i = 0;
		outer:
		while(true){
			print("Outer while loop");
			while(true){
				i++;
				print("i = " + i);
				if(i == 1){
					print("continue");
					continue;
				}
				
				if(i == 3){
					print("continue outer");
					continue outer;
				}
				
				if(i == 5){
					print("break");
					break;
				}
				
				if(i == 7){
					print("break outer");
					break outer;
				}
				
			}
		}
	}

}
