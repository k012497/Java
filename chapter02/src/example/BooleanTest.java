package example;

public class BooleanTest {
	public static void main(String[] args) {
		//1. 부울형 변수를 선언한다.(bool)
		boolean bool = false;

		//2. 값을 할당한다. 
		bool = true;
		
		//3. 부울형 값을 출력한다 (println)
		System.out.println(bool);
		
		//4. 1이 2보다 크냐를 물어본다.
		bool = (1 > 2);
		
		//5. 결과값을 출력한다.
		System.out.println(bool);
	}
}
