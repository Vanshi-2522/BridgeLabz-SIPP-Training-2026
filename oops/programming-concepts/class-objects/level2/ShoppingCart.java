// CartItem class
class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName,
                    double price) {

        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    // Add item
    public void addItem(int qty) {

        quantity += qty;

        System.out.println(
                qty + " item(s) added.");
    }

    // Remove item
    public void removeItem(int qty) {

        if (qty <= quantity) {

            quantity -= qty;

            System.out.println(
                    qty + " item(s) removed.");
        } else {

            System.out.println(
                    "Not enough quantity available.");
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        return quantity * price;
    }

    // Display cart details
    public void displayCart() {

        System.out.println("Item Name : "
                + itemName);

        System.out.println("Price : "
                + price);

        System.out.println("Quantity : "
                + quantity);

        System.out.println("Total Cost : "
                + calculateTotalCost());
    }
}

// Main class
public class ShoppingCart {

    public static void main(String[] args) {

        CartItem item =
                new CartItem(
                        "Laptop",
                        50000);

        item.addItem(2);

        item.removeItem(1);

        item.displayCart();
    }
}