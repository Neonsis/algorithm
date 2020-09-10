package org.neonsis.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, find all triplets in the array that sum up to a given target value.
 * In other words, given an array arr and a target value target, return all triplets a, b, c such that a + b + c = target.
 * <p>
 * Input array: [7, 12, 3, 1, 2, -6, 5, -8, 6]
 * Target sum: 0
 */
public class ThreeSumNumber {

    public static void main(String[] args) {
        int[] arr = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        List<Integer[]> integers = countThreeSumNumber(arr, target);
        System.out.println(integers);
    }

    // O(n^2) time | O(n) space
    public static List<Integer[]> countThreeSumNumber(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer[]> returnedSum = new ArrayList<>();
        int currentIndex = 0;
        while (currentIndex < arr.length - 1) {
            int leftPointer = currentIndex + 1;
            int rightPointer = arr.length - 1;
            while (leftPointer < rightPointer) {
                int currentSum = arr[currentIndex] + arr[leftPointer] + arr[rightPointer];
                if (currentSum == target) {
                    returnedSum.add(new Integer[]{arr[currentIndex], arr[leftPointer], arr[rightPointer]});
                    leftPointer++;
                    rightPointer++;
                } else if (currentSum > target) {
                    rightPointer--;
                } else {
                    leftPointer++;
                }
            }
            currentIndex++;
        }
        return returnedSum;
    }
}
