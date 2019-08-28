package chapter09.auto_car;

public class TestMain {

	public static void main(String[] args) {
		Operate[] operate = {new Car(), new Subway(), new Bus()};
		for (int i = 0; i < operate.length; i++) {
			operate[i].start();
			operate[i].stop();
			operate[i].setSpeed(100);
			operate[i].turn(40);
		}

	}

}
