package oops.Generics;

import java.util.ArrayList;
import java.util.List;

// Base Category
abstract class Category {
    String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}

// Categories
class BookCategory extends Category {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends Category {
    public ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends Category {
    public GadgetCategory() {
        super("Gadgets");
    }
}

// Generic Product Class
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Product : " + name);
        System.out.println("Category: " + category);
        System.out.println("Price   : " + price);
        System.out.println();
    }
}

// Generic Method
class Marketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);

        product.setPrice(newPrice);
    }
}

// Main
public class MarketplaceDemo {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 800, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> mobile =
                new Product<>("Smartphone", 30000, new GadgetCategory());

        Marketplace.applyDiscount(book,10);
        Marketplace.applyDiscount(shirt,20);
        Marketplace.applyDiscount(mobile,5);

        book.display();
        shirt.display();
        mobile.display();
    }
}
