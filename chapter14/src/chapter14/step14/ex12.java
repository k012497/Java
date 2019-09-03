package chapter14.step14;

public class ex12 {
	public static void main(String[] args) {
		int[] anArray = new int[3];
		System.out.println(anArray[3]);//ArrayIndexOutOfBoundsException
		
		String[] strs = new String[3];
		System.out.println(strs[0].length());  //NullPointerException
		
		Integer.parseInt("abc"); //NumbweFormatException
		
		Object o = new Object();
		Integer i = (Integer)o;//ClassCastException
	}
}
