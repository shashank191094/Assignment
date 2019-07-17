package consultadd.assignment9;

public class RectangleTester {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Square(10);
		
		if(rectangle instanceof Square) {
			((Square)rectangle).calArea();
			System.out.println(rectangle);
		}
		
		System.out.println();
		
		rectangle = new Rectangle(12, 13);
		rectangle.calArea();
		System.out.println(rectangle);

	}

}
