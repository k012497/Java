package chapter17.step17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Example9 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("ex9.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("ex9_output.txt");	
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		
		String str = null;
		int i = 0;
		while((str = br.readLine()) != null) {
			pw.printf("%6d:", i+1);
			pw.println(str);
			i++;
		}
		System.out.println("COMPLETE");
		
		if(br != null) br.close();
		if(bw != null) bw.close();
	}

}
