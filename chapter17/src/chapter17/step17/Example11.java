package chapter17.step17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream f1 = new FileInputStream("ex10_1.txt");
		FileInputStream f2 = new FileInputStream("ex10_2.txt");

		Scanner s1 = new Scanner(f1);
		Scanner s2 = new Scanner(f2);

		String str1 = null;
		String str2 = null;
		while (s1.hasNext() || s2.hasNext()) {
			str1 = s1.next();
			str2 = s2.next();
			System.out.print(str1 + "와(과) ");
			System.out.print(str2 + "은(는) ");
			if (str1.equals(str2)) {
				System.out.println("같습니다. ");
			} else {
				System.out.println("다릅니다. ");
			}

		}
	}
}
