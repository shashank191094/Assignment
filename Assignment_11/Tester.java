package consultadd.assignment11;

public class Tester {

	public static void main(String[] args) {
		
		// For Runtime
		StringRuntimeTest runtimeTest = new StringRuntimeTest();
		
		runtimeTest.validationRunTime("Howdy");
		
		try {
			runtimeTest.validationRunTime("hello");
		} catch(InvalidNameRuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			runtimeTest.validationRunTime("test");
		} catch(InvalidNameRuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		// For Compile Time
		StringCompiletimeTest compiletimeTest = new StringCompiletimeTest();
		try {
			compiletimeTest.validationCompileTime("hello");
		} catch (InvalidNameCompiletimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			compiletimeTest.validationCompileTime("test");
		} catch (InvalidNameCompiletimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
