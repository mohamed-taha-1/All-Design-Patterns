package designPatterns.behavioural.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
	private List<T> items;
	private int position = 0;

	public ListIterator(List<T> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return position < items.size();
	}

	@Override
	public T next() {
		T item = items.get(position);
		position++;
		return item;
	}
}
