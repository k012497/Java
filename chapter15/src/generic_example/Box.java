package generic_example;

public class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;}
	public T get() {
		return ob;}
	
	public static void outBox(Box<Toy> box) {
		box.get();
		box.set(new Toy());
	}
}

