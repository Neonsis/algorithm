package org.neonsis;

/*
    Given an array of integers nums and and integer target, return the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(Arrays.toString(ints));
    }

    // HashSet solution (n) - time, (n) - space
    public static int[] twoSum(int[] sums, int target) {
        HashSet<Integer> allNumber = new HashSet<>();
        for (int sum : sums) {
            int currentSum = target - sum;
            if (allNumber.contains(currentSum)) {
                return new int[]{sum, currentSum};
            } else {
                allNumber.add(sum);
            }
        }
        return new int[]{};
    }

    // Pointer solution (n*log(n)) - time, (1) - space
    /*public static int[] twoSum(int[] sums, int target) {
        Arrays.sort(sums);
        int rPointer = sums.length - 1;
        int lPointer = 0;
        while (lPointer < rPointer) {
            int sum = sums[lPointer] + sums[rPointer];
            if (sum == target) {
                return new int[]{sums[rPointer], sums[lPointer]};
            } else if (sum > target) {
                rPointer--;
            } else {
                lPointer++;
            }
        }
        return new int[]{};
    }*/

    // Brute force solution (n^2) - time , (1) - space
    /*public static int[] twoSum(int[] sums, int target) {
        for (int i = 0; i < sums.length - 1; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] + sums[j] == target) {
                    return new int[]{sums[i], sums[j]};
                }
            }
        }
        return new int[]{};
    }*/
}
