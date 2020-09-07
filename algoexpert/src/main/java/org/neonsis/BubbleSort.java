package org.neonsis;

import java.util.Random;

/*
    Implement Bubble Sort algorithm
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = randomArray();
        bubbleSort(array);
    }

    private static int[] randomArray() {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    // Best: O(n) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space

    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
