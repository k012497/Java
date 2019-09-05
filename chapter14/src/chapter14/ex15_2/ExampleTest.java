package chapter14.ex15_2;

public class ExampleTest {

	public static void main(String[] args) {
		int[] numArray = {10, 20, 30, 40};
		try {
			boolean answer = searchArray(numArray, 21);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static boolean searchArray(int[] numArray, int number) throws NotFoundException {
		for (int j = 0; j < numArray.length; j++) {
			if(numArray[j] == number) return true;
		}
		throw new NotFoundException("찾을 수 없어요 ㅠ");
		//return false; //throw 로 보냈으니 리턴있으면 안 됨
	}


}
