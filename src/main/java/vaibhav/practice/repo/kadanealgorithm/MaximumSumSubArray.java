package vaibhav.practice.repo.kadanealgorithm;

import java.text.MessageFormat;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int[] randomArray = {-1, -2, 3, -4, 5, -1, 2, -3};
		findSubArrayWithMaximumSum(randomArray);
	}

	private static void findSubArrayWithMaximumSum(int[] randomArray) {
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < randomArray.length; i++) {
			maxEndingHere += randomArray[i];

			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}

			if (maxEndingHere < 0) {
				maxEndingHere = 0;
				s = i + 1;
			}
		}

		System.out.println(MessageFormat.format("Sub Array with max array : {0} starting from : {1} to : {2}", maxSoFar,
				start, end));
	}
}
