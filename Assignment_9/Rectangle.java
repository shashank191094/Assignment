package consultadd.assignment9;

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
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	

}
