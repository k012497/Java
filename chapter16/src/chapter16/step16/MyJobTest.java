package chapter16.step16;

public class MyJobTest {

	public static void main(String[] args) {
		Thread t = new Thread(new MyJob());
		t.start();
		t.interrupt();

	}

}
