package chapter05.box;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		
		System.out.println(box.getWidth());
		System.out.println(box.getLength());
		System.out.println(box.getHeight());
		
		box.setWidth(10);
		box.setLength(5);
		box.setHeight(3);

		System.out.println(box.getWidth());
		System.out.println(box.getLength());
		System.out.println(box.getHeight());
	}

}
