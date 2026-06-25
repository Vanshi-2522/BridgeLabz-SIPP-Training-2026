class Employee {

    static String companyName = "TCS";
    static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {

        this.id = id;
        this.name = name;
        this.designation = designation;

        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {

        if (this instanceof Employee) {
            System.out.println(companyName);
            System.out.println(id + " " + name + " " + designation);
        }
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Rahul", "Developer");
        Employee e2 = new Employee(2, "Aman", "Tester");

        e1.display();
        e2.display();

        Employee.displayTotalEmployees();
    }
}