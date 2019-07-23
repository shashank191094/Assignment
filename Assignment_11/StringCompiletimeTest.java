package consultadd.assignment11;

public class StringCompiletimeTest {
	
	public void validationCompileTime(String name) throws InvalidNameCompiletimeException {
		
		if(name.equalsIgnoreCase("test")) {
			InvalidNameCompiletimeException exception = new InvalidNameCompiletimeException("Invalid Name");
			throw exception;
		}
	}

}
