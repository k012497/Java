package chapter09.q21;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	@Override
	public int calcArea() {
		return (int)(base * height / 2);
	}
	
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

}
