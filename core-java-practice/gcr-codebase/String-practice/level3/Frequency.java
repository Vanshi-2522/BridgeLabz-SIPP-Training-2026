import java.util.*;

public class Frequency {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] r = freq(s);

        for(int i=0;i<r.length;i++){
            System.out.println(r[i][0]+" "+r[i][1]);
        }
    }

    public static String[][] freq(String s){

        int[] f = new int[256];

        for(int i=0;i<s.length();i++){
            f[s.charAt(i)]++;
        }

        String[][] r = new String[s.length()][2];
        int k=0;

        boolean[] vis = new boolean[256];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!vis[ch]){
                r[k][0]=String.valueOf(ch);
                r[k][1]=String.valueOf(f[ch]);
                vis[ch]=true;
                k++;
            }
        }

        return Arrays.copyOf(r,k);
    }
}