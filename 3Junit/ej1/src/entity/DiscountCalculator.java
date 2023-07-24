package entity;

public class DiscountCalculator {
    private final double discountPercentage;

    public DiscountCalculator(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double calculateDiscount(double originalPrice) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }

        double discountAmount = originalPrice * (discountPercentage / 100);
        return originalPrice - discountAmount;
    }
}
