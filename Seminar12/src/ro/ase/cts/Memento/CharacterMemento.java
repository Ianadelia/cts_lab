package ro.ase.cts.Memento;

public class CharacterMemento {

	String name;
	int htpoints;
	
	public CharacterMemento(String name, int htpoints) {
		super();
		this.name = name;
		this.htpoints = htpoints;
	}

	public String getName() {
		return name;
	}

	public int getHtpoints() {
		return htpoints;
	}
	
	
	public CharacterMemento generateMemento() {
		return new CharacterMemento(this.name, this.htpoints);
	}
	
	public void setMemento(CharacterMemento memento) {
		this.name=memento.name;
		this.htpoints=memento.htpoints;
	}
}
