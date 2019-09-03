package chapter09.q17;

public class MoveTest {
	public static final int SIZE= 3;
	public static void main(String[] args) {
		MoveAndDraw[] movable = new MoveAndDraw[SIZE];
		movable[0] = new Circle(10, 20);
		movable[1] = new Rectangle(10, 20);
		movable[2] = new Triangle(10, 20);
		
		
		for (int i = 0; i < movable.length; i++) {
			int dx = (int)(Math.random()*10) + 1;
			int dy = (int)(Math.random()*10) + 1;	
			movable[i].move(dx, dy);
			movable[i].draw();
		}
		
	}

}
