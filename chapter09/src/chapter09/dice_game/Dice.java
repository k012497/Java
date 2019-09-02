package chapter09.dice_game;

public class Dice {
	private int side;
	
	public Dice() {
		side = 0;
	}
	
	public int roll() {
		return (int)(Math.random()*6)+1;
	}
	
	public void setValue() {
		side = roll();
	}
	
	public int getValue() {
		return side;
	}
	
	public String toString(int side) {
		String to = Integer.toString(side);
		return to;
	}

}
