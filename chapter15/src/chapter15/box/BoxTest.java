package chapter15.box;

public class BoxTest {

	public static void main(String[] args) throws Exception{
		Box<String, Integer> b1 = new Box<String, Integer>("SOJIN", 30);
		String strName = b1.getData1(); //하향 형변환 필요 없
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
		

	}

}
