package chapter07.poly_bomb;

public class Car extends Bomb {
	public Car() {
		super();
	}
	public static void sbomb() {
		System.out.println("static car sbomb");
	}
	
	@Override
	public void bomb() {
		System.out.println("car bomb() BOMB!!!!!");
	}
}
