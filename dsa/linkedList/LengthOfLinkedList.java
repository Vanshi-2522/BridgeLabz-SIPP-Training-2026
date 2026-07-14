package dsa.linkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LengthOfLinkedList {

    public static int length(Node head) {

        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Length = " + length(head));
    }
}
