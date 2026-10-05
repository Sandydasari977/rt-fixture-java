package fixture;

public final class Pricing {
    private Pricing() {}

    /** Total after a coupon: SAVE10 takes 10% off orders of 50 or more. */
    public static double discountedTotal(double subtotal, String coupon) {
        if ("SAVE10".equals(coupon) && subtotal >= 50) {
            return Math.round(subtotal * 0.9 * 100) / 100.0;
        }
        return subtotal;
    }
}
