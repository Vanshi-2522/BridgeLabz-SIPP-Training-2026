// Circle class
class Circle {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display details
    public void displayDetails() {

        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " +
                calculateCircumference());
    }
}

// Main class
public class CircleArea {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        circle.displayDetails();
    }
}