package chapter04;

public class StringTest {

	public static void main(String[] args) {
		String str1 ="abc";
		String str2 ="abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str1); //왜 프린트할때는 주소 안나오고  값? ? 주소 찍고 싶으면 어케 함 
		System.out.println(str2);
		System.out.println(str3);
//		System.out.println(Integer.toHexString(str1.hashCode())); //hashCode는 주소를 빨리 가리키는 것. 진짜 메모리가 아니다.
//		System.out.println(Integer.toHexString(str2.hashCode()));
//		System.out.println(Integer.toHexString(str3.hashCode()));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		System.out.println(str1 == "abc"); //T
		System.out.println(str1 == str2); //T
		System.out.println(str1 == str3); //F
		System.out.println(str3 == new String("abc")); //F
		
		System.out.println(str1.equals("abc")); //T
		System.out.println(str3.equals("abc")); //T
		System.out.println(str1.equals(new String("abc"))); //T
		System.out.println(str3.equals(new String("abc"))); //T

		//문자열 객체 상수는 하나만 만든
	}	
}



