import java.util.*;

public class SplitLength2D {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = split(s);
        String[][] res = build(words);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }

    public static int length(String s){
        int i=0;
        try{
            while(true){
                s.charAt(i);
                i++;
            }
        }catch(Exception e){
            return i;
        }
    }

    public static String[] split(String s){

        int n=1;
        for(int i=0;i<length(s);i++){
            if(s.charAt(i)==' ') n++;
        }

        String[] w = new String[n];
        int j=0,start=0;

        for(int i=0;i<=length(s);i++){
            if(i==length(s)||s.charAt(i)==' '){
                w[j++]=s.substring(start,i);
                start=i+1;
            }
        }

        return w;
    }

    public static String[][] build(String[] w){

        String[][] res = new String[w.length][2];

        for(int i=0;i<w.length;i++){
            res[i][0]=w[i];
            res[i][1]=String.valueOf(w[i].length());
        }

        return res;
    }
}