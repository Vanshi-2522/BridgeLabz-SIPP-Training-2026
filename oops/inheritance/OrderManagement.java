package oops.inheritance;

class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId,
            String orderDate,
            String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId,
            String orderDate,
            String trackingNumber,
            String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order(101, "01-01-2025");
        ShippedOrder o2 = new ShippedOrder(102,
                "02-01-2025",
                "TR123");
        DeliveredOrder o3 = new DeliveredOrder(
                103,
                "03-01-2025",
                "TR456",
                "05-01-2025");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
