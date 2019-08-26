package inheritance_shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	double area() {
		return (double)width * height;
	}
	
	void draw() {
		System.out.printf("( %d, %d ) 위치에 가로 : %d, 세로 : %d\n",
				this.getX(), this.getY(), width, height);
	}

}
