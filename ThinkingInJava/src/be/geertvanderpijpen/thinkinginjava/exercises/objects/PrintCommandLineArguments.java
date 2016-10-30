package be.geertvanderpijpen.thinkinginjava.exercises.objects;


/**
 * 
 * Part of Thinking in Java, 4th edition<br>
 * The main program takes the first 3 parameters from the command line and prints them<br>
 * If there are less than 3 parameters, it prints all the parameters, if any<br>
 * @author Geert Vanderpijpen
 * @version 1.0
 */
public class PrintCommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 3){
			for(int i=0; i<args.length; i++){
				System.out.println("Argument number " + (i+1) + " = " + args[i]);
			}
		}
		else{
			for(int i=0; i<3; i++){
				System.out.println("Argument number " + (i+1) + " = " + args[i]);
			}
		}

	}

}
