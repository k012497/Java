package chapter16.wait;

public class BakerTest {

	public static void main(String[] args) {
		Bakery bakery = new Bakery();
		
		// make Baker thread object
		Runnable baker = new Baker(bakery);
		Thread t1 = new Thread(baker);
		
		// make Consumer thread object
		Thread t2 = new Consumer(bakery);
		
		t1.start();
		t2.start();
	}

}
