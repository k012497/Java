package chapter06.step6;

public class Dice {
	public static final int eye1  = 1;
	public static final int eye2 = 2;
	public static final int eye3 = 3;
	public static final int eye4 = 4;
	public static final int eye5 = 5;
	public static final int eye6 = 6;

	public int roll() {
		return (int)(Math.random()*6)+1;
	}
}
