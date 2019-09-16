package chapter17.step17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Example7 {

	public static void main(String[] args) throws IOException {
	      FileReader fr = new FileReader("ex7.txt");
	      BufferedReader br = new BufferedReader(fr);
	      
	      ArrayList<Double> al = new ArrayList<Double>();
	      String str=null;
	      double number = 0;
	      
	      while((str = br.readLine())!=null) {
	      number = Double.parseDouble(str);
	      al.add(number);
	      }
	      
	      Collections.sort(al);
	      
	      FileWriter fw = null;
	      BufferedWriter bw = null;
	      
	      fw = new FileWriter("ex7_output.txt");
	      bw = new BufferedWriter(fw);
	      
	      //인테저값을 스트링으로 변환 후 쓰기
	      for(double value : al) {
	         if(value%1==0) {
	            bw.write(String.valueOf((int)(value))+"\n");
	         }
	         else {
	         bw.write(String.valueOf(value)+"\n");}
	      }
	     
	      System.out.println("COMPLETE");
	      if(br!=null) {
	         br.close();
	      }
	      if(bw!=null) {
	         bw.close();
	      }
	      
	}
	
}

	      
