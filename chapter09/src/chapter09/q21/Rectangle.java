package chapter09.q21;

public class Rectangle  extends Shape{
	private int length;
	private int width;
	
	@Override
	public int calcArea() {
		return length * width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
