package chapter07.poly_bomb;

public class Building extends Bomb {
	public Building() {
		super();
	}
	public static void sbomb() {
		System.out.println("static Building sbomb");
	}
	
	@Override
	public void bomb() {
		System.out.println("building bomb() BOMB!!!!!");
	}
}
