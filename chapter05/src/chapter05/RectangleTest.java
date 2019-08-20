package chapter05;

public class RectangleTest {

	public static void main(String[] args) {
		 Rectangle r1 = new Rectangle();
		 Rectangle r2 = new Rectangle(3,4);
		 
		 System.out.println(r1);
		 System.out.println(r2);
		 System.out.println("넓이 : " + r2.area());
		 System.out.println("둘레 : " + (r2.perimeter()));

	}

}
