package chapter07.step7.q10;

public abstract class Shape {
	private int x;
	private int y;
	private double size;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public abstract double getCircumference();
	public abstract double getArea();
	
	
	
}
