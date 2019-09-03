package chapter09.q17;

public class Rectangle implements MoveAndDraw {
	private int dx;
	private int dy;
	
	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.printf("Rectangle(%d, %d)\n", dx, dy);
	}

	@Override
	public void draw() {
		System.out.println("drawing Triangle");
		
	}
	
	public Rectangle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Rectangle [dx=" + dx + ", dy=" + dy + "]";
	}


}
