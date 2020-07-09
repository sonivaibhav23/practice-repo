package vaibhav.practice.repo.sorting.selection;

public class SelectionSort {

	public static void main(String[] args) {
		int[] elements = { 12, 11, 13, 5, 6, 7 };

		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(elements);

		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}

	private void sort(int[] elements) {

		for (int i = 0; i < elements.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < elements.length; j++) {
				if (elements[min] > elements[j]) {
					min = j;
				}
			}
			int temp = elements[i];
			elements[i] = elements[min];
			elements[min] = temp;
		}
	}
}
