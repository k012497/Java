package chapter07.car;

public class CarTest {

	public static void main(String[] args) {
		Car firstcar = new Car("HMW520");
		Car secondcar = new Car("HMW520");
		if(firstcar.equals(secondcar)) {
			System.out.println("동일한 종류의 차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다. ");
		}

	}

}
