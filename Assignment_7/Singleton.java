package consultadd.assignment7;

public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingletonObject() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
