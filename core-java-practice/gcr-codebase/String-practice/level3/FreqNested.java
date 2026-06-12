import java.util.*;

public class FreqNested {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] r = freq(s);

        for(int i=0;i<r.length;i++){
            System.out.println(r[i][0]+" "+r[i][1]);
        }
    }

    public static String[][] freq(String s){

        char[] a = s.toCharArray();
        int n=a.length;

        String[][] r = new String[n][2];
        int k=0;

        for(int i=0;i<n;i++){

            if(a[i]=='0') continue;

            int c=1;

            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]='0';
                }
            }

            r[k][0]=String.valueOf(a[i]);
            r[k][1]=String.valueOf(c);
            k++;
        }

        return Arrays.copyOf(r,k);
    }
}