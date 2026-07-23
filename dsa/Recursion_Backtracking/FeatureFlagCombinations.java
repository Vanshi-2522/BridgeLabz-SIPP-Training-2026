package dsa.Recursion_Backtracking;

import java.util.*;

public class FeatureFlagCombinations {

    public static List<List<String>> generateFlagCombinations(String[] flags) {
        List<List<String>> result = new ArrayList<>();
        backtrack(flags, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String[] flags, int index,
                                  List<String> current,
                                  List<List<String>> result) {

        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current flag
        current.add(flags[index]);
        backtrack(flags, index + 1, current, result);

        // Undo
        current.remove(current.size() - 1);

        // Exclude current flag
        backtrack(flags, index + 1, current, result);
    }

    public static void main(String[] args) {
        String[] flags = {"DarkMode", "Checkout", "Search"};

        List<List<String>> ans = generateFlagCombinations(flags);

        for (List<String> list : ans)
            System.out.println(list);
    }
}
