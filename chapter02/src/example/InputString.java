package example;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		String name = "";
		int age = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.print("이름을 입력하시오: ");
		//name = input.nextLine(); //개행도 한 줄로 인식하여 입력 받음 
		name = input.next(); //개행문자, 공백은 무
		
		System.out.print("나이를 입력하시오: ");
		age = input.nextInt();
		
		System.out.println(name + "님 안녕하세요! " + (age) + "살이시네요.");

	}

}
