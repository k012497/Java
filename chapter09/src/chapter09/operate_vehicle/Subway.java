package chapter09.operate_vehicle;

public class Subway implements Operate{
	public void start() {
		System.out.println("subway 출발 ");
	}
	public void stop() {
		System.out.println("subway 정지 ");
	}
	public void setSpeed(int speed) {
		System.out.println("subway 속도 변경  "+speed+"km/h");
	}
	public void turn(int degree) {
		System.out.println("subway 방향 변경  "+degree+"");
	}

}
