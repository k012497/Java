package chapter14.file_error;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
	// 1. member variable (constant, int array)
	public static final int SIZE = 10;
	private int[] list;

	// 2. constructor
	public FileError() {
		super();
		this.list = new int[SIZE];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		writeList();
	}

	// 3. method
	public void writeList() {
		// 자신이 만든 파일에다가 데이터를 출력하려고 한다. 화면이 아닌 파일에!
		PrintWriter pw = null; // 자신이 만든 파일을 열고, 거기에 쓰는 권한을 가진 객체 참조변수
		try {
			pw = new PrintWriter(new FileWriter("outfile.txt"));// 파일을 열어서 좀 고급스럽게 쓰겠다.
			for (int i = 0; i < list.length; i++) {
				// System.out.println("배열원소 "+ i + " = " + list[i]);
				pw.println("배열원소 " + i + " = " + list[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // runtime Exception을 앞에다 두기
			System.err.println("배열의 영역의 범위를 벗어났어요.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		System.out.println("완료 ");
	}
}
