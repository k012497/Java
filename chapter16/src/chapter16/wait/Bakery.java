package chapter16.wait;

public class Bakery {
	private String bread;
	private boolean isEmpty;
	
	public Bakery() {
		super();
		this.bread = null;
		this.isEmpty = true;
	}

	public synchronized String getBread() {
		while(isEmpty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		isEmpty = true; // 빵 가져간다. 빵 없어요!
		notifyAll();
		return bread;
	}

	public synchronized void setBread(String bread) {
		while(!isEmpty) {			
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		isEmpty = false; // 빵을 만든다. 빵 있어요!
		this.bread = bread;
		notifyAll();
	}
	
	
	
	

}
