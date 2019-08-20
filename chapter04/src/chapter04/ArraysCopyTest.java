package chapter04;

import java.util.Arrays;

public class ArraysCopyTest {

	public static void main(String[] args) {
		//1. 정수형 객체배열을 만든다.
		int[] num1 = new int[] {1,2,3,4,5};
		for(int value : num1) {
			System.out.print(value + " ");
		}
		
		int[] num2 = arraysCopy(num1);
		System.out.println("\n복사된 배열 = " + Arrays.toString(num2));
		
		System.out.println(num1 == num2); //번지가 같을까?  ㄴㄴ 
		System.out.println(num1 +" " + num2);
	}
	
	public static int[] arraysCopy(int[] num1) {
		int[] num2 = new int[num1.length];
		for (int i = 0; i < num1.length; i++) {
			num2[i] = num1[i]	;
		}
		return num2;
	}

}
