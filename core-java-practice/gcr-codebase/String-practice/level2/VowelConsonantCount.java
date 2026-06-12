import java.util.*;

public class VowelConsonantCount {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] res = count(s);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int[] count(String s){

        int v=0,c=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(isLetter(ch)){
                if(isVowel(ch)) v++;
                else c++;
            }
        }

        return new int[]{v,c};
    }

    public static boolean isLetter(char ch){
        return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
    }

    public static boolean isVowel(char ch){

        ch = Character.toLowerCase(ch);

        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}