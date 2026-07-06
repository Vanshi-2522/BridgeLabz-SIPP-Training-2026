package dsa.sorting;
import java.util.*;

class Employee {
    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class EmployeeRanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] attendance = new int[n];

        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            attendance[i] = sc.nextInt();

        int k = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++)
            emp[i] = new Employee(ids[i], attendance[i]);

        Arrays.sort(emp, (a, b) -> {

            if (a.attendance != b.attendance)
                return b.attendance - a.attendance;

            return a.id - b.id;
        });

        for (int i = 0; i < k; i++)
            System.out.print(emp[i].id + " ");
    }
}
