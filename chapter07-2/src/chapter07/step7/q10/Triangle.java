package chapter07.step7.q10;

public class Triangle extends Shape{
	private int base;
	private int side1;
	private int side2;
	private int height;
	
	public Triangle(int base, int side1, int side2, int height) {
		super();
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}

	@Override
	public double getCircumference() {
		return base+side1+side2;
	}

	@Override
	public double getArea() {
		return (base * height)/2.0;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", side1=" + side1 + ", side2=" + side2 + ", height=" + height + "]";
	}
	
	

}
