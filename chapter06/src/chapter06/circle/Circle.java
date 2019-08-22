package chapter06.circle;

public class Circle {
	private int radius;
	private Point point;
	
	public Circle(){
		this.radius = 0;
		this.point = null;
	}
	
	public Circle(Point point, int radius){
		this.radius = radius;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", point=" + point + "]";
	}
	
	
}
