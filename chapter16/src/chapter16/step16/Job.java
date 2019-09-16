package chapter16.step16;

class Job extends Thread {
	private String name ;
	private byte n = 0;
	
	public Job(String name) {
		super(name);
		this.name = name;
	}
	
	public synchronized void run() { //런은 일을하는 하인(화장실 들어가려는 사람 ), 그 안에 같은 빗자루(화장실 칸 )를 쓸 때 ..  
		while(true) {
			System.out.println(name+ ": " + n++);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Job("T1"));
		Thread t2 = new Thread(new Job("T2"));
		t1.start();
		t2.start();
	}
}
