package chapter16.wait2;

public class Bakery {
	private static int num;
	private String[] bread = {"bread1", "bread2", "bread3", "bread4", "bread5", "죽빵", "로우킥"};
	private boolean isBread = false;
	
	public synchronized String getBread() {
		
		while(!isBread) {
			
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		if(num == 5 || num == 6) {
			System.out.println(this.bread[num] + "을 맞았습니다.");
		} else {
			System.out.println(this.bread[num] + " 먹었습니다.");
		}
		isBread = false;
		notifyAll();
		
		return this.bread[num];
	}
	
	public synchronized void setBread() {

		while(isBread) {
			
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		num = (int)(Math.random()*7);
		
		if(num == 5 || num == 6) {
			System.out.println(this.bread[num] + "을 날렸습니다.");
		} else {
			System.out.println(this.bread[num] + " 만들었습니다. ");
		}
		
		isBread = true;
		
		notifyAll();
	}

}