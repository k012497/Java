package chapter05;

public class Rectangle {
	private int w;
	private int h;
	
	public Rectangle(){
		this.w = 0;
		this.h = 0;
	}
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public int area() {
		return this.w * this.h;
	}
	
	public int perimeter() {
		return 2*(w+h);
	}

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}
	
}
