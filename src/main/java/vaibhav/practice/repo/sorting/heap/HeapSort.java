package vaibhav.practice.repo.sorting.heap;

public class HeapSort {

    public static void main(String[] args) {
        int[] elements = {10, 4, 12, 9, 11};

        HeapSort heapSort = new HeapSort();
        heapSort.sort(elements);

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    private void sort(int[] elements) {
        int n = elements.length;

        // build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(elements, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = elements[i];
            elements[i] = elements[0];
            elements[0] = temp;

            heapify(elements, i, 0);
        }

    }

    private void heapify(int[] elements, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && elements[left] > elements[largest]) {
            largest = left;
        }

        if (right < n && elements[right] > elements[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = elements[i];
            elements[i] = elements[largest];
            elements[largest] = temp;

            // recursively heapify the affected tree
            heapify(elements, n, largest);
        }
    }
}
