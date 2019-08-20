package chapter04;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
	
		Arrays.sort(array);
		System.out.println("array1 = " + Arrays.toString(array));
		
		int index = Arrays.binarySearch(array, 3);   // 배열에서 값이 searchKey 요소 검색
        
        if( index < 0){
            System.out.println("해당 숫자가 없습니다.");
        }else{
            System.out.println("해당 키워드는 array[" + index + "]에 있습니다.");
        }
		
	}

}
