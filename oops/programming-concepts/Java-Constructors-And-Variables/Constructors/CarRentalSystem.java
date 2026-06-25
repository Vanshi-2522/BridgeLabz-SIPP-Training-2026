class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(
            String customerName,
            String carModel,
            int rentalDays) {

        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {

        return rentalDays * 1500;
    }

    public void display() {

        System.out.println(
                customerName);

        System.out.println(
                carModel);

        System.out.println(
                "Cost = "
                        + calculateTotalCost());
    }
}

public class CarRentalSystem {

    public static void main(String[] args) {

        CarRental rental =
                new CarRental(
                        "Rahul",
                        "Creta",
                        4);

        rental.display();
    }
}