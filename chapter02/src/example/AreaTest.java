package example;

public class AreaTest {

	public static void main(String[] args) {
		//1. 변수명을 선언한다 (double - Radius, Area)
		//2. 반지름 5 할당 
		//3. 면적을 계산한다 (반지름 * 반지름 * 3.141592)
		//4. 면적과 반지름 출력(println, printf)
		double radius = 0.0;
		double area = 0.0;
		
		radius = 5;
		area = radius * radius * 3.141592;
		
		//System.out.println(""+area);
		System.out.println(area);
		System.out.printf("%f", area);

	}

}
