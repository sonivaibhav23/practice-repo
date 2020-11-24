package vaibhav.practice.repo.datastructure.geeksforgeeks.array.search;

public class SearchElementInRotateArray {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
		int x = 9;

		SearchElementInRotateArray rotatedArray = new SearchElementInRotateArray();
		int i = rotatedArray.search(arr, x, 0, arr.length - 1);
		if (i < 0)
			System.out.println("Element Not Found!!!");
		else
			System.out.println("Element found at index " + i);
	}

	private int search(int[] arr, int x, int beg, int end) {
		if (beg == end && arr[beg] != x)
			return -1;

		int mid = (beg + end) / 2;

		if (arr[mid] == x)
			return mid;

		if (arr[mid] > x) {
			if (arr[beg] <= x)
				return search(arr, x, beg, mid - 1);
			return search(arr, x, beg, mid - 1);
		} else {
			if (arr[end] >= x)
				return search(arr, x, mid + 1, end);
			return search(arr, x, beg, mid - 1);
		}
	}

}