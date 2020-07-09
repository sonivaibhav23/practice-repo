package vaibhav.practice.repo.searching.binary;

/**
 * 
 * Binary Search works on a sorted array.
 * 
 * Binary Search algorithm divides the input into half after every iteration.
 * 
 * Time complexity of Binary Search is 
 * 				
 * 		T(n) = T(n/2) + k
 * 
 * As per Master's theorem's second rule
 * 
 * When <br/>
 * 
 * 		T(n) = a T(n/b) + f(n) , where a >= 1 and b > 1
 * 
 * 						   c
 * 		if f(n) = Theta ( n  )
 * 
 * 		and c = log a
 * 				   b
							 c
 * 		then T(n) = Theta ( n  log n)
 * 
 * So here, in case of Binary Search we have c = 0 and log 1 = 0
 * 														  2
 * 
 * thus, c = log a
 * 				b
 * 															  0
 * So the time complexity of Binary Search is T(n) = Theta ( n  long n) => Theta (log n) => O(log n)
 * 
 * @author vaibhav.soni
 *
 */
public class BinarySearch {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 7, 12, 40 };

		int index = search(elements, 0, elements.length - 1, 5);

		if (index == -1) {
			System.out.println("Element Not found!!");
		} else {
			System.out.println("Element available at index : " + index);
		}
	}

	private static int search(int[] elements, int left, int right, int search) {
		if (left <= right) {
			int mid = (left + right) / 2;

			if (elements[mid] == search) {
				return mid;
			}

			if (elements[mid] > search) {
				return search(elements, left, mid - 1, search);
			}

			return search(elements, mid + 1, right, search);
		}
		return -1;
	}

}
