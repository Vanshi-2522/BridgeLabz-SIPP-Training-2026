package dsa.hashing;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {

        String[] words = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
    }
}