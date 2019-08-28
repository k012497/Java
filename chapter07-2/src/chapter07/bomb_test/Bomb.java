package chapter07.bomb_test;

public abstract class Bomb {
	public abstract void bomb();
	
	public static void sbomb() {
		System.out.println("ⓢBomb!!!");
	}
	
	public Bomb() {
	}
	
}
