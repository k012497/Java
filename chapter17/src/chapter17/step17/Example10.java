package chapter17.step17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example10 {
	public static void main(String[] args) throws IOException {
	FileReader fr1 = new FileReader("ex10_1.txt");
	BufferedReader br1 = new BufferedReader(fr1);
	FileReader fr2 = new FileReader("ex10_2.txt");
	BufferedReader br2 = new BufferedReader(fr2);
	
	FileWriter fw = new FileWriter("ex10_output.txt");
	
	PrintWriter printWriter = new PrintWriter(fw);
	
	String data = null;
	while((data = br1.readLine()) != null) {
		printWriter.println(data);
	}
	
	while((data = br2.readLine()) != null) {
		printWriter.println(data);
	}
	
	if(br1 != null) br1.close();
	if(br2 != null) br2.close();
	if(printWriter != null) printWriter.close();
	
	}	
}
	
