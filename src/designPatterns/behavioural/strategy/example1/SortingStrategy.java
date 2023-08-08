package designPatterns.behavioural.strategy.example1;

//SortingStrategy interface
@FunctionalInterface
public interface SortingStrategy {
	void sort(int[] array);
}
