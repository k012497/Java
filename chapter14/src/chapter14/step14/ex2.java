package chapter14.step14;

public class ex2 {
 public static void main(String[] args) {
	int[] array = new int[3];
	
	try {
		array[5] = 3;	
	} catch (Exception e) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}
 }
}
