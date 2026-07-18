package dsa.bst;
class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class SortedArrayToBST {

    static Node build(int[] arr, int left, int right) {

        if (left > right)
            return null;

        int mid = (left + right) / 2;

        Node root = new Node(arr[mid]);

        root.left = build(arr, left, mid - 1);

        root.right = build(arr, mid + 1, right);

        return root;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        Node root = build(arr, 0, arr.length - 1);

        inorder(root);
    }
}
