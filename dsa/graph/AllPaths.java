package dsa.graph;
import java.util.*;

public class AllPaths {

    public static List<List<Integer>> findAllPaths(
            Map<Integer,List<Integer>> graph,
            int source,
            int destination){

        List<List<Integer>> answer = new ArrayList<>();

        dfs(graph,source,destination,
                new ArrayList<>(),
                new HashSet<>(),
                answer);

        return answer;
    }

    private static void dfs(
            Map<Integer,List<Integer>> graph,
            int current,
            int destination,
            List<Integer> path,
            Set<Integer> visited,
            List<List<Integer>> answer){

        path.add(current);
        visited.add(current);

        if(current==destination){

            answer.add(new ArrayList<>(path));

        }else{

            for(int next:
                    graph.getOrDefault(current,
                            Collections.emptyList())){

                if(!visited.contains(next))
                    dfs(graph,next,destination,
                            path,visited,answer);
            }
        }

        path.remove(path.size()-1);
        visited.remove(current);
    }

    public static void main(String[] args){

        Map<Integer,List<Integer>> graph=new HashMap<>();

        graph.put(0,Arrays.asList(1,2));
        graph.put(1,Arrays.asList(3));
        graph.put(2,Arrays.asList(3));
        graph.put(3,new ArrayList<>());

        System.out.println(findAllPaths(graph,0,3));
    }
}