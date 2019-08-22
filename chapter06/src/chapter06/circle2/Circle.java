package chapter06.circle2;

public class Circle {
	private int radius;
	private Point point;
	
	public Circle() {
		this(0, null);
//		this.radius = 0;
//		this.point = null;
	}
	
	public Circle(int radius, Point point) {
		this.radius = radius;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return String.format("radius = %3d, %10s", this.radius, this.point);
	}

}
