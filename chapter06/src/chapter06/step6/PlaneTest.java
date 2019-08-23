package chapter06.step6;

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane("AirBus", "A878", 400);
		
		System.out.println(p2.getCompany());
		System.out.println(p2.getModel());
		System.out.println(p2.getMaxPassenger());
		System.out.println(p1.getMaxPassenger());
		
		System.out.println(Plane.getPlanes());
	
	}
}
