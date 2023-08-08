package designPatterns.behavioural.strategy.example1;

// BubbleSort algorithm
public class BubbleSort implements SortingStrategy {
	@Override
	public void sort(int[] array) {
		if (array == null || array.length <= 1) {
			return; // Base case: Array is already sorted or empty
		}

		int n = array.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap elements if they are in the wrong order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}

			// If no two elements were swapped in the inner loop, the array is already
			// sorted
			if (!swapped) {
				break;
			}
		}
	}

}
