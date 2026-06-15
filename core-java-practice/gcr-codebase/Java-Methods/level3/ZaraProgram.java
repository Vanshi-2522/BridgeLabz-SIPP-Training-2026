public class ZaraProgram {

    public static int[][] data(int n){
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=(int)(Math.random()*90000)+10000;
            a[i][1]=(int)(Math.random()*10)+1;
        }
        return a;
    }

    public static double[][] calc(int[][] a){
        double[][] r = new double[a.length][3];

        for(int i=0;i<a.length;i++){
            double sal=a[i][0];
            int y=a[i][1];

            double bonus = y>5 ? sal*0.05 : sal*0.02;
            r[i][0]=sal;
            r[i][1]=sal+bonus;
            r[i][2]=bonus;
        }
        return r;
    }

    public static void main(String[] args){
        int[][] a = data(10);
        double[][] r = calc(a);

        for(double[] x:r){
            System.out.println(x[0]+" "+x[1]+" "+x[2]);
        }
    }
}