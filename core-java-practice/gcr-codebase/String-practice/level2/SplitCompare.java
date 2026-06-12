import java.util.*;

public class SplitCompare {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] manual = manualSplit(s);
        String[] built = s.split(" ");

        System.out.println(compare(manual, built));
    }

    public static int length(String s){
        int i = 0;
        try{
            while(true){
                s.charAt(i);
                i++;
            }
        } catch(Exception e){
            return i;
        }
    }

    public static String[] manualSplit(String s){

        int n = 1;
        for(int i=0;i<length(s);i++){
            if(s.charAt(i)==' ') n++;
        }

        String[] res = new String[n];
        int j=0, start=0;

        for(int i=0;i<=length(s);i++){
            if(i==length(s) || s.charAt(i)==' '){
                res[j++] = s.substring(start,i);
                start=i+1;
            }
        }

        return res;
    }

    public static boolean compare(String[] a, String[] b){
        if(a.length != b.length) return false;

        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }
}