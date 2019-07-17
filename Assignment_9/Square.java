package consultadd.assignment9;

public class Square extends Rectangle {
	
	private int side;
	
	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	
	@Override
	public void calArea() {
		System.out.println("The area of the Square is: " + side * side);
	}

}
