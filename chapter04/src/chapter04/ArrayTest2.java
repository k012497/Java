package chapter04;

import java.util.Arrays;

public class ArrayTest2{

	public static void main(String[] args) {
		//1. 변수형 상수(심볼릭상수) 정의. count = 10
		final int COUNT = 10;
		int sum = 0;
		
		//2. 1차원 정수형 배열 클래스를 객체화. 생성자 값은 COUNT, 객체참조변수명은 score
		int[] score= new int[]{10, 20, 30, 40, 50};
		
		//3. 배열 길이만큼 반복하는 반복문을 선언.
		for(int i = 0 ; i < score.length ; i++) {
			//3-1. 랜덤처리한다. (50~100)
			//score[i]=(int)(Math.random()*(100-50+1)+50);
			//3-2.배열 원소에 있는 값들을 누적
			sum += score[i];
		}
		
		System.out.println(Arrays.toString(score)+"\n총점 = " + sum + "\n평균 = " + ((double)sum/(double)score.length)); 
		//Arrays.toString() ;배열의 원소들을 싹 찍어주는 멤버함수 
		
	}

}
