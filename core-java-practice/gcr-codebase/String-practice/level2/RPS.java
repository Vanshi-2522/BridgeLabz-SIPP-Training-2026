import java.util.*;

public class RPS {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int u=0,c=0;

        for(int i=0;i<n;i++){

            int user = sc.nextInt();
            int comp = comp();

            int w = win(user,comp);

            if(w==1) u++;
            else if(w==-1) c++;
        }

        System.out.println(u);
        System.out.println(c);
    }

    public static int comp(){
        return (int)(Math.random()*3);
    }

    public static int win(int u,int c){

        if(u==c) return 0;
        if(u==0 && c==2) return 1;
        if(u==1 && c==0) return 1;
        if(u==2 && c==1) return 1;

        return -1;
    }
}