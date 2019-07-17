package consultadd.assignment;

public class ObjectsCreated {

	private static int objectCount;
	
	public ObjectsCreated() {
		objectCount = objectCount + 1;
	}
	
	public static void main(String[] args) {
		
		
		ObjectsCreated objectsCreated1 = new ObjectsCreated();
		ObjectsCreated objectsCreated2 = new ObjectsCreated();
		ObjectsCreated objectsCreated3 = new ObjectsCreated();
		

		System.out.println("Total number of objects created: " + ObjectsCreated.objectCount);
		
	}

}
