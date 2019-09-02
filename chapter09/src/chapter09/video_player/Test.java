package chapter09.video_player;

public class Test {

	public static void main(String[] args) {
		Controllable v = new Controllable() {
			@Override
			public void play() {
				System.out.println("palying  . . .");
			}

			@Override
			public void stop() {
				System.out.println("STOP");
			}
		};
		
		v.play();
		v.stop();

	}

}
