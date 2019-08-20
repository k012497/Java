package chapter04;

public class Histogram {
	public static final int COUNT = 10;
	
	public static void main(String[] args) {
		int[] arr = new int[COUNT]; //객체 만들면 값 안 줘도 디폴트값이 들어간다. 
		String[] count = {"", "", "", "", "", "", "", "", "", ""};

		//배열에 1~100의 난수 넣기 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (100 - 1 + 1) + 1);
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {
			count[(arr[i]-1)/10] += "*";	
		}

//		for (int i = 0; i < count.length; i++) {
//			for (int j = 0; j < count.length; j++) {
//				if (arr[i] >= ((10*j)+1) && arr[i] <= (10*(j+1))) count[j] += "*";
//			}
//		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(((10*i)+1) + " - " + ( 10 * (i+1)) + " : " + count[i]);
		}
		
	}
}
