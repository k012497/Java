package chapter07.singleton;

public class SingleTonTest {

	public static void main(String[] args) {
//		SingleTon single = new SingleTon(); 
		
		SingleTon single = SingleTon.getSingleTon();
		single.print();
		//single.setString("완료 못 함 ");
		single.print();
		
		SingleTon single2 = SingleTon.getSingleTon();
		single2.print();

	}

}
