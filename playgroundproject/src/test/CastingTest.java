package test;

public class CastingTest {

	public static void main(String[] args) {
		String str1 = "1abc";
		String str2 = "123";
		int num1 = 0;
		
		//num1 = (int)str; String을 정수로 강제 형변환할 수 없다. 에러 
		System.out.println(num1);
		
		//str1에 문자가 있으므로 정수로 변환되지 못 함. 에러 
		//num1 = Integer.parseInt(str1);
		//System.out.println(num1); 
		
		//str2에는 숫자만 있으므로 변환 가능!
		num1 = Integer.parseInt(str2);
		System.out.println(num1);
		
	}

}
