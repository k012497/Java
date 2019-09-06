package chapter15.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector vc = new Vector();
		MyClass mc = new MyClass(1);
		vc.add("HELLO WORLD"); // auto boxing
		vc.add(new Integer(10));
		vc.add(mc);
		vc.add(1, "HELLO");

		Iterator iter = vc.iterator();//Iterator 객체를 받는다. 
		while(iter.hasNext()) {
			Object ob = (Object)iter.next();
			if(ob instanceof MyClass) {
				MyClass mc1 =(MyClass)ob;
				System.out.println(mc1.number);
			}else
				System.out.println(ob);
		}
		System.out.println("----------------");

		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + ") " + vc.get(i));
		}
		
		
		System.out.println("=======after remove=============");
		vc.remove(0);

		int j = 0;
		for (Object obj : vc) {
			System.out.print((j++) + ") " + obj + " ");
		}
		
		vc.remove(new MyClass(1));
		System.out.println("\n=======after remove=============");
		vc.remove(0);

		j = 0;
		for (Object obj : vc) {
			System.out.print((j++) + ") " + obj + " ");
		}
	}

}
