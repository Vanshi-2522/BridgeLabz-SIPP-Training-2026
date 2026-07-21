package dsa.heaps;

import java.util.*;

public class MergeKSortedLists {

    static class Node{

        int value;
        int listIndex;
        int elementIndex;

        Node(int value,int listIndex,int elementIndex){
            this.value=value;
            this.listIndex=listIndex;
            this.elementIndex=elementIndex;
        }
    }

    public static List<Integer> merge(List<List<Integer>> lists){

        PriorityQueue<Node> minHeap=
                new PriorityQueue<>((a,b)->a.value-b.value);

        for(int i=0;i<lists.size();i++){

            if(!lists.get(i).isEmpty())
                minHeap.offer(new Node(
                        lists.get(i).get(0),
                        i,
                        0));
        }

        List<Integer> result=new ArrayList<>();

        while(!minHeap.isEmpty()){

            Node node=minHeap.poll();

            result.add(node.value);

            if(node.elementIndex+1<
                    lists.get(node.listIndex).size()){

                int next=node.elementIndex+1;

                minHeap.offer(new Node(
                        lists.get(node.listIndex).get(next),
                        node.listIndex,
                        next));
            }
        }

        return result;
    }

    public static void main(String[] args){

        List<List<Integer>> lists=new ArrayList<>();

        lists.add(Arrays.asList(1,4,5));
        lists.add(Arrays.asList(1,3,4));
        lists.add(Arrays.asList(2,6));

        System.out.println(merge(lists));
    }
}
