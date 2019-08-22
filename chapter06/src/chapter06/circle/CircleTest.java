package chapter06.circle;

public class CircleTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		
		Circle c1 = new Circle(p1, 10);
		
		System.out.println(p1.toString());
		System.out.println(c1.toString());

	}

}
