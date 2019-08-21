package chapter05.test;

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 stu1 = new Student2("김소진 ", 100, "female"); 
		Student2 stu2 = new Student2(); 
		Student2 stu3 = new Student2("김소진", 100, "female"); 
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode()); //String만 hashcode/identityhashcode 차이 남. 다른 클래스는 그냥 hascode로 번지 가져와도 ㄱㅊ. >
		System.out.println(str2.hashCode()); 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(stu1.hashCode()); 
		System.out.println(System.identityHashCode(stu1));
		System.out.println(stu3.hashCode());
		System.out.println(System.identityHashCode(stu3));
		System.out.println(System.identityHashCode(stu1.toString()));
		
		System.out.println(stu2.hashCode());
		System.out.println(System.identityHashCode(stu2));
		
	}

}
