public class CalendarProgram {

    static String[] monthName = {
        "Jan","Feb","Mar","Apr","May","Jun",
        "Jul","Aug","Sep","Oct","Nov","Dec"
    };

    static int[] monthDays = {
        31,28,31,30,31,30,31,31,30,31,30,31
    };

    public static boolean leap(int y) {
        return (y%400==0)||(y%4==0&&y%100!=0);
    }

    public static int days(int m, int y) {
        if (m == 2 && leap(y)) return 29;
        return monthDays[m-1];
    }

    public static int firstDay(int m, int y) {
        int y1 = y - (14 - m)/12;
        int x = y1 + y1/4 - y1/100 + y1/400;
        int m1 = m + 12*((14 - m)/12) - 2;
        return (1 + x + (31*m1)/12)%7;
    }

    public static void main(String[] args) {
        int m = 7, y = 2005;

        int start = firstDay(m,y);
        int d = days(m,y);

        System.out.println(monthName[m-1] + " " + y);

        for(int i=0;i<start;i++) System.out.print("   ");

        for(int i=1;i<=d;i++){
            System.out.printf("%3d",i);
            if((i+start)%7==0) System.out.println();
        }
    }
}