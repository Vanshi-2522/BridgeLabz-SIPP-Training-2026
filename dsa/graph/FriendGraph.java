package dsa.graph;

import java.util.*;

public class FriendGraph {

    private Map<Integer, Set<Integer>> graph = new HashMap<>();

    public void addFriendship(int u, int v) {

        graph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        graph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    public boolean isFriend(int u, int v) {

        return graph
                .getOrDefault(u, Collections.emptySet())
                .contains(v);
    }

    public static void main(String[] args) {

        FriendGraph fg = new FriendGraph();

        fg.addFriendship(1, 2);
        fg.addFriendship(1, 3);
        fg.addFriendship(2, 4);

        System.out.println(fg.isFriend(1, 2));
        System.out.println(fg.isFriend(1, 4));
    }
}

