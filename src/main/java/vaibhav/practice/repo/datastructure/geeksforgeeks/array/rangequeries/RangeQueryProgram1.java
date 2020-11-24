package vaibhav.practice.repo.datastructure.geeksforgeeks.array.rangequeries;

public class RangeQueryProgram1 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 1, 3, 4, 5, 2, 8 };
		int[][] query = { { 1, 4 }, { 0, 3 }, { 1, 2 } };

		int[] count = new int[query.length];

		for (int itrQuery = 0; itrQuery < query.length; itrQuery++) {
			for (int start = query[itrQuery][0]; start <= query[itrQuery][1]; start++) {
				count[itrQuery] += arr[start];
			}
		}

		print(query, count);
	}

	public static void print(int[][] query, int[] count) {
		for (int i = 0; i < count.length; i++) {
			System.out.println("{" + query[i][0] + ", " + query[i][1] + "} - " + count[i]);
		}
	}
}