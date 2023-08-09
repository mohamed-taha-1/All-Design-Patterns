package designPatterns.behavioural.iterator;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> provides a way to access the elements of a collection (like an array,
		 * list, or tree) sequentially.
		 * 
		 * 
		 * <T> It defines an interface for traversing the elements of a collection and
		 * allows you to iterate over the collection's elements in a consistent and
		 * standardized way.
		 * 
		 * 
		 * 
		 **/

		MyCollection<String> collection = new MyCollection<>();
		collection.addItem("Item 1");
		collection.addItem("Item 2");
		collection.addItem("Item 3");

		Iterator<String> iterator = collection.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
