package chapter16.wait;

public class Baker implements Runnable{
	// member variable
	private static String[] menu = {"단팥빵", "피자빵", "고로케", "붕어빵", "식빵"}; //객체는 synchronize가 안 됨. 오류 발생 
	private Bakery bakery;
	
	//constructor
	public Baker(Bakery bakery) {
		this.bakery = bakery;
	}
	
	@Override
	public void run() {
		// 1. 10번 돌린다
		for (int i = 0; i < 5; i++) {
			try {
				this.bakery.setBread(menu[i]);
				System.out.println(menu[i] + " GET YOUR BREAD!!!");
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		
	}


}
