package chapter05;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("red", 2, 80);

		System.out.println(car1.getColor());
		System.out.println(car1.getGear());
		System.out.println(car1.getSpeed());
		
		car1.changeGear(4);
		car1.speedUp();
		car1.speedUp();
		car1.speedDown();
		
		System.out.println(car1.getColor());
		System.out.println(car1.getGear());
		System.out.println(car1.getSpeed());
	}

}
