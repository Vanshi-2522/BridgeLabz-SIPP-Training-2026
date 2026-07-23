package dsa.graph;
import java.util.*;

public class UndirectedCycle {

    public static boolean hasCycle(
            Map<Integer,List<Integer>> graph,
            int n){

        Set<Integer> visited=new HashSet<>();

        for(int i=0;i<n;i++){

            if(!visited.contains(i)){

                if(dfs(graph,i,-1,visited))
                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(
            Map<Integer,List<Integer>> graph,
            int node,
            int parent,
            Set<Integer> visited){

        visited.add(node);

        for(int neighbor:
                graph.getOrDefault(node,
                        Collections.emptyList())){

            if(!visited.contains(neighbor)){

                if(dfs(graph,neighbor,node,visited))
                    return true;
            }

            else if(neighbor!=parent){

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=new HashMap<>();

        graph.put(0,Arrays.asList(1));
        graph.put(1,Arrays.asList(0,2));
        graph.put(2,Arrays.asList(1,3));
        graph.put(3,Arrays.asList(2,1));

        System.out.println(hasCycle(graph,4));
    }
}