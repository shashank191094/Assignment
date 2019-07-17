package consultadd.assignment10;

public class Rectangle {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calArea() {
		System.out.println("The area of the rectangle is: " + this.length * this.breadth);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean retVal = true;
		
		if(obj instanceof Rectangle) {
			if((((Rectangle) obj).length == this.length) && (((Rectangle) obj).breadth == this.breadth)) {
				retVal = true;
			}
		}
		else {
			retVal = false; 
		}
		return retVal;
		
		
	}

}
