package chapter17.copy_line2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLineTest {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		BufferedWriter bufferedWriter = null;


		// declare object reading data
//		File file1 = new File("input.txt");
//		fileReader = new FileReader(file1);
		fileReader = new FileReader("input.txt");
		bufferedReader = new BufferedReader(fileReader);

		// declare object saving data
//		File file2 = new File("output4.txt");
//		fileWriter = new FileWriter(file2);
		fileWriter = new FileWriter("output4.txt");
		bufferedWriter = new BufferedWriter(fileWriter);
		printWriter = new PrintWriter(fileWriter);
		
		String data = null;
		while ((data = bufferedReader.readLine()) != null) {
			printWriter.println(data);
		}
		System.out.println("COMPLETE");

		if (bufferedReader != null) bufferedReader.close();
		if (printWriter != null) printWriter.close();

	}

}
