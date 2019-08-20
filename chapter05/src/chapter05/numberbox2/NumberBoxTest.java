package chapter05.numberbox2;

public class NumberBoxTest {

	public static void main(String[] args) {
		//1. 생성자 3개 만들기 
		NumberBox nBox1 = new NumberBox();
		NumberBox nBox2 = new NumberBox(10, 10.0f, 10.0);
		NumberBox nBox3 = new NumberBox(20, 20.0f, 20.0, 'c');
		
		//2. 출력
		System.out.println(nBox1);
		System.out.println(nBox2);
		System.out.println(nBox3);
		
		
		//3. 메소드 오버로딩 함수 사용 
		System.out.println(nBox3.calculate(10, 10.0f));
		System.out.println(nBox3);
		System.out.println(nBox3.calculate(10, 10.0f, 10.0));
		System.out.println(nBox3);
		

	}

}
