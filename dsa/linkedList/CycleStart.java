package dsa.linkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CycleStart {

    public static Node findCycleStart(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        if (fast == null || fast.next == null)
            return null;

        slow = head;

        while (slow != fast) {

            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        Node start = findCycleStart(head);

        if (start != null)
            System.out.println("Cycle starts at: " + start.data);
        else
            System.out.println("No Cycle");
    }
}