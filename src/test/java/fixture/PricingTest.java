package fixture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PricingTest {
    @Test
    void noCouponKeepsTheSubtotal() {
        assertEquals(80.0, Pricing.discountedTotal(80, null));
    }
}
