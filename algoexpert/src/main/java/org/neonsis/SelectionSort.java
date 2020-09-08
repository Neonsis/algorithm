package org.neonsis;

import java.util.Arrays;

/*
    Implement Selection Sort algorithm
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Best: O(n^2) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            swap(array, minIdx, i);
        }
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
