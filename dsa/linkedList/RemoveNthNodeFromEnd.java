package dsa.linkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveNthNodeFromEnd {

    public static Node removeNth(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {

            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

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

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        display(head);

        head = removeNth(head, 2);

        System.out.println("After Removal:");
        display(head);
    }
}
