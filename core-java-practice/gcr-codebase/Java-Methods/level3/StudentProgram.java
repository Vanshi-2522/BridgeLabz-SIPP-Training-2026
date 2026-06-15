public class StudentProgram {

    public static int[][] gen(int n){
        int[][] a=new int[n][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                a[i][j]=(int)(Math.random()*100);

        return a;
    }

    public static double[][] calc(int[][] a){
        double[][] r=new double[a.length][3];

        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<3;j++) sum+=a[i][j];

            double avg=sum/3.0;
            double per=avg;

            r[i][0]=sum;
            r[i][1]=Math.round(avg*100.0)/100.0;
            r[i][2]=Math.round(per*100.0)/100.0;
        }
        return r;
    }

    public static void main(String[] args){
        int[][] a=gen(5);
        double[][] r=calc(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" | "+r[i][0]+" "+r[i][1]+" "+r[i][2]);
        }
    }
}