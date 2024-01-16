package DiscountStrategy;

public class HighAmountDiscountInterface implements DiscountInterface {
    @Override
    public double calculateDiscount(double orderAmount) {
        return 0;
    }
}
