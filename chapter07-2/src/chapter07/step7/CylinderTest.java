package chapter07.step7;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		
		System.out.println(obj2.getRadius());
		System.out.println(obj2.getArea());
		System.out.println(obj2.getVolume());
		System.out.println(obj2.getHeight());

	}

}
