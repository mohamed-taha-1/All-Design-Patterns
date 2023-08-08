package designPatterns.behavioural.strategy.example1;

//MergeSort algorithm
public class MergeSort implements SortingStrategy {
	@Override
	public void sort(int[] array) {
		if (array == null || array.length <= 1) {
			return; // Base case: Array is already sorted or empty
		}

		int n = array.length;
		int[] temp = new int[n];
		mergeSortHelper(array, temp, 0, n - 1);
	}

	private static void mergeSortHelper(int[] array, int[] temp, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSortHelper(array, temp, left, mid); // Sort left half
			mergeSortHelper(array, temp, mid + 1, right); // Sort right half
			merge(array, temp, left, mid, right); // Merge the two sorted halves
		}
	}

	private static void merge(int[] array, int[] temp, int left, int mid, int right) {
		for (int i = left; i <= right; i++) {
			temp[i] = array[i]; // Copy elements to the temporary array
		}

		int i = left; // Pointer for the left subarray
		int j = mid + 1; // Pointer for the right subarray
		int k = left; // Pointer for the merged array

		while (i <= mid && j <= right) {
			if (temp[i] <= temp[j]) {
				array[k] = temp[i]; // Copy the smaller element from the left subarray
				i++;
			} else {
				array[k] = temp[j]; // Copy the smaller element from the right subarray
				j++;
			}
			k++;
		}

		// Copy remaining elements from the left subarray, if any
		while (i <= mid) {
			array[k] = temp[i];
			i++;
			k++;
		}

		// Copy remaining elements from the right subarray, if any
		while (j <= right) {
			array[k] = temp[j];
			j++;
			k++;
		}
	}
}
