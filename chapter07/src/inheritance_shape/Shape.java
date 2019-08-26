package inheritance_shape;

public class Shape {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	void print() {
		System.out.printf("x좌표 : %d, y좌표 : %d\n", x, y);
	}

}
