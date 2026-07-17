package dsa.hashing;

import java.util.*;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {
                "A123",
                "B456",
                "C789",
                "A123"
        };

        System.out.println(hasDuplicateToken(tokens));
    }
}
