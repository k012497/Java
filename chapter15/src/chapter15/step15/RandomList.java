package chapter15.step15;

import java.util.ArrayList;

public class RandomList<T> {
	ArrayList<T> list;

	public RandomList(ArrayList<T> list) {
		super();
		this.list = list;
	}

	public void add(T item) {
		list.add(item);
	}

	public T select() {
		int i = (int) (Math.random() * (list.size()));
		return list.get(i);
	}
}
