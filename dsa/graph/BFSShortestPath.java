package dsa.graph;
import java.util.*;

public class BFSShortestPath {

    public static List<Integer> shortestPath(
            Map<Integer, List<Integer>> graph,
            int source,
            int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == destination)
                break;

            for (int neighbor :
                    graph.getOrDefault(node, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    parent.put(neighbor, node);
                    queue.offer(neighbor);
                }
            }
        }

        if (!visited.contains(destination))
            return Collections.emptyList();

        LinkedList<Integer> path = new LinkedList<>();

        Integer current = destination;

        while (current != null) {

            path.addFirst(current);
            current = parent.get(current);
        }

        return path;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2,3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList(5));

        System.out.println(shortestPath(graph,1,5));
    }
}