package chapter14.ex15;

public class Test {
	public static final int SIZE = 10;
	public static final int FIND_NUMBER = 15;
	public static void main(String[] args) {
		int[] arr = new int[SIZE];
		for (int i : arr) {
			arr[i]= (int)(Math.random()*10);
		}
		searchArray(arr);
		
	}
	
	public static void searchArray(int[] array) {
		try {
			for (int i : array) {
				if(array[i] == FIND_NUMBER) System.out.println(array[i]);
			else throw new NotFoundException(); 
			}
		} catch (Exception e) {
			System.out.println("NOT FOUND NUMBER "+FIND_NUMBER);
		}
	}
}
