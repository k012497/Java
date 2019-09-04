package chapter15.box;

public class BoxTest {

	public static void main(String[] args) throws Exception{
		Box<String, Integer> b1 = new Box<String, Integer>("SOJIN", 30);
		String strName = b1.getData1(); //하향 형변환 필요 없다 
		Integer num = b1.getData2();
//		System.out.println(strName);
//		
//		Box<Integer> b2  = new Box<Integer>(1234); //이것도 된다 ??
//		System.out.println((Integer)b2.getData());
//		
//		Box<Integer> b3 = new Box<Integer>(new Integer(60));
//		Integer num1 = (Integer)b3.getData();
//		System.out.println(num1);
//		
//		Box<MyData> b4 = new Box<MyData>(new MyData("싸다김밥 "));
//		MyData md = (MyData)b4.getData();
//		
//		System.out.println(md.str);
		
		//swap method test
		String[] str1 = {"grape", "peach", "apple"};
		for (String str2 : str1) {
			System.out.print(str2 + " "); 
		}
		System.out.println("");
		
		Box.swap(str1, 0, 2);
		for (String str2 : str1) {
			System.out.print(str2 + " "); 
		}
		System.out.println("");
		
		
		MyData[] md = {new MyData("first"), new MyData("second"), new MyData("third")};
		for (MyData md1 : md) {
			System.out.print(md1.str + " "); 
		}
		System.out.println("");
		
		Box.swap(md, 0, 2);
		for (MyData md1 : md) {
			System.out.print(md1.str + " "); 
		}
		System.out.println("");
		
		//getLast method test
		String strLast = Box.<String>getLast(str1);
		System.out.println(strLast);
	
		MyData mdLast = Box.<MyData>getLast(md);
		System.out.println(mdLast.str);
		System.out.println();
		
		//printArray method test
		Integer[] iArray = {10, 20, 30, 40, 50};
		Box.printArray(iArray); //형변환 안 해도 나와버린다 ? 왜 나오지 
		System.out.println();

		String[] str3 = {"aaa", "bbb", "ccc", "ddd"};
		Box.printArray(str3);
		System.out.println();
		
		Box.printArray(md);
		
	}

}
