package vaibhav.practice.repo.sorting.quick;

/**
 * sort array -> 10, 2, 5, 14, 1
 * <p>
 * Select a pivot element, ->
 * <p>
 * 1. here i am selecting the last element as pivot element,
 * and at the end of iteration pivot element should be at its correct position
 *<p>
 * So move all the elements which are smaller than pivot to left and all the elements
 * which are greater to pivot to right.
 *<p>
 * So this step will put the pivot element at its correct position.
 *<p>
 * Pseudo code for quicksort algorithm
 *<code>
 * quicksort(elements, left, right)
 * {
 *     if(left < right)
 *     {
 *         int pivot = partition(elements, left, right -1);
 *         quicksort(elements, left, pivot - 1);
 *         quicksort(elements, pivot + 1, right);
 *     }
 * }
 * </code>
 *<code>
 * partition(elements, left, right) {
 *     int pivot = elements[right];
 *
 *     int i = left - 1;
 *
 *     for(int j=left; j < right; j++) {
 *         if(elements[j] < pivot) {
 *             i++;
 *             swap(elements[j], elements[i]);
 *         }
 *     }
 *     swap(elements[i+1], pivot);
 *     return i + 1;
 * }
 *</code>
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Pass 1:
 * quicksort(elements, 0, 4)
 * 10, 2, 5, 14, 1
 *
 * partition(elements, 0, 4) {
 *      pivot = 1
 *      i= -1; => j = 0; 10 < 1; => j = 1; 2 < 1 => j=2; 5 < 1; => j = 3; 14 < 1 => j = 4; 1 < 1
 *
 *      element[0] = pivot = 1 & element[4] = 10
 *
 *      1, 2, 5, 14, 10
 * }
 *
 * pivotIndex = 0;
 * quicksort(0, -1) -> X
 * quicksort(1, 4)
 *
 * Pass 2:
 * quicksort(1, 4)
 * elements -> 1, 2, 5, 14, 10
 * pivot = 10
 *
 * i = 0, j = 1 -> 2 < 10 -> i++ => i = 1, swap(2, 2) -> no change
 * i = 1, j = 2 => 5 < 10 -> i++ => i = 2, swap(2, 2) -> no change
 * i = 2, j = 3 => 14 < 10
 * i=2, j =4 => 10 < 10
 *
 * swap(element [i+1], pivot) => swap(elements [3], 10) => 1, 2, 5, 10, 14
 *
 * pivotIndex = 3
 *
 * quicksort(1, 2)
 * quicksort(4, 4) -> X
 *
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] elements = {14, 10, 5, 2, 1};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(elements, 0, elements.length - 1);

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    private void sort(int[] elements, int left, int right) {
        if (left < right) {
            int pivot = partition(elements, left, right);
            sort(elements, left, pivot - 1);
            sort(elements, pivot + 1, right);
        }
    }

    private int partition(int[] elements, int left, int right) {
        int pivot = elements[right];
        int i = left - 1;
        for (int j = left; j <= right; j++) {
            if (elements[j] < pivot) {
                i++;
                swap(elements, j, i);
            }
        }
        swap(elements, i + 1, right);
        return i + 1;
    }

    private void swap(int[] elements, int first, int second) {
        int temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }
}
