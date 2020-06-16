package vaibhav.practice.repo.sorting.insertion;

public class InsertionSort {

    public static void main(String[] args) {
        int[] elements = {10, 8, 12, 13, 2, 1};
        printElement("Elements : ", elements);
        int[] sortedElements = sortElements(elements);
        printElement("Sorted Elements : ", sortedElements);
    }

    private static void printElement(String message, int[] elements) {
        System.out.printf(message + "[ ");
        for (int element : elements) {
            System.out.printf(element + " ");
        }
        System.out.println("]");
    }

    private static int[] sortElements(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int currentValue = elements[i];

            // if i-1 th element is greater than currentValue,
            // then place the current element in the right place in 0...n-1 elements array
            int j = i - 1;
            while (j >= 0 && elements[j] > currentValue) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = currentValue;
        }
        return elements;
    }
}
