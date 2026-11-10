package com.ecommerce;

/**
 * Demonstration subsystem for detecting suspicious order amounts.
 * The amount limit is an example rule, not a real fraud detection system.
 */
public class IsFake {

    private static final double MAX_ALLOWED_AMOUNT = 10000.00;

    /**
     * Returns true for invalid amounts or amounts above the example limit.
     */
    public boolean isFake(double amount) {
        System.out.println("[IsFake] Checking order amount: $" + amount);
        return !Double.isFinite(amount) || amount <= 0 || amount > MAX_ALLOWED_AMOUNT;
    }
}
