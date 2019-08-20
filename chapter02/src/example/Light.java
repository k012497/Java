package example;

public class Light {

	public static void main(String[] args) {
		// 1. 변수 선언
		long lightspeed = 0L;
		long distance = 0L;

		// 2. 상수값을 선언
		lightspeed = 300_000L; // 콤마 연산자를 쓸 순 없으니
		distance = lightspeed * 365 * 24 * 60 * 60; // L이 하나만 있으면 ㄱㅊ . 정수+*-/정수=정수로 나오니까 ?

		// 3. 출력
		System.out.println(distance);
		System.out.printf("%d", distance);

	}

}
