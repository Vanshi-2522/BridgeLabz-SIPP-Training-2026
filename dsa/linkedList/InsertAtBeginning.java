package dsa.linkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertAtBeginning {

    public static Node insert(Node head, int value) {

        Node newNode = new Node(value);

        newNode.next = head;

        return newNode;
    }

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        head.next = new Node(30);

        head = insert(head, 10);

        display(head);
    }
}