class Employee {

    public int employeeID;

    protected String department;

    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    public void display() {

        System.out.println(employeeID);

        System.out.println(department);
    }
}