package dsa.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DesignLinkedList {

    Node head;

    // Insert at beginning
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Delete by value
    public void delete(int value) {

        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != value) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
    }

    // Search
    public boolean search(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == value)
                return true;

            temp = temp.next;
        }

        return false;
    }

    // Display
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DesignLinkedList list = new DesignLinkedList();

        list.insertFirst(20);
        list.insertFirst(10);

        list.insertLast(30);
        list.insertLast(40);

        System.out.println("Linked List:");
        list.display();

        list.delete(30);

        System.out.println("After Deletion:");
        list.display();

        System.out.println("Search 40: " + list.search(40));
    }
}