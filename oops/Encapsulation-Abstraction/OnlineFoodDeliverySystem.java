abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName,
                    double price,
                    int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void displayItemDetails() {
        System.out.println(itemName +
                " Price:" + price +
                " Qty:" + quantity);
    }
}

class VegItem extends FoodItem {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {

    private double serviceCharge = 50;

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + serviceCharge;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        FoodItem veg =
                new VegItem("Paneer", 200, 2);

        FoodItem nonVeg =
                new NonVegItem("Chicken", 300, 2);

        veg.displayItemDetails();
        System.out.println(veg.calculateTotalPrice());

        nonVeg.displayItemDetails();
        System.out.println(nonVeg.calculateTotalPrice());
    }
}