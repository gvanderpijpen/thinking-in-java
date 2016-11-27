package be.geertvanderpijpen.thinkinginjava.examples.interfaces;

// Extending an interface with inheritance

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	@Override
	public void menace() {}
	
	@Override
	public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destroy() {}

	@Override
	public void menace() {}

	@Override
	public void kill() {}

	@Override
	public void drinkBlood() {}
	
}

public class HorrorShow {
	
	static void u(Monster b) {
		b.menace();
	}
	
	static void d(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	
	static void w(Lethal l) {
		l.kill();
	}
	
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		d(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		d(vlad);
		w(vlad);
	}

}
