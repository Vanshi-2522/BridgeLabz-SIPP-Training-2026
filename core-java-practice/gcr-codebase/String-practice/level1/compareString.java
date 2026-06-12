// package core-java-practice.gcr-codebase.String-practice.level1;
import java.util.*;
public class compareString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("write 1st string");
        String s1 = sc.next();

        System.out.println("write 2nd string");
        String s2 = sc.next();

        System.out.println("By inbuilt equals(): "+ inbuilt(s1, s2));
        System.out.println("By charAt() method: "+charAtFun(s1, s2));
       

    }
    public static boolean inbuilt(String s1,String s2){
        if(s1.equals(s2)){
            return true;
        }
             return false;
        
    }

    public static boolean charAtFun(String s1,String s2){
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1!=n2){
            return false;
        }

        for(int i=0;i<n1;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;


    }
}
