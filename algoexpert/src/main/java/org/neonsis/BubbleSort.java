package org.neonsis;

import java.util.Arrays;
import java.util.Random;

/*
    Implement Bubble Sort algorithm
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = randomArray();
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] randomArray() {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            array[i] = Math.abs(random.nextInt() % 100);
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
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
