package dsa.bst;

import java.util.HashSet;

class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class TwoSumBST {

    static HashSet<Integer> set = new HashSet<>();

    static boolean findPair(Node root, int target) {

        if (root == null)
            return false;

        if (findPair(root.left, target))
            return true;

        if (set.contains(target - root.val))
            return true;

        set.add(root.val);

        return findPair(root.right, target);
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        System.out.println(findPair(root, 9));
    }
}
