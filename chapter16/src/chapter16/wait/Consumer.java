package chapter16.wait;

public class Consumer extends Thread{
	//member variable
	private Bakery bakery;
	
	//constructor
	public Consumer(Bakery bakery) {
		this.bakery = bakery;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				String str = bakery.getBread();
				System.out.println(str + "을 먹었습니다. ");
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}
