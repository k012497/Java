package chapter17.step17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example11_2 {

	public static void main(String[] args) throws IOException {

		FileInputStream f1 = new FileInputStream("ex10_1.txt");
		FileInputStream f2 = new FileInputStream("ex10_2.txt");

		int data1 = 0;
		int data2 = 0;

		while (true) {
			data1 = f1.read();
			data2 = f2.read();

			// 길이가 다르거나 값이 다른 경우
			if ((data1 * data2) < 0 || data1 != data2) {
				System.out.println("불일치 ㅠㅠ");
				break;
			}

			// 길이가 같고 값이 같은 경우
			if (data1 == -1 && data1 == data2) {
				System.out.println("THEY ARE EXACTLY SAME");
				break;
			}

		}
	}
}
