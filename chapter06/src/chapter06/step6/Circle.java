package chapter06.step6;

public class Circle {
	private int r;
	private int  cx;
	private int cy;
	
	public Circle() {
		this(0, 0, 0);
	}
	public Circle(int r, int cx, int cy) {
		this.r = r;
		cx = 0;
		cy = 0;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public double area() {
		double area = Math.PI * this.r * this.r;
		return area;
	}
}
