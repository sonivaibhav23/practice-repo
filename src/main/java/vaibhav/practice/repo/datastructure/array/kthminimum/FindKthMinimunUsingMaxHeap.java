package vaibhav.practice.repo.datastructure.array.kthminimum;

/**
 * <p>
 * Find K<sup>th</sup> smallest element using MaxHeap
 * </p>
 * <ol>
 * <li>Build MaxHeap of 0...(k - 1) elements</li>
 * <li>Now compare k...(n - 1) elements with root of MaxHeap.
 * <ol>
 * <li>if the value is less than root, then swap the value with root and heapify
 * the root</li>
 * <li>else ignore it</li>
 * </ol>
 * </li>
 * <li>Finally, the root element will be K<sup>th</sup> smallest element.</li>
 * </ol>
 */
public class FindKthMinimunUsingMaxHeap {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 5, 7, 19, 2 };
		int n = arr.length;
		int k = 4;

		MaxHeap maxHeap = new MaxHeap(arr, k);

		for (int i = k; i < n; i++) {
			if (maxHeap.arr[0] > maxHeap.arr[i]) {
				maxHeap.swap(0, i);
				maxHeap.heapify(0);
			}
		}

		System.out.println("K (" + k + ") th smallest elements : " + maxHeap.arr[0]);
	}

}

class MaxHeap {
	int[] arr;
	int heapSize;

	public MaxHeap(int[] arr, int n) {
		this.arr = arr;
		heapSize = n;
		int parent = parent(n);

		while (parent >= 0) {
			heapify(parent);
			parent--;
		}
	}

	public void heapify(int i) {
		int left = left(i);
		int right = right(i);
		int largest = i;

		if (left < heapSize && arr[left] > arr[largest])
			largest = left;
		if (right < heapSize && arr[right] > arr[largest])
			largest = right;

		if (i != largest) {
			swap(i, largest);
			heapify(largest);
		}
	}

	public int parent(int i) {
		return (i - 1) / 2;
	}

	public int left(int i) {
		return 2 * i + 1;
	}

	public int right(int i) {
		return 2 * i + 2;
	}

	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}