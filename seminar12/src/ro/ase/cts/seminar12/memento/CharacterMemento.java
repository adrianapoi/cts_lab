package ro.ase.cts.seminar12.memento;

public class CharacterMemento {
	String name;
	int hitpoints;
	
	public CharacterMemento(String name, int hitpoints) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

}
