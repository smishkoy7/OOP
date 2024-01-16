package DiscountStrategy;

public abstract class DiscountStrategy implements DiscountInterface {
    @Override
    public double calculateDiscount(double orderAmount) {
        return 0;
    }
}
