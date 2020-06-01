package vaibhav.practice.repo.kadanealgorithm;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		int[] randomArray = {-1, -2, 3, -4, 5, -1, 2, -3};
		findSubArrayWithMaximumSum(randomArray);
	}

	private static void findSubArrayWithMaximumSum(int[] randomArray) {
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;

		for (int i = 0; i < randomArray.length; i++) {
			maxEndingHere = maxEndingHere + randomArray[i];

			if (maxEndingHere < 0)
				maxEndingHere = 0;
			else if (maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
		}

		System.out.println(maxEndingHere);
		System.out.println(maxSoFar);
	}
}
