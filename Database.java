package mementoExample;

public class Database implements Prototype{
	
	private String name;
	private String state;
	private String dataBaseNumber;
	private String password;
	private String users;
	private String employees;
	
	
	public String getDataBaseNumber() {
		return dataBaseNumber;
	}
	public void setDataBaseNumber(String dataBaseNumber) {
		this.dataBaseNumber = dataBaseNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String estate) {
		this.state = estate;
	}
	
	public Database(String name,String state) {
		this.name=name;
		this.state=state;
	}
	
	public void show() {
		System.out.println("Current Database --> Name: "+name+" State: "+state);
	}
	
	@Override
	public Object clone(String name,String state) {
		Database cloneObj= new Database(name,state);
		cloneObj.setEmployees(this.employees);
		cloneObj.setUsers(this.users);
		cloneObj.setPassword(this.password);
		return cloneObj;
	}
	
}
