package oops.Generics;

import java.util.ArrayList;
import java.util.List;

// Abstract Base Class
abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Different Item Types
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Grocery extends WarehouseItem {
    public Grocery(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}

// Generic Storage Class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Utility Class Using Wildcards
class WarehouseUtility {

    public static void displayItems(List<? extends WarehouseItem> items) {

        for (WarehouseItem item : items) {
            System.out.println(item);
        }

    }
}

// Main Class
public class WarehouseDemo {

    public static void main(String[] args) {

        // Electronics Storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        // Grocery Storage
        Storage<Grocery> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Grocery("Rice"));
        groceryStorage.addItem(new Grocery("Milk"));

        // Furniture Storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        System.out.println("Electronics:");
        WarehouseUtility.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtility.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}
