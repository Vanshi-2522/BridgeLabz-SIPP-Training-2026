abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println(vehicleNumber + " - " + vehicleType);
    }
}

class Car extends Vehicle {

    private double dailyRate;

    public Car(String no, double rate) {
        super(no, "Car");
        dailyRate = rate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {

    private double dailyRate;

    public Bike(String no, double rate) {
        super(no, "Bike");
        dailyRate = rate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public Truck(String no, double rate, double charge) {
        super(no, "Truck");
        dailyRate = rate;
        loadingCharge = charge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Car car = new Car("UP01C1234", 1500);
        Bike bike = new Bike("UP02B5678", 500);
        Truck truck = new Truck("UP03T9999", 3000, 2000);

        car.displayVehicleInfo();
        System.out.println(car.calculateRentalCost(3));

        bike.displayVehicleInfo();
        System.out.println(bike.calculateRentalCost(3));

        truck.displayVehicleInfo();
        System.out.println(truck.calculateRentalCost(3));
    }
}