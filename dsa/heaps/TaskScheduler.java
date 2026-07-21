package dsa.heaps;
import java.util.*;

public class TaskScheduler {

    public static int leastInterval(char[] tasks,int n){

        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:tasks)
            map.put(c,map.getOrDefault(c,0)+1);

        PriorityQueue<Integer> maxHeap=
                new PriorityQueue<>((a,b)->b-a);

        maxHeap.addAll(map.values());

        int time=0;

        while(!maxHeap.isEmpty()){

            List<Integer> temp=new ArrayList<>();

            int cycle=n+1;

            while(cycle>0 && !maxHeap.isEmpty()){

                int freq=maxHeap.poll();

                if(freq>1)
                    temp.add(freq-1);

                time++;
                cycle--;
            }

            for(int f:temp)
                maxHeap.offer(f);

            if(maxHeap.isEmpty())
                break;

            time+=cycle;
        }

        return time;
    }

    public static void main(String[] args){

        char[] tasks={'A','A','A','B','B','B'};

        System.out.println(leastInterval(tasks,2));
    }
}
