package chapter09.step9;

public class PersonTest {

	public static void main(String[] args) {
		Person[] array = {new Person("Kim", 153), new Person("Lee", 183), new Person("Park", 173)};
		Person maxPerson = getMaximum(array);
		
		System.out.println("키가 가장 큰 사람은  "+maxPerson.name);
		
		}

	private static Person getMaximum(Person[] array) {
		// 1. 제일 쉬운 방법 
		Person max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(max.height < array[i].height) max = array[i];
		}
		
		//2. 어려운 방법 
//		Person max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			int number = max.compareTo(array[i]);
//			if(number == -1) max = array[i]; // 둘 중 뒤에 것이 더 크면 최대값 교체  
//		}
	
		return max;
	}

}
