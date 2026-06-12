// package core-java-practice.gcr-codebase.String-practice.level2;
import java.util.*;

public class findLength {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(findLen(s));
        System.out.println(s.length());
    }

    public static int findLen(String s){
        int i=0;

        try{
            while(true){
                s.charAt(i);
                i++;
            }
        }catch(StringIndexOutOfBoundsException e){
            return i;
        }
    }
    
}
