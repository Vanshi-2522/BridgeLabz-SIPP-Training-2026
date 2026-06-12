import java.util.*;

public class ShortLong {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] w = split(s);
        int[] res = find(w);

        System.out.println(w[res[0]]);
        System.out.println(w[res[1]]);
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

    public static int[] find(String[] w){

        int min=0,max=0;

        for(int i=1;i<w.length;i++){
            if(w[i].length()<w[min].length()) min=i;
            if(w[i].length()>w[max].length()) max=i;
        }

        return new int[]{min,max};
    }
}