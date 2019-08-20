package chapter03;

public class ToBinary2 {

	public static void main(String[] args) {
		int number = 0;
		
		for(int i = 1 ; i<=10 ; i++) {
			number = (int)(Math.random()*(150-50+1)+50);
			System.out.println(i + "번 " + number +" : "+ toBinaryString(number));
		}

	}
	
	public static String toBinaryString (int num) {
		String strValue = "";
		while(strValue.length() < 16) {
			strValue = "0" + strValue;
		}
		
		return strValue;
	}

}
