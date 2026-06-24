package oops.interfaces;

interface FoodDelivery {

    void deliverFood();

    default void trackOrder() {
        System.out.println("Food order tracked.");
    }

    static String generateDeliveryCode() {
        return "FD1001";
    }
}

interface GroceryDelivery {

    void deliverGroceries();

    default void trackOrder() {
        System.out.println("Grocery order tracked.");
    }
}

class DeliveryExecutive
        implements FoodDelivery,
        GroceryDelivery {

    public void deliverFood() {
        System.out.println("Food Delivered.");
    }

    public void deliverGroceries() {
        System.out.println("Groceries Delivered.");
    }

    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
}

public class DeliveryPartnerSystem {

    public static void main(String[] args) {

        String[] customers = {
                "Rahul",
                "Priya",
                "Amit"
        };

        DeliveryExecutive executive =
                new DeliveryExecutive();

        for (String customer : customers) {

            System.out.println(
                    "\nCustomer: " + customer);

            executive.trackOrder();
            executive.deliverFood();
            executive.deliverGroceries();

            System.out.println(
                    "Code: "
                            + FoodDelivery
                            .generateDeliveryCode());
        }
    }
}
