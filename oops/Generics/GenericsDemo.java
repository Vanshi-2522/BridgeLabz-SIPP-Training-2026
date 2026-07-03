package oops.Generics;

import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

// Generic Repository
class Repository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}

// Generic Utility Methods
class GenericUtility {

    // Generic method with Comparable bound
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        if (arr == null || arr.length == 0)
            return null;

        T max = arr[0];

        for (T value : arr) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    // Wildcard method
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

// Main Class
public class GenericsDemo {

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> pair = new Pair<>("Laptop", 50000);
        System.out.println("Pair: " + pair);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());

        // findMax
        Integer[] numbers = {10, 50, 30, 80, 20};
        System.out.println("Maximum: " + GenericUtility.findMax(numbers));

        // Repository
        Repository<String> repository = new Repository<>();
        repository.add("Apple");
        repository.add("Banana");
        repository.add("Orange");

        System.out.println("\nRepository Data:");
        GenericUtility.printList(repository.getAll());

        // Wildcard Example
        List<Double> marks = Arrays.asList(85.5, 90.0, 78.5);

        System.out.println("\nMarks:");
        GenericUtility.printList(marks);
    }
}