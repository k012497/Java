package chapter05.numberbox;

public class NumberBoxTest {

	public static void main(String[] args) {
		NumberBox box= new NumberBox(10, 1.2345f);
		
		System.out.println(box.getIvalue());
		System.out.println(box.getFvalue());
		
		box.setIvalue(20);
		box.setFvalue(5.435f);
		
		System.out.println(box.getIvalue());
		System.out.println(box.getFvalue());
		
		System.out.println(box.multiFunc());
		
	}

}
