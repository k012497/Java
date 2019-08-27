package chapter07.poly_bomb;

public abstract class Bomb extends Object {
	public Bomb() {
		super();
	}
	public static void sbomb() {
		System.out.println("static Bomb sbomb");
	}
	
	public abstract void bomb();
	public void bomb2() {
		System.out.println("bomb2() BOMB!!!!!!!");
	}
	

}

