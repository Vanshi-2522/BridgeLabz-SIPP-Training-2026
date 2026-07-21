package dsa.heaps;

import java.util.*;

class Point {

    int x;
    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class KClosestPoints {

    static int distance(Point p){
        return p.x*p.x+p.y*p.y;
    }

    public static List<Point> kClosest(Point[] points,int k){

        PriorityQueue<Point> maxHeap =
                new PriorityQueue<>(
                        (a,b)->distance(b)-distance(a));

        for(Point p:points){

            if(maxHeap.size()<k)
                maxHeap.offer(p);

            else if(distance(p)<distance(maxHeap.peek())){
                maxHeap.poll();
                maxHeap.offer(p);
            }
        }

        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args){

        Point[] points={
                new Point(1,3),
                new Point(-2,2),
                new Point(5,8)
        };

        List<Point> ans=kClosest(points,2);

        for(Point p:ans)
            System.out.println(p.x+" "+p.y);
    }
}
