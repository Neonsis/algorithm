package org.neonsis.easy;

/*
    Given a bst and a target int K. The task is to find the node with minimum absolute difference with
    given target value K.
    BST:
          10
        /    \
       5      15
      / \    /  \
     2   5 13    22
    /        \
   1         14
*/

public class FindClosestValueInBST {

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

        int closestValueInBst = findClosestValueInBst(rootBst, 1);
        System.out.println(closestValueInBst);
    }

    // Recursion solution (log(n)) - time, (1) - space
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, Integer.MIN_VALUE);
    }

    public static int findClosestValueInBst(BST tree, int target, int closes) {
        if (tree == null) {
            return closes;
        }
        if (Math.abs(tree.value - target) < Math.abs(closes - target)) {
            closes = tree.value;
        }
        if (tree.value < target) {
            return findClosestValueInBst(tree.right, target, closes);
        } else {
            return findClosestValueInBst(tree.left, target, closes);
        }
    }

    // Simple tree traversal (log(n)) - time, (1) - space
    /*public static int findClosestValueInBst(BST tree, int target) {
        int closes = Integer.MIN_VALUE;
        BST current = tree;
        while (current != null) {
            if (Math.abs(current.value - target) < Math.abs(closes - target)) {
                closes = current.value;
            }
            if (current.value < target) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return closes;

    }*/

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
