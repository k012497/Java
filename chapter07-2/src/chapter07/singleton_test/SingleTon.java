package chapter07.singleton_test;

public class SingleTon {
	
	private static SingleTon single1 = new SingleTon(); // 명시적 초기값 
//	private static SingleTon single2 = null; // 정적 블럭  
//	private static SingleTon single3; // 디폴트값 	
	
	private SingleTon() {}
	
	public static SingleTon getSingleTon () {
		if(single1 == null) {
			single1 = new SingleTon();
		}		
		return single1;
	}
	
	static {
		single1 = new SingleTon();
	}
	
}
