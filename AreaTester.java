import java.awt.Rectangle;

public class AreaTester {

	public static void main(String[] args) {

		//E2.1-E2.1
		Rectangle rect1 = new Rectangle(0, 0, 15, 30);
		System.out.println("Expected area: 450");
		System.out.println("Calculated area: " + (rect1.getWidth() * rect1.getHeight()));
		System.out.println("Expected perimeter: 90");
		System.out.println("Calculated perimeter: " + (rect1.getWidth() * 2 + rect1.getHeight() * 2));

		//E2.5
		Rectangle box = new Rectangle(5, 10, 20, 30);
		box.add(0, 0);
		System.out.println("Box expectations: Location-(0, 0), Width-20, Height-30");
		System.out.println("Box calculations: Location-(" + box.getX() + ", " + box.getY() + "), Width-" + box.getWidth() + ", Height-" + box.getHeight());

	}

}
