package chapter07.singleton;

public class SingleTonTest {

	public static void main(String[] args) {
//		SingleTon single = new SingleTon(); 
		
		SingleTon single1 = SingleTon.getSingleTon();
		single1.print();
		single1.setString("완료 못 함 ");
		single1.print();
		
		SingleTon single2 = SingleTon.getSingleTon(); //객체는 하난데 다른 참조변수에 담음. 
		single2.print(); //같은 객체를 참조하니까 수정된 String이 나온다.

	}

}
