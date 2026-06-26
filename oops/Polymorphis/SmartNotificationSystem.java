package oops.Polymorphis;

class Notification {

    String recipientName;
    String message;

    public Notification(String recipientName,
                        String message) {

        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {

    public EmailNotification(String name,
                             String msg) {
        super(name, msg);
    }

    @Override
    public void sendNotification() {
        System.out.println(
                "Email sent to "
                        + recipientName
                        + " : "
                        + message);
    }
}

class SMSNotification extends Notification {

    public SMSNotification(String name,
                           String msg) {
        super(name, msg);
    }

    @Override
    public void sendNotification() {
        System.out.println(
                "SMS sent to "
                        + recipientName
                        + " : "
                        + message);
    }
}

class PushNotification extends Notification {

    public PushNotification(String name,
                            String msg) {
        super(name, msg);
    }

    @Override
    public void sendNotification() {
        System.out.println(
                "Push Notification to "
                        + recipientName
                        + " : "
                        + message);
    }
}

public class SmartNotificationSystem {

    public static void main(String[] args) {

        Notification[] arr = {
                new EmailNotification("Rahul", "Welcome"),
                new SMSNotification("Aman", "OTP"),
                new PushNotification("Neha", "Offer")
        };

        for (Notification n : arr) {
            n.sendNotification();
        }
    }
}
