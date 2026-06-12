import java.util.*;

public class Palindrome {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(check1(s));
        System.out.println(check2(s,0,s.length()-1));
        System.out.println(check3(s));
    }

    public static boolean check1(String s){

        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }

        return true;
    }

    public static boolean check2(String s,int i,int j){

        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;

        return check2(s,i+1,j-1);
    }

    public static boolean check3(String s){

        char[] a=s.toCharArray();
        char[] r=new char[a.length];

        for(int i=0;i<a.length;i++){
            r[i]=a[a.length-1-i];
        }

        return Arrays.equals(a,r);
    }
}