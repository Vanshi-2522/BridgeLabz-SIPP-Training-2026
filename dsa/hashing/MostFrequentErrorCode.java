package dsa.hashing;
import java.util.*;

public class MostFrequentErrorCode {

    public static int mostFrequentErrorCode(int[] codes) {

        Map<Integer, Integer> frequency = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count = frequency.merge(code, 1, Integer::sum);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }

    public static void main(String[] args) {

        int[] codes = {500, 404, 500, 403, 500, 404};

        System.out.println(mostFrequentErrorCode(codes));
    }
}
