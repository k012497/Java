package chapter09.auto_car;

public class Car implements Operate{
	public void start() {
		System.out.println("car 출발 ");
	}
	public void stop() {
		System.out.println("car 정지 ");
	}
	public void setSpeed(int speed) {
		System.out.println("car 속도 변경  "+speed+"km/h");
	}
	public void turn(int degree) {
		System.out.println("car 방향 변경  "+degree+"");
	}

}
