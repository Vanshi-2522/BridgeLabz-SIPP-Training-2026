package dsa.heaps;
import java.util.PriorityQueue;

public class KthLargestStream {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestStream(int k) {
        this.k = k;
        minHeap = new PriorityQueue<>();
    }

    public int add(int value) {

        if (minHeap.size() < k)
            minHeap.offer(value);

        else if (value > minHeap.peek()) {
            minHeap.poll();
            minHeap.offer(value);
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        KthLargestStream stream = new KthLargestStream(3);

        System.out.println(stream.add(4));
        System.out.println(stream.add(5));
        System.out.println(stream.add(8));
        System.out.println(stream.add(2));
        System.out.println(stream.add(10));
    }
}
