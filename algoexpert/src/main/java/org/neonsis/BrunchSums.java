package org.neonsis;

import java.util.ArrayList;
import java.util.List;

/*
    Given a bst, find sum of all brunches.
    BST:
          10
        /    \
       5      15
      / \    /  \
     2   5 13    22
    /        \
   1         14
*/

public class BrunchSums {
    public static void main(String[] args) {
        BST rootBst = new BST(10);
        BST bst = new BST(5);
        BST bst1 = new BST(5);
        BST bst2 = new BST(2);
        BST bst3 = new BST(1);
        BST bst4 = new BST(18);
        BST bst5 = new BST(13);
        BST bst6 = new BST(22);
        BST bst7 = new BST(14);

        rootBst.left = bst;
        bst.right = bst1;
        bst.left = bst2;
        bst2.left = bst3;
        rootBst.right = bst4;
        bst4.left = bst5;
        bst4.right = bst6;
        bst5.right = bst7;

        branchSums(rootBst);
    }

    // Recursive solution (n) - time, (n) - space
    public static List<Integer> branchSums(BST root) {
        List<Integer> sumsOfBranch = new ArrayList<>();
        calculateSum(root, 0, sumsOfBranch);
        return sumsOfBranch;
    }

    private static void calculateSum(BST node, int branchSum, List<Integer> sumsOfBranch) {
        if (node == null) return;

        int sumPerLayer = branchSum + node.value;
        if (node.left == null && node.right == null) {
            sumsOfBranch.add(sumPerLayer);
            return;
        }
        calculateSum(node.left, sumPerLayer, sumsOfBranch);
        calculateSum(node.right, sumPerLayer, sumsOfBranch);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
