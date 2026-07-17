package dsa.trees;
public class DeleteFolderTree {

    static class Node {

        String name;
        Node left, right;

        Node(String name) {
            this.name = name;
        }
    }

    static void deleteFolderTree(Node node) {

        if (node == null)
            return;

        deleteFolderTree(node.left);

        deleteFolderTree(node.right);

        System.out.println("Deleting " + node.name);
    }

    public static void main(String[] args) {

        Node root = new Node("Root");

        root.left = new Node("Documents");
        root.right = new Node("Pictures");

        root.left.left = new Node("Projects");
        root.left.right = new Node("Notes");

        deleteFolderTree(root);
    }
}