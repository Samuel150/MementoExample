package mementoExample;

public class Memento {
	
	private Database state;
	
	public Memento(Database stateToSave) {
		state=stateToSave;
	}
	
	public Database getSavedState() {
		return state;
	}
}
