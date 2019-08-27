package chapter07.dynamic_call;

public class DynamicCallTest {
	public static void main() {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		// 왜 출력 안 됨 ???
		Animal obj;
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();
	}
}
