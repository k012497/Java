package chapter07;

public class Class {
	static int staticNum;
	int num;
	
	public void func() {
		this.num = 0;
		//Class.num = 1;
		Class.staticNum = 1;
		System.out.println(staticNum);
		this.staticNum = 0;
		System.out.println(staticNum);
		
	}

}
