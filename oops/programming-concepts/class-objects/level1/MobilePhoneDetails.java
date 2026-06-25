// MobilePhone class
class MobilePhone {

    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand,
                       String model,
                       double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Display phone details
    public void displayDetails() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

// Main class
public class MobilePhoneDetails {

    public static void main(String[] args) {

        MobilePhone phone =
                new MobilePhone(
                        "Samsung",
                        "Galaxy S24",
                        79999);

        phone.displayDetails();
    }
}