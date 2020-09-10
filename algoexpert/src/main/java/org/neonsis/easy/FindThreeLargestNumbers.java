package org.neonsis.easy;

import java.util.Arrays;

/*
    Need to find three largest numbers in array. In result we should return sorted array of this three numbers
 */
public class FindThreeLargestNumbers {

    public static void main(String[] args) {
        int array[] = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] threeLargestNumbers = findThreeLargestNumbers(array);
        System.out.println(Arrays.toString(threeLargestNumbers));
    }

    // Comparison two array solution (n) - time, (1) - space
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : array) {
            updateLargest(threeLargest, num);
        }
        return threeLargest;
    }

    private static void updateLargest(int[] threeLargest, int num) {
        if (num > threeLargest[2]) {
            shiftAndUpdate(threeLargest, num, 2);
        } else if (num > threeLargest[1]) {
            shiftAndUpdate(threeLargest, num, 1);
        } else if (num > threeLargest[0]) {
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    private static void shiftAndUpdate(int[] array, int num, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                array[i] = num;
            } else {
                array[i] = array[i + 1];
            }
        }
    }
}
