package chapter06.arrayprocedure;
import java.util.Scanner;

public class ArrayProc {
	private int[] score;
	private int sum;
	private double average;
	
	public ArrayProc(){
		this(5, 0, 0.0);
	}
	
	public ArrayProc(int size, int sum, double average){
		this.score = new int[size];
		this.sum = sum;
		this.average = average;
	}
	
	public void getValues(){
		//배열에 성적받기 
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < this.score.length; i++) {
			System.out.printf("성적 %d 입력: ", (i+1));
			score[i] = scanner.nextInt();
		}
		scanner.close();
	}
	public int getSum(){
		//배열의 모든 값을 더해서 저장하고 리턴 
		for(int a : this.score) {
			sum += a;
		}
//		for (int i = 0; i < this.score.length; i++) {
//			this.sum += score[i];
//		}
		return sum;
	}
	
	public double getAverage() {
			this.average = (double)sum / (double)this.score.length;
		return average;
	}
	
	public void printArray(){
		for(int a : this.score) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
}
