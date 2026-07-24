package dsa.queues_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> queue = new ArrayDeque<>();

    public void submitJob(int id) {
        queue.addLast(id);
    }

    public void submitUrgentJob(int id) {
        queue.addFirst(id);
    }

    public int printNextJob() {

        if (queue.isEmpty()) {
            throw new RuntimeException("No Jobs Available");
        }

        return queue.removeFirst();
    }

    public void display() {
        System.out.println(queue);
    }

    public static void main(String[] args) {

        PrintQueue printer = new PrintQueue();

        printer.submitJob(101);
        printer.submitJob(102);
        printer.submitUrgentJob(999);

        printer.display();

        System.out.println("Printing Job : " + printer.printNextJob());

        printer.display();
    }
}

