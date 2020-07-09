package vaibhav.practice.repo.sorting.merge;

/**
 * mergeSort(arr[], l, r)
 * 
 * {
 * 
 * if(l < r) mid = l + r / 2;
 * 
 * mergeSort(arr[], l, mid)
 * 
 * mergeSort(arr[], mid + 1,r)
 * 
 * merge(arr[], l, mid, r)
 * 
 * }
 */

public class MergeSort {

	public static void main(String[] args) {
		int[] elements = { 12, 11, 13, 5, 6, 7 };

		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(elements, 0, elements.length - 1);

		System.out.println("Sorted elements: ");
		for (int i = 0; i < elements.length; i++)
			System.out.println(elements[i]);

	}

	private void mergeSort(int[] elements, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;

			mergeSort(elements, l, mid);
			mergeSort(elements, mid + 1, r);

			merge(elements, l, mid, r);
		}
	}

	private void merge(int[] elements, int l, int mid, int r) {
		// find sizes of two sub arrays
		int n1 = mid - l + 1;
		int n2 = r - mid;

		// create two temp arrays
		int[] left = new int[n1];
		int[] right = new int[n2];

		// Initialise both arrays
		for (int i = 0; i < n1; ++i)
			left[i] = elements[l + i];

		for (int j = 0; j < n2; ++j)
			right[j] = elements[mid + 1 + j];

		// Initialise start index of both arrays
		int i = 0;
		int j = 0;

		// Initialise merge array start index
		int k = l;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				elements[k++] = left[i++];
			} else {
				elements[k++] = right[j++];
			}
		}

		// copying remaining elements of left array
		while (i < n1) {
			elements[k++] = left[i++];
		}
		while (j < n2) {
			elements[k++] = right[j++];
		}
	}

}
