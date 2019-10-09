package mementoExample;

public class ClientMemento {

	public static void main(String[] args) {
		
		CareTaker careTaker= new CareTaker();
		Originator originator= new Originator();
		Database database;
		
		database= new Database("database", "1 January 2019");
		originator.setMemento(database);
		
		database= new Database("database", "2 January 2019");
		originator.setMemento(database);
		
		careTaker.addMemento("2 November 2019",originator.createMemento());
		
		database= new Database("database", "3 February 2019");
		//pasword database
		database.setPassword("123");
		originator.setMemento(database);
		
		careTaker.addMemento("3 January 2019",originator.createMemento());
		
		database= new Database("database", "10 July 2019");
		originator.setMemento(database);
			
		
		Database database2= (Database) database.clone("database2", "11 July 2019");
		//password database2
		database2.setPassword("321");
		originator.setMemento(database2);
		
		careTaker.addMemento("11 July 2019",originator.createMemento());
		
		database= new Database("database", "15 November 2019");
		originator.setMemento(database);
		careTaker.addMemento("15 November 2019",originator.createMemento());
		
		
		originator.restoreFromMemento(careTaker.getMemento("11 July 2019"));
		originator.restoreFromMemento(careTaker.getMemento("3 January 2019"));
	}

}
