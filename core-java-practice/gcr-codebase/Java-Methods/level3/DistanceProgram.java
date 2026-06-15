public class DistanceProgram {

    public static double dist(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double[] line(int x1,int y1,int x2,int y2){
        double m=(double)(y2-y1)/(x2-x1);
        double b=y1-m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args){
        System.out.println(dist(1,2,4,6));
        double[] r=line(1,2,4,6);
        System.out.println(r[0]+" "+r[1]);
    }
}