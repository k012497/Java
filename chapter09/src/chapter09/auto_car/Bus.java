package chapter09.auto_car;

public class Bus implements Operate{
	public void start() {
		System.out.println("bus 출발 ");
	}
	public void stop() {
		System.out.println("bus 정지 ");
	}
	public void setSpeed(int speed) {
		System.out.println("bus 속도 변경  "+speed+"km/h");
	}
	public void turn(int degree) {
		System.out.println("bus 방향 변경  "+degree+"");
	}

}