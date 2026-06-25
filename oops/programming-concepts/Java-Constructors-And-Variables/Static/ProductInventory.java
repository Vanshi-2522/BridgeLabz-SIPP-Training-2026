class Product {

    private String productName;
    private double price;

    private static int totalProducts = 0;

    public Product(
            String productName,
            double price) {

        this.productName = productName;
        this.price = price;

        totalProducts++;
    }

    public void displayProductDetails() {

        System.out.println(
                productName + " "
                        + price);
    }

    public static void displayTotalProducts() {

        System.out.println(
                "Total Products = "
                        + totalProducts);
    }
}

public class ProductInventory {

    public static void main(String[] args) {

        new Product("Laptop", 50000);

        new Product("Mouse", 500);

        Product.displayTotalProducts();
    }
}