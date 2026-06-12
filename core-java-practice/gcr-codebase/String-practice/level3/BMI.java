import java.util.*;

public class BMI {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }

        String[][] res = compute(data);

        for(int i=0;i<10;i++){
            System.out.println(res[i][0]+" "+res[i][1]+" "+res[i][2]+" "+res[i][3]);
        }
    }

    public static String[][] compute(double[][] d){

        String[][] r = new String[10][4];

        for(int i=0;i<10;i++){

            double w=d[i][0];
            double h=d[i][1]/100;

            double bmi=w/(h*h);

            r[i][0]=String.valueOf(d[i][0]);
            r[i][1]=String.valueOf(d[i][1]);
            r[i][2]=String.valueOf(bmi);

            if(bmi<18.5) r[i][3]="Under";
            else if(bmi<25) r[i][3]="Normal";
            else r[i][3]="Over";
        }

        return r;
    }
}