package vaibhav.practice.repo.datastructure.array.rotation;

public class ArrayRotationWithNewArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		ArrayRotationWithNewArray arrayRotation = new ArrayRotationWithNewArray();
		arr = arrayRotation.rotateLeft(arr, 2, arr.length);
		arrayRotation.printArray(arr);
	}

	public int[] rotateLeft(int[] arr, int d, int n) {
		int[] temp = new int[n];
		int index = 0;

		for (int i = d; i < n; i++) {
			temp[index++] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			temp[index++] = arr[i];
		}

		return temp;
	}

	public void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
