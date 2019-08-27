package chapter07.poly_bomb;

public class House extends Bomb{
	public House() {
		super();
	}
	public static void sbomb() {
		System.out.println("static House sbomb");
	}
	@Override
	public void bomb() {
		System.out.println("house bomb() BOMB!!!!!");
	}

	
}
