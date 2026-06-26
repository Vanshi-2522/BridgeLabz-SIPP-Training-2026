package oops.Polymorphis;

abstract class Subscription {

    String subscriberName;
    String subscriptionId;

    public Subscription(
            String subscriberName,
            String subscriptionId) {

        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    abstract double calculateMonthlyCharge();
}

class BasicPlan extends Subscription {

    public BasicPlan(String n, String id) {
        super(n, id);
    }

    double calculateMonthlyCharge() {
        return 199;
    }
}

class PremiumPlan extends Subscription {

    public PremiumPlan(String n, String id) {
        super(n, id);
    }

    double calculateMonthlyCharge() {
        return 499;
    }
}

class FamilyPlan extends Subscription {

    public FamilyPlan(String n, String id) {
        super(n, id);
    }

    double calculateMonthlyCharge() {
        return 799;
    }
}

public class StreamingSubscriptionAnalyzer {

    public static void main(String[] args) {

        Subscription[] arr = {

                new BasicPlan("Rahul", "S1"),
                new PremiumPlan("Aman", "S2"),
                new FamilyPlan("Ritika", "S3")
        };

        double revenue = 0;

        Subscription expensive = arr[0];

        for (Subscription s : arr) {

            revenue +=
                    s.calculateMonthlyCharge();

            if (s.calculateMonthlyCharge()
                    > expensive.calculateMonthlyCharge()) {

                expensive = s;
            }
        }

        System.out.println(
                "Revenue = " + revenue);

        System.out.println(
                "Highest Plan = "
                        + expensive.subscriptionId);
    }
}
