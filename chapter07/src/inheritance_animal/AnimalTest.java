package inheritance_animal;

public class AnimalTest {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		lion.sleep();
		lion.roar();
		System.out.println("------------------");
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}
}
