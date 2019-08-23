package chapter06.arrayprocedure2;

import java.util.Arrays;

public class ArrayProc {
	private int[] score;
	private int sum;
	private double average;
	private int max;
	private int min;
	private static int number1 = 0; //private static 호출테스트 
	static int number2 = 0; //private static 호출테스트 

	public ArrayProc() {
		this(10);
	}

	public ArrayProc(int size) {
		this.score = new int[size];
		this.sum = 0;
		this.average = 0.0;
		this.max = 0;
		this.min = 0;
	}

	public void getValues() {
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * (100 - 0 + 1) + 0);
		}
	}

	public int getSum() {
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return this.sum;
	}

	public double getAverage() {
		average = ((double)this.sum / score.length);
		return average;
	}
	
	public int getMax() {
		this.max = this.score[0];
		for (int i = 0; i < score.length; i++) {
			if( max < this.score[i]) {
				max = this.score[i];
			}
		}
		return this.max;
	}
	
	public int getMin() {
		this.min = this.score[0];
		for (int i = 0; i < score.length; i++) {
			if( min > this.score[i]) {
				min = this.score[i];
			}
		}
		return this.min;
	}

	public void printArray() {
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "ArrayProc [score=" + Arrays.toString(score) + ", sum=" + sum + ", average=" + average + ", max=" + max
				+ ", min=" + min + "]";
	}

}
