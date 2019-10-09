package mementoExample;


public class Originator {
	
	private Database state;
	
	public void setMemento(Database state) {
		System.out.println("Originator: create memento "+state.getState());
		state.show();
		this.state=state;
	}
	
	public Memento createMemento() {
		System.out.println("Originator create memento");
		state.show();
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento m) {
		state= m.getSavedState();
		System.out.println("Originator after restored memento: "+state.getState()+" Password: "+state.getPassword());
		state.show();
	}
}
