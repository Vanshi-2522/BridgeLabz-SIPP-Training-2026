// Item class
class Item {

    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode,
                String itemName,
                double price) {

        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Display item details
    public void displayDetails() {

        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    // Calculate total cost
    public double calculateTotalCost(int quantity) {
        return quantity * price;
    }
}

// Main class
public class InventoryItem {

    public static void main(String[] args) {

        Item item =
                new Item("I101",
                        "Keyboard",
                        1200);

        item.displayDetails();

        int quantity = 3;

        System.out.println(
                "Total Cost : "
                        + item.calculateTotalCost(quantity));
    }
}