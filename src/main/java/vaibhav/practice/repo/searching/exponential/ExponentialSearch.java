package vaibhav.practice.repo.searching.exponential;

public class ExponentialSearch {

	public static void main(String[] args) {

		int[] elements = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };

		int index = search(elements, elements.length - 1, 2);

		if (index == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element available at index : " + index);
		}
	}

	private static int search(int[] elements, int size, int search) {

		int subsetSize = 1;

		while (search > elements[subsetSize]) {
			subsetSize = subsetSize * 2 > size ? size : subsetSize * 2;
		}

		int startIndex = subsetSize / 2;

		while (startIndex <= subsetSize) {
			if (elements[startIndex] == search) {
				return startIndex;
			}
			startIndex++;
		}

		return -1;
	}
}
