package org.neonsis;

/*
Write a function that determines whether an array is a subsequence of another array.
A subsequence is a set of numbers that are not necessarily adjacent to each other in the second array but appear in the
same order as in the first array. For example, the array [3, 5, 2] is valid a subsequence of the array [1, 3, 4, 5, 6, 2].
*/

import java.io.FileNotFoundException;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> array = List.of(5, 1, 22, 2, 5, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        boolean validSubsequence = isValidSubsequence(array, sequence);
        System.out.println(validSubsequence);
    }


    // Pointer solution (n) - time, (1) - space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }


    // Brute force solution (n^2) - time , (1) - space
    /*public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int position = 0;
        for (Integer integer : sequence) {
            for (int j = position; j < array.size(); j++) {
                if (integer.equals(array.get(j))) {
                    position = j;
                    break;
                } else if (j + 1 == array.size()) {
                    return false;
                }
            }
        }
        return true;
    }*/
}
