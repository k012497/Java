package inheritance_example;

class Shape {
	public Shape() {
		System.out.println("Shape() 생성자 ");
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		super();
		System.out.println("Rectangle() 생성자 ");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	}
}
