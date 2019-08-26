package chapter07.car;

public class SportsCar extends Car {
	private boolean turbo;
	boolean dturbo;

	public SportsCar(int speed) {
		super(speed);
		System.out.println("SportsCar Constructor");
	}
	
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
		this.dspeed = 10; //부모건데 this로 접근.
		
		//부모의 정적 멤버 변수에 클래스명, super, this로 접근 . 다 내꼬! 
		Car.mycar = 20;
		super.mycar = 20;
		this.mycar = 20;
	
	}
	
}
