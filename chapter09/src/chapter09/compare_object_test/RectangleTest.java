package chapter09.compare_object_test;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(20, 20);
		
		System.out.println(r1);
		System.out.println(r2);
		
		int returnValue = r1.compareTo(r2);
		
		switch (returnValue) {
		case 1:
			System.out.println("r1 is bigger");
			break;
		case -1:
			System.out.println("r2 is bigger");
			break;
		case 0:
			System.out.println("r1 is same as r2");
			break;

		default:
			System.out.println("the object doesn't work");
			break;
		}
	}

}
