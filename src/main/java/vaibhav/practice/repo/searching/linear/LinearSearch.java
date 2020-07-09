package vaibhav.practice.repo.searching.linear;

/**
 * Time Complexity of linear search algorithm is of O(n).
 * 
 * @author vaibhav.soni
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int[] elements = { 40, 5, 1, 12, 7 };

		int index = search(elements, 12);

		if (index == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element available at index : " + index);
		}
	}

	private static int search(int[] elements, int search) {

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == search) {
				return i;
			}
		}
		return -1;
	}

}
