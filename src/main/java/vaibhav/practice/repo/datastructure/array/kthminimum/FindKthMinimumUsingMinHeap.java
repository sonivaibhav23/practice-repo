package vaibhav.practice.repo.datastructure.array.kthminimum;

public class FindKthMinimumUsingMinHeap {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 5, 7, 19, 2 };

		MinHeap minHeap = new MinHeap(arr, arr.length);
		int k = 5;

		for (int i = 0; i < k; i++) {
			int smallest = minHeap.extractMin();
			if (i == k - 1) {
				System.out.println("k (" + k + ") th smallest : " + smallest);
			}
		}
	}
}

class MinHeap {

	private int[] arr;
	private int heapSize;

	public int left(int i) {
		return 2 * i + 1;
	}

	public int right(int i) {
		return 2 * i + 2;
	}

	public MinHeap(int[] arr, int n) {
		this.arr = arr;
		heapSize = n;

		int i = (n - 1) / 2;

		while (i >= 0) {
			heapify(i);
			i--;
		}
	}

	public void heapify(int i) {
		int l = left(i);
		int r = right(i);
		int minIndex = i;

		if (l < heapSize && arr[l] < arr[minIndex]) {
			minIndex = l;
		}

		if (r < heapSize && arr[r] < arr[minIndex]) {
			minIndex = r;
		}

		if (minIndex != i) {
			swap(i, minIndex);
			heapify(minIndex);
		}
	}

	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public int extractMin() {
		int smallest = arr[0];
		arr[0] = arr[heapSize - 1];
		arr[heapSize - 1] = smallest;

		heapSize--;
		heapify(0);
		return smallest;
	}

	public void printArray() {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
