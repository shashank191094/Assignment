package consultadd.assignment11;

public class StringRuntimeTest {

	public void validationRunTime(String name) {

		if (name.equalsIgnoreCase("test")) {
			InvalidNameRuntimeException exception = new InvalidNameRuntimeException("Invalid Name");
			throw exception;
		}
	}

}
