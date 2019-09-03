package chapter09.q17;

public class Triangle implements MoveAndDraw {
	private int dx;
	private int dy;
	
	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.printf("Triangle(%d, %d)\n", dx, dy);
	}

	public Triangle(int dx, int dy) {
		super();
		this.dx = dx;
		this.dy = dy;
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Triangle [dx=" + dx + ", dy=" + dy + "]";
	}

	@Override
	public void draw() {
		System.out.println("drawing Triangle");
		
	}

}
