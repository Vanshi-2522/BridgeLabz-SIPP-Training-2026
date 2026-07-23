package dsa.graph;

import java.util.*;

public class DirectedCycle {

    static final int WHITE=0;
    static final int GRAY=1;
    static final int BLACK=2;

    public static boolean hasCycle(
            Map<Integer,List<Integer>> graph,
            int n){

        int[] state=new int[n];

        for(int i=0;i<n;i++){

            if(state[i]==WHITE){

                if(dfs(graph,i,state))
                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(
            Map<Integer,List<Integer>> graph,
            int node,
            int[] state){

        state[node]=GRAY;

        for(int next:
                graph.getOrDefault(node,
                        Collections.emptyList())){

            if(state[next]==GRAY)
                return true;

            if(state[next]==WHITE){

                if(dfs(graph,next,state))
                    return true;
            }
        }

        state[node]=BLACK;

        return false;
    }

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=new HashMap<>();

        graph.put(0,Arrays.asList(1));
        graph.put(1,Arrays.asList(2));
        graph.put(2,Arrays.asList(0));

        System.out.println(hasCycle(graph,3));
    }
}