package vaibhav.practice.repo.datastructure.geeksforgeeks.array.rotation;

public class ArrayRotationUsingJugglingAlgo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		ArrayRotationUsingJugglingAlgo arrayRotation = new ArrayRotationUsingJugglingAlgo();
		int d = 3;
		arrayRotation.rotateLeft(arr, d, arr.length);
		System.out.println("Rotated Array by " + d);
		arrayRotation.printArray(arr);
	}

	public void rotateLeft(int[] arr, int d, int n) {
		d = d % n;

		int gcd = gcd(n, d);

		for (int i = 0; i < gcd; i++) {
			int j = i;
			int temp = arr[i];

			while (true) {
				int k = j + d;

				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
