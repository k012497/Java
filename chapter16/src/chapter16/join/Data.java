package chapter16.join;

public class Data {
	private int sum = 0;
	
    //	동기화 처리 
	public synchronized int getSum() {
		return sum;
	}

	public synchronized void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
