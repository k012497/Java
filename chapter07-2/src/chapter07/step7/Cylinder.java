package chapter07.step7;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		this(0.0, 0);
	}
	
	public Cylinder(double radius) {
		super(radius);
		height = 0;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return (4.0/3.0)*Math.pow(getRadius(), 3); 
	}
	
}
