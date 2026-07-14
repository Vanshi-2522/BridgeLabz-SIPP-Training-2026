package dsa.linkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseBetween {

    public static Node reverseBetween(Node head, int left, int right) {

        if (head == null)
            return null;

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        for (int i = 1; i < left; i++)
            prev = prev.next;

        Node curr = prev.next;

        for (int i = 0; i < right - left; i++) {

            Node temp = curr.next;

            curr.next = temp.next;

            temp.next = prev.next;

            prev.next = temp;
        }

        return dummy.next;
    }

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        display(head);

        head = reverseBetween(head, 2, 4);

        System.out.println("After Reverse:");
        display(head);
    }
}