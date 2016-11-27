package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.diamond;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

public class Diamond implements Child {

	@Override
	public void parenta() {
		print("parenta()");
	}

	@Override
	public void root() {
		print("root()");
	}

	@Override
	public void parentb() {
		print("parentb()");
	}
	
	@Override
	public void child() {
		print("child()");
	}

	public static void main(String[] args) {
		Diamond diamond = new Diamond();
	}

}
