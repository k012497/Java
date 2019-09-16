package chpater17.copy_file2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("input.txt");
			fw = new FileWriter("output2.txt");
		} catch (IOException e) {}
		
		int data = 0;
		try {
			while((data = fr.read()) != -1) {
				fw.write(data);;
			}
		} catch (IOException e) {
		}
		
		System.out.println("COMPLETE");
		
		if(fr != null) {
			try {
				fr.close();
			} catch (IOException e) {}
		}
		if(fw != null) {
			try {
				fw.close();
			} catch (IOException e) {}
		}
	}

}
