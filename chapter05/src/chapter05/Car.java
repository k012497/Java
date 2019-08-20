package chapter05;

public class Car {
	private String color;
	private int gear;
	private int speed;

	public Car(String color, int gear, int speed) {
		this.color = color;
		this.gear = gear;
		this.speed = speed;
	}

	public void setColor(String Color) {
		this.color = color;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void setColor(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return this.color;
	}

	public int getGear() {
		return this.gear;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void changeGear(int gear) {
		this.gear = gear;
	}

	public void speedUp() {
		this.speed++;
	}

	public void speedDown() {
		this.speed--;
	}

}
