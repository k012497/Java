package chapter05;

public class MainTest {

	public static void main(String[] args) {
		
		String x = "abc";
		x.toUpperCase(); 
		String y = x.replace('a', 'd');
		y = y + "xyz";
		System.out.println(y);
		
		String a = "javaprogramming";
		a = a.substring(5,7);
		char b = a.charAt(1);
		a = a + b;
		System.out.println(a);
		
		float[] f1;
		 float[] f2; 
		 f1 = new float[10]; 
		 f2 = f1; 
		 System.out.println("f2[0] = " + f2[0]); 
	
		String verb = "현실이 된다";
		System.out.println("생각이" + verb);
		String s = "1234567";
		System.out.println("문자열의 길이는" + s.length());
		String s1= "ABCDEFG"; 
		s1.toLowerCase(); 
		System.out.println(s1);
		System.out.println("2 + 3 = " + (2 + 3));
		System.out.println("2 + 3 = " + 2 + 3);
		

	}

}
