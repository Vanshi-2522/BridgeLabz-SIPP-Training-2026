package dsa.linkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertAtEnd {

    public static Node insert(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

        return head;
    }

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);

        head = insert(head, 30);

        display(head);
    }
}
