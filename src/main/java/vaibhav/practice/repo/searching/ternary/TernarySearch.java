package vaibhav.practice.repo.searching.ternary;

public class TernarySearch {

	public static void main(String[] args) {

		int[] elements = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };

		int index = search(elements, 0, elements.length - 1, 21);

		if (index == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element available at index : " + index);
		}
	}

	private static int search(int[] elements, int start, int end, int search) {
		if (start <= end && elements[start] <= search && elements[end] >= search) {

			int mid1 = start + (end - start) / 3;
			int mid2 = mid1 + ((end - start) / 3);

			if (elements[mid1] == search)
				return mid1;

			if (elements[mid2] == search)
				return mid2;

			if (search < elements[mid1])
				return search(elements, start, mid1 - 1, search);

			if (search > elements[mid2])
				return search(elements, mid2 + 1, end, search);

			return search(elements, mid1 + 1, mid2 - 1, search);
		}
		return -1;
	}

}
