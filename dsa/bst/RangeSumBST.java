package dsa.bst;
class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class RangeSumBST {

    static int rangeSum(Node root, int low, int high) {

        if (root == null)
            return 0;

        if (root.val < low)
            return rangeSum(root.right, low, high);

        if (root.val > high)
            return rangeSum(root.left, low, high);

        return root.val +
               rangeSum(root.left, low, high) +
               rangeSum(root.right, low, high);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        System.out.println(rangeSum(root, 5, 15));
    }
}
