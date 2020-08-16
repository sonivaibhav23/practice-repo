package vaibhav.practice.repo.searching.interpolation;

/**
 * 
 * Formula to find index in interpolation search is
 * 
 * 
 * 						/ 					(endIndex - startIndex)  				  	   \
 * 	pos = startIndex + (  ----------------------------------------------------------------  ) * (searchElement - arrayToBeSearched[startIndex])
 * 						\  ( arrayToBeSearched[endIndex] - arrayToBeSearched[startIndex] ) /
 * 
 * 
 * @author vaibhav.soni
 *
 */

public class InterpolationSearch {

	public static void main(String[] args) {

		int[] elements = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

		int index = search(elements, 0, elements.length - 1, 144);

		if (index == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element available at index : " + index);
		}
	}

	private static int search(int[] elements, int start, int end, int search) {
		if (start <= end && search >= elements[start] && search <= elements[end]) {
			int pos = start + (int) (((double)(end - start) / (elements[end] - elements[start])) * (search - elements[start]));

			if (search == elements[pos]) {
				return pos;
			}

			if (search > elements[pos]) {
				return search(elements, pos + 1, end, search);
			}
			return search(elements, start, pos - 1, search);
		}
		return -1;
	}
}
