package com.dmtryii;

/*
    Given a binary tree, write a function that returns the sum of the values of that tree.

    class Node {
        Node left;  // left node, or null
        Node right;  // right node, or null
        double value;
    },

    double sum(Node root)
 */

public class BinaryTree {
    public static double sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.value + sum(root.left) + sum(root.right);
    }

    class Node {
        Node left;
        Node right;
        double value;
    }
}
