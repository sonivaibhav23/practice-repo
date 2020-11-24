package vaibhav.practice.repo.datastructure.geeksforgeeks.array.rotation;

public class ArrayRotationUsingReversalAlgorithm {

	public static void main(String[] args) {
		ArrayRotationUsingReversalAlgorithm rotation = new ArrayRotationUsingReversalAlgorithm();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, 0, -4 };
		int d = 3;
		rotation.rotateLeft(arr, d, arr.length);
		System.out.println("Rotated Array by " + d);
		rotation.printArray(arr);
	}

	private void rotateLeft(int[] arr, int d, int n) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	private void reverse(int[] arr, int beg, int end) {
		while (beg <= end) {
			int temp = arr[beg];
			arr[beg] = arr[end];
			arr[end] = temp;
			beg++;
			end--;
		}
	}

	public void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
