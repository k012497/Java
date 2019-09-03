package chapter14.step14;

public class ex7 {
	public static void main(String[] args) {
		try {
			int[] array = new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("number format exception");
		} catch (NegativeArraySizeException e) {
		System.out.println("negative array size exception");
		} catch(Exception e) {
			System.out.println("exception");
		}
	}
}
