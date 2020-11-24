package vaibhav.practice.repo.datastructure.geeksforgeeks.array.rotation;

public class ArrayRotationUsingSameArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ArrayRotationUsingSameArray arrayRotation = new ArrayRotationUsingSameArray();
		arrayRotation.rotateLeft(arr, 2, arr.length);
		arrayRotation.printArray(arr);
	}

	public void rotateLeft(int[] arr, int d, int n) {
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < n - 1; j++) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}

	public void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
