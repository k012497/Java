package chapter16.join;

public class GetSum extends Thread{
	private Data data;
	

	public GetSum(Data data) {
		super();
		this.data = data;
	}


	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
			data.setSum(sum);
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//			}
		}
	}
	
	

}
