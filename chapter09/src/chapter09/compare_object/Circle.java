package chapter09.compare_object;

public class Circle implements Comparable {
	public int radius;
	public final double PI = Math.PI;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public int compareTo(Object object) {
		Circle circle = null;
		int returnValue = 0;
		
		if(object instanceof Circle) {
			circle = (Circle)object;
				if (this.getArea() > circle.getArea())
					returnValue = 1;
				else if (this.getArea() < circle.getArea())
					returnValue =  -1;
				else returnValue = 0;
		}
		return returnValue;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + "]";
	}
	

}
