// Employee class
class Employee {

    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : " + salary);
    }
}

// Main class
public class EmployeeDetails {

    public static void main(String[] args) {

        Employee employee =
                new Employee("Rahul", 101, 50000);

        employee.displayDetails();
    }
}