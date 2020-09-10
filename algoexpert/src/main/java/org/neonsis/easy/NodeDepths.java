package org.neonsis.easy;

/*
    Given a binary tree, find sum of depths from root node.
    BST:
          10
        /    \
       5      15
      / \    /  \
     2   5 13    22
    /        \
   1         14
*/

public class NodeDepths {

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

        int depths = calculateNodeDepths(rootBst);
        System.out.println(depths);
    }

    // Recursive solution (n) - time, (1) - space
    public static int calculateNodeDepths(BST node) {
        return calculateNodeDepths(node, 0);
    }

    public static int calculateNodeDepths(BST node, int sum) {
        if (node == null) return 0;
        int right = calculateNodeDepths(node.right, sum + 1);
        int left = calculateNodeDepths(node.left, sum + 1);
        return right + left + sum;
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
