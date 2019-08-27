package chapter07.singleton;

public class SingleTon {
	private String string = "과제 하자 ";
	//2. 자기 객체를 갖고 있는 정적 멤버 변수를 만든다.
	private static SingleTon singleTon; //디폴트값 null
	
	//3-1. 싱글톤 객체를 만든다. 
//	static {
//		singleTon = new SingleTon(); 
//	}
	
	//1. 외부에서 생성자에 접근하지 못 하도록 한다.
	private SingleTon() {}
	
	
	public String getString() {
		return string;
	}


	public void setString(String string) {
		this.string = string;
	}


	//4. 싱글톤 객체를 리턴한다. 
	public static SingleTon getSingleTon() {
		//3-2. 싱글톤 객체를 만든다. 
		if(singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}
	
	//5. 우리가 실제로 활용할 수 있는 내용을 적어준다. 
	public void print() {
		System.out.println("신난다!!!!!!! ");
		System.out.println("야,,,,신난다ㅏ,,,,," + string);
	}
	
}

