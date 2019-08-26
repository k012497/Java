package chapter07.car;

public class Car {
	private int speed;
	int dspeed;
	protected int pspeed;
	
	public static int mycar;
	
	public Car(int speed) {
		super(); //Object
		this.speed = speed;
		System.out.println("Car Constructor");
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
