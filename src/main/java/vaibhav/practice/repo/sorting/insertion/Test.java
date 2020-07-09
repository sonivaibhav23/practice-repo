package vaibhav.practice.repo.sorting.insertion;

public class Test {

	public static void main(String[] args) {
		int[] elements = { 10, 5, 7, 1, 12 };

		int[] sortedElements = sortElements(elements);
		
		for(int i : sortedElements) {
			System.out.println(i);
		}
	}

	private static int[] sortElements(int[] elements) {

		for (int i = 0; i < elements.length - 1; i++) {
			int element = elements[i];
			
			int j = i - 1;
			
			while(j >= 0 && elements[j] > element) {
				elements[j+1] = elements[j];
				j--;
			}
			elements[j+1] = element;
		}

		return elements;
	}

}