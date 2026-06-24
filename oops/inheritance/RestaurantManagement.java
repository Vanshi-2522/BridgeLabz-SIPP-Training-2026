package oops.inheritance;

interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name +
                " is preparing food.");
    }
}

class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name +
                " is serving customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef("Aman", 1);
        Waiter waiter = new Waiter("Rohit", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
