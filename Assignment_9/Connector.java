package consultadd.assignment9;

public abstract class Connector {

	public abstract void openConnection();
	public abstract void closeConnection();
	public abstract void fireQuery();
	
	public void display(){
		System.out.println("Inside display method.");
	}
	
	public void loadedDBConnection(){
		System.out.println("Inside loadedDBConnection method.");
	}
}
