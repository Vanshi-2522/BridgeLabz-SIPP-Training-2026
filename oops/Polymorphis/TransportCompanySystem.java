package oops.Polymorphis;

abstract class Vehicle {
    protected String vehicleNo;

    public Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    abstract double fuelCost(double km);
}

class Car extends Vehicle {

    public Car(String no) {
        super(no);
    }

    @Override
    double fuelCost(double km) {
        return km * 6;
    }
}

class Bus extends Vehicle {

    public Bus(String no) {
        super(no);
    }

    @Override
    double fuelCost(double km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    public Bike(String no) {
        super(no);
    }

    @Override
    double fuelCost(double km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    public ElectricCar(String no) {
        super(no);
    }

    @Override
    double fuelCost(double km) {
        return km * 2;
    }
}

public class TransportCompanySystem {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("C101"),
                new Bus("B201"),
                new Bike("BK301"),
                new ElectricCar("EC401")
        };

        for (Vehicle v : fleet) {

            System.out.println(
                    v.vehicleNo + " Cost = "
                            + v.fuelCost(100));

            if (v instanceof Car) {
                Car c = (Car) v;
            }
        }
    }
}