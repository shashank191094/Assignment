package edu.ilstu;

public class ImmutableTester {

	public static void main(String[] args) {
		
		ImmutableClass imclass = new ImmutableClass("Hello");
		
		System.out.println(imclass);
		
		imclass = imclass.setMessage("Hello");
		
		System.out.println(imclass);
		
		
		
	}

}
