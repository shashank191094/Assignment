package consultadd.assignment7;

public class SingletonTester {
	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getSingletonObject();
		Singleton singleton2 = Singleton.getSingletonObject();
		
		if(singleton==singleton2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
