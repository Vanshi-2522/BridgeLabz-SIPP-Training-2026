import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {

    public static int length(String s){

        Map<Character,Integer> map=new HashMap<>();

        int start=0;
        int max=0;

        for(int end=0;end<s.length();end++){

            char ch=s.charAt(end);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>1){

                char left=s.charAt(start);

                map.put(left,map.get(left)-1);

                start++;
            }

            max=Math.max(max,end-start+1);
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(length("abcabcbb"));
    }
}