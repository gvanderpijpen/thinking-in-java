package be.geertvanderpijpen.thinkinginjava.exercises.interfaces;

import java.util.Random;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

interface TossDevice {
	String toss();
}

interface TossDeviceFactory {
	TossDevice getTossDevice();
}

class Coin implements TossDevice {
	private Random rand;
	private String [] mapping = {"KOP", "MUNT"};
	
	Coin() {
		rand = new Random();
	}
	
	public String toss() {
		return mapping[rand.nextInt(2)];		
	}
}

class CoinFactory implements TossDeviceFactory {
	public TossDevice getTossDevice() {
		return new Coin();
	}
}

class Die implements TossDevice {
	private Random rand;
	
	Die() {
		rand = new Random();
	}
	
	public String toss() {
		Integer result = (rand.nextInt(6) + 1);
		return result.toString();
	}
}

class DieFactory implements TossDeviceFactory {
	public TossDevice getTossDevice() {
		return new Die();
	}
}

public class Tossing {
	
	public static void performToss(TossDeviceFactory factory) {
		TossDevice td = factory.getTossDevice();
		print(td.toss());
	}

	public static void main(String[] args) {
		performToss(new CoinFactory());
		performToss(new DieFactory());
	}

}
