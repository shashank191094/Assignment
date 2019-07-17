package edu.ilstu;

public final class ImmutableClass {

	private final String message;	
	
	public ImmutableClass(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public ImmutableClass setMessage(String message) {
		return new ImmutableClass(message);
		
	}
	
}
