package vaibhav.practice.repo.searching.jump;

public class JumpSearch {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 7, 12, 40 };

		int index = search(elements, elements.length - 1, 40);

		if (index == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element available at index : " + index);
		}
	}

	private static int search(int[] elements, int size, int search) {
		int jump = (int) Math.sqrt(elements.length);
		int startIndex = 0;
		int endIndex = jump;

		while (endIndex < size && search > elements[endIndex]) {
			startIndex = startIndex + jump < size ? startIndex + jump : size;
			endIndex = endIndex + jump < size ? endIndex + jump : size;
		}

		while (startIndex <= endIndex) {
			if (elements[startIndex] == search) {
				return startIndex;
			}
			startIndex++;
		}

		return -1;
	}

}
