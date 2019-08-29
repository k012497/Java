package chapter09.compare_object;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10, 20);
		Rectangle rec2 = new Rectangle(20, 10);
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(5);

		print(rec1);
		print(rec2);
		int returnValue = rec1.compareTo(rec2);
		switchFunction(returnValue,"Rectangle 1", "Rectangle 2");
		
		System.out.println("----------------------------------------");
		
		print(c1);
		print(c2);
		returnValue = c1.compareTo(c2);
		switchFunction(returnValue, "Circle1", "Circle2");

//		if(rec1.compareTo(rec2) == 0) System.out.println("두 객체는 같습니다.");
//		else if(rec1.compareTo(rec2) == 1) System.out.println("1번 객체가 더 큽니다.");
//		else if(rec1.compareTo(rec2) == -1) System.out.println("2번 객체가 더 작습니다.");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void switchFunction(int returnValue, String str1, String str2) {
		switch (returnValue) {
		case 0:
			System.out.println(str1+", "+str2+"는 같습니다.");
			break;
		case 1:
			System.out.println(str1+" 객체가 더 큽니다.");
			break;
		case -1:
			System.out.println(str2+" 객체가 더 큽니다.");
			break;

		default:
			break;
		}
	}

}
