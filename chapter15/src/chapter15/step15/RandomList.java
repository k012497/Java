package chapter15.step15;

import java.util.ArrayList;

public class RandomList<T> {
	ArrayList<T> list;

	public RandomList() {
		super();
		this.list = new ArrayList<>();;
	}

	public void add(T item) {
		list.add(item);
	}

	public T select() {
		int i = (int) (Math.random() * (list.size()));
		return list.get(i);
	}
}
