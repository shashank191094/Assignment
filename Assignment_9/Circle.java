package consultadd.assignment9;

public class Circle {
	
	private double radius;
	private final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calArea() {
		return PI * this.radius * this.radius;
	}

}