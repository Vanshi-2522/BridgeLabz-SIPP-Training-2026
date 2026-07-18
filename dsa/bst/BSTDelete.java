package dsa.bst;
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class BSTDelete {

    public static Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = delete(root.left, key);
        }

        else if (key > root.val) {
            root.right = delete(root.right, key);
        }

        else {

            // Case 1: Leaf node
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node successor = findMin(root.right);

            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    static Node findMin(Node node) {

        while (node.left != null)
            node = node.left;

        return node;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root = delete(root, 70);

        inorder(root);
    }
}
