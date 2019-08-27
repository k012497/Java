package chapter07.shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1, s2, s3, s4;

		s1 = new Shape();
		s2 = new Rectangle();
		s3 = new Triangle();
		s4 = new Circle();

		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}

}
