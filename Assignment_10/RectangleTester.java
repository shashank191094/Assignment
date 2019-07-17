package consultadd.assignment10;

public class RectangleTester {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(12, 13);
		Rectangle rec2 = new Rectangle(12, 13);

		if (rec1.equals(rec2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects are not equal");
		}

	}

}
