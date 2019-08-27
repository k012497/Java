package chapter07.poly_bomb;

public class Tree extends Bomb{
	public Tree() {
		super();
	}
	public static void sbomb() {
		System.out.println("static Tree sbomb");
	}
	@Override
	public void bomb() {
		System.out.println("tree bomb() BOMB!!!!!");
	}
}
