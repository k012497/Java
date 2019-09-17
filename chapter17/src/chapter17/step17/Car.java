package chapter17.step17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import chpater17.object_stream.Student;

public class Car implements Serializable {
	public String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car myCar = new Car("Jeep");
		File file = new File("Car.obj");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(myCar);
		
		System.out.println("끝");
		if(oos != null) oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car car = (Car)ois.readObject();
		
		System.out.println(car);
		
	}
}
