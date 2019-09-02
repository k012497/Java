package chapter09.string_token;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTest {
	public static void main(StringTest[] args) {

		String[] strArray = null;
		String str = null;

		// input String
		Scanner scan = new Scanner(System.in);
		System.out.print("input string : ");
		str = scan.nextLine();

		StringTokenizer st = new StringTokenizer(str);
		strArray = new String[st.countTokens()]; // 문자열 개수만큼 배열 생성

		int i = 0;
		while (st.hasMoreTokens()) {
			strArray[i++] = st.nextToken();
			System.out.println(strArray[i - 1]);
		}
		System.out.println("잘린 문자열  총 " + st.countTokens() + "개 ");

		Arrays.sort(strArray); // null
		System.out.println("정렬 후 ");
		for (String s : strArray) {
			System.out.println(s);
		}
	}

}
