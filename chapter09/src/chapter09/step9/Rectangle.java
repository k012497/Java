package chapter09.step9;

public class Rectangle implements GraphicsObject {
	private int length;
	private int width;
	
	public void setDimensions(int length, int widht) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public int getArea() {
		return this.length * this.width;
	}

	@Override
	public void draw() {
		System.out.println("drawing Rectangle : length=  "+length+", width = "+width);

	}

}
