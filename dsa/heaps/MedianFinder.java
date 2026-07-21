package dsa.heaps;
import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianFinder(){

        maxHeap=new PriorityQueue<>((a,b)->b-a);

        minHeap=new PriorityQueue<>();
    }

    public void addNumber(int num){

        if(maxHeap.isEmpty() || num<=maxHeap.peek())
            maxHeap.offer(num);

        else
            minHeap.offer(num);

        if(maxHeap.size()>minHeap.size()+1)
            minHeap.offer(maxHeap.poll());

        else if(minHeap.size()>maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian(){

        if(maxHeap.size()==minHeap.size())
            return (maxHeap.peek()+minHeap.peek())/2.0;

        return maxHeap.peek();
    }

    public static void main(String[] args){

        MedianFinder mf=new MedianFinder();

        mf.addNumber(1);
        mf.addNumber(2);

        System.out.println(mf.findMedian());

        mf.addNumber(3);

        System.out.println(mf.findMedian());
    }
}
