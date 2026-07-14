package dsa.linkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveDuplicates {

    public static Node removeDuplicates(Node head) {

        Node curr = head;

        while (curr != null && curr.next != null) {

            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }

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

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);

        System.out.println("Original List:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        display(head);
    }
}