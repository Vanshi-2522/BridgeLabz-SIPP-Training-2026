package oops.interfaces;

interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return code.startsWith("SAVE")
                && CouponValidator.isLengthValid(code);
    }
}

public class CouponValidatorDemo {
    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "AB12",
                "SAVE50",
                "XYZ"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid");
            } else {
                System.out.println(coupon + " -> Invalid");
            }
        }
    }
}
