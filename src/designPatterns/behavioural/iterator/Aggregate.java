package designPatterns.behavioural.iterator;


//Aggregate interface
public interface Aggregate<T> {
	Iterator<T> createIterator();

}
