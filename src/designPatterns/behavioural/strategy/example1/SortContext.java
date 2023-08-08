package designPatterns.behavioural.strategy.example1;

public class SortContext {
	private SortingStrategy sortingStrategy;

	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}

	public void sortArray(int[] array) {
		sortingStrategy.sort(array);
	}
}
