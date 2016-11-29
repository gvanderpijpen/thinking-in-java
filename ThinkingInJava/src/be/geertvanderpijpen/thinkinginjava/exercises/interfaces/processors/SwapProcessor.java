package be.geertvanderpijpen.thinkinginjava.exercises.interfaces.processors;

import be.geertvanderpijpen.thinkinginjava.examples.interfaces.interfaceprocessor.StringProcessor;

import be.geertvanderpijpen.thinkinginjava.examples.interfaces.interfaceprocessor.Apply;

public class SwapProcessor extends StringProcessor {

	@Override
	public String process(Object input) {
		String temp = (String)input;
		String resultaat = "";
		for(int loper=0; loper < temp.length()-1; loper+=2) {
			resultaat+=temp.charAt(loper+1);
			resultaat+=temp.charAt(loper);
		}
		
		if(temp.length() % 2 != 0)
			resultaat+=temp.charAt(temp.length()-1);
		
		return resultaat;
	}
	
	public static void main(String[] args) {
		Apply.process(new SwapProcessor(), s);
	}

}
