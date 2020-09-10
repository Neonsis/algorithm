package org.neonsis.easy;

public class BinarySearch {

    public static void main(String[] args) {
        int array[] = new int[]{0, 1, 21, 33, 45, 46, 61, 71, 72, 73};
        int i = binarySearch(array, 45);
        System.out.println(i);
    }

    // Recursive solution (log(n)) - time, (1) - space
    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        int potentialResult = array[middle];
        if (potentialResult == target) {
            return middle;
        } else if (potentialResult > target) {
            return binarySearch(array, target, left, middle - 1);
        } else {
            return binarySearch(array, target, middle + 1, right);
        }
    }

    // Naive solution (log(n)) - time, (1) - space
   /* public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            int potentialNumber = array[middle];
            if (potentialNumber == target) {
                return middle;
            } else if (potentialNumber > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }*/
}
