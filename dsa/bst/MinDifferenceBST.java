package dsa.bst;
class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class MinDifferenceBST {

    static Integer prev = null;
    static int minDiff = Integer.MAX_VALUE;

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null)
            minDiff = Math.min(minDiff, root.val - prev);

        prev = root.val;

        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        inorder(root);

        System.out.println(minDiff);
    }
}
