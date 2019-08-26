package chapter06.step6;

public class Point {
	private int x;
	private int y;

	Point() {
		this.x = 0;
		this.y = 0;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("( " + this.x + ", " + this.y + " )");
	}

}
