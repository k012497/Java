package chapter09.string_token;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		String str = new String("By doubting /we come at the truth");
//		StringTokenizer st = new StringTokenizer(str); // 명시 안 하면 공백을 기준으로 자름
		StringTokenizer st = new StringTokenizer(str, "/"); // /를 기준으로 자르고 싶을 때 

		int i = 0;
		while (st.hasMoreTokens()) {
			strArray[i++]= st.nextToken();
			System.out.println(strArray[i-1]);

			//System.out.println(st.nextToken());
		}
	}
}
