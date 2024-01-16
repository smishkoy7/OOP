package DiscountStrategy;

public class LowAmountDiscountInterface implements DiscountInterface {
    float order;
    double salle;

    @Override
    public double calculateDiscount(double OrderAmount) {
        if (order <= 1000) {
            salle = (order * 0.05);
        }
        return salle;
    }
}
