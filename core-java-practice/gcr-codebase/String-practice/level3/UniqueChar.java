import java.util.*;

public class UniqueChar {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] res = unique(s);

        for(char c:res){
            if(c!=0) System.out.println(c);
        }
    }

    public static char[] unique(String s){

        char[] r = new char[s.length()];
        int k=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean f=true;

            for(int j=0;j<i;j++){
                if(s.charAt(j)==ch){
                    f=false;
                    break;
                }
            }

            if(f) r[k++]=ch;
        }

        return r;
    }
}