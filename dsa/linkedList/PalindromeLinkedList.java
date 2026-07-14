package dsa.linkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeLinkedList {

    public static Node reverse(Node head) {

        Node prev = null;

        while (head != null) {

            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
