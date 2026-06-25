class Product {

    static double discount = 10;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {

        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {

        if (this instanceof Product) {

            double total = price * quantity;
            double finalPrice = total - (total * discount / 100);

            System.out.println(productID + " " + productName);
            System.out.println("Final Price: " + finalPrice);
        }
    }
}

public class ShoppingCartSystem {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 1000, 2);

        Product.updateDiscount(15);

        p1.display();
        p2.display();
    }
}