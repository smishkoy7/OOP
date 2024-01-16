package strategy;

public class MultiplyTenMapper implements NumberMapper {
    @Override
    public double mapNumber(double input) {
        return input * 10;
    }
}
