package designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

//Concrete Aggregate implementation
public class MyCollection<T> implements Aggregate<T> {
	private List<T> items = new ArrayList<>();

	public void addItem(T item) {
		items.add(item);
	}

	@Override
	public Iterator<T> createIterator() {
		return new ListIterator<>(items);
	}

}
