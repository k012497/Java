package chapter09.q17;

public class Circle implements MoveAndDraw {
	private int dx;
	private int dy;
	
	public Circle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		System.out.println(this.toString());
	}
	
	@Override
	public void draw() {
		System.out.println("drawing Triangle");
	}
	
	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.printf("Circle(%d, %d)\n", dx, dy);
	}

	@Override
	public String toString() {
		return "Circle [dx=" + dx + ", dy=" + dy + "]";
	}

}
