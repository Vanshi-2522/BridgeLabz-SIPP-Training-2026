import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s,String t){

        if(s.length()==0 || t.length()==0)
            return "";

        Map<Character,Integer> need=new HashMap<>();

        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        Map<Character,Integer> window=new HashMap<>();

        int required=need.size();
        int formed=0;

        int start=0;
        int minLength=Integer.MAX_VALUE;
        int answerStart=0;

        for(int end=0;end<s.length();end++){

            char c=s.charAt(end);

            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c) &&
               window.get(c).intValue()==need.get(c).intValue()){

                formed++;
            }

            while(formed==required){

                if(end-start+1<minLength){

                    minLength=end-start+1;
                    answerStart=start;
                }

                char left=s.charAt(start);

                window.put(left,window.get(left)-1);

                if(need.containsKey(left) &&
                        window.get(left)<need.get(left)){

                    formed--;
                }

                start++;
            }
        }

        return minLength==Integer.MAX_VALUE
                ? ""
                : s.substring(answerStart,answerStart+minLength);
    }

    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}